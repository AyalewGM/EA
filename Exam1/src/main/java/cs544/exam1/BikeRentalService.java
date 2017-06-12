/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.exam1;

/**
 *
 * @author Ayu
 */
class BikeRentalService {

    private SessionFactory sf = HibernateUtil.getSessionFactory();
    private BikeDao bikeDao;
    private RentalDao rentalDao;

    public BikeRentalService() {
        this.bikeDao = new BikeDao();
        this.rentalDao = new RentalDao();
    }

    public void addBike(Bike bike) {
        Transaction tx = sf.getCurrentSession().beginTransaction();
        bikeDao.create(bike);
        tx.commit();
    }

    public double calcDownPay(int bikeId, String name) {
        Transaction tx = sf.getCurrentSession().beginTransaction();
        Bike bike = bikeDao.get(bikeId);
        tx.commit();
        return bike.getHourlyRate() * 3;
    }

    public boolean rentBike(int bikeId, double downpay, Date start, String name, String phone) {
        Transaction tx = sf.getCurrentSession().beginTransaction();
        Bike bike = bikeDao.get(bikeId);
        boolean result = false
        if (bike.getLatest() == null || bike.getLatest().getStop() != null) {
            Customer customer = new Customer(name, phone);
            Rental r = new Rental(bike, customer, start, downpay);
            bike.addRental(r);
            result = true;
        }
        tx.commit();
        return result;
    }

    public double returnBike(int bikeId, String name, Date stop) {
        Transaction tx = sf.getCurrentSession().beginTransaction();
        Bike b = bikeDao.get(bikeId);
        Rental r = b.getLatest();
        r.setStop(stop);
        int duration = Math.round((stop.getTime() - r.getStart().getTime()) / (1000 * 60 * 60));
        double amount = duration * b.getHourlyRate();
        r.setIncome(amount);
        tx.commit();
        return amount - r.getDownpay();
    }
}
