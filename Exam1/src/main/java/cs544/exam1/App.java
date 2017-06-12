package cs544.exam1;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
      // create service and add two bikes
        BikeRentalService service = new BikeRentalService();
        service.addBike(new Bike("mountain bike", 12));
        service.addBike(new Bike("city bike", 10));
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm");
// rent a bike
        String name1 = "Normal Guy";
        double downpay = service.calcDownPay(1, name1);
        System.out.println("Pay to rent for " + name1 + " " + downpay);
        service.rentBike(1, downpay, df.parse("01/18/2016 10:00"), name1, "123-4321");
// return the rented bike
        double amount = service.returnBike(1, name1, df.parse("01/18/2016 12:00"));
        System.out.println("return amount for " + name1 + " " + amount);
    }
}
