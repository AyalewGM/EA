/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.cxm1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author Ayu
 */
public class AppointmentApp {
     private static SessionFactory sessionFactory;

    /* Reads hibernate.cfg.xml and prepares Hibernate for use     */
    protected static void setUp() throws Exception {
        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }

    protected static void tearDown() throws Exception {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }

    public static void main(String[] args) throws Exception {
        setUp();

        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();                 

Doctor doctor = new Doctor("Family", "Michael", "Z");
Patient patient = new Patient("Ayalew","100 Maharishi Street ", "1000", "New York");


            
            
            
 

            session.persist(doctor);
            session.persist(patient);
           // session.persist(emp2);
            session.getTransaction().commit();
        }

//        try (Session session = sessionFactory.openSession()) {
//            session.beginTransaction();
//
//            // retieve all cars and their respective owners 
//            @SuppressWarnings("unchecked")
//            List<Customer> customerList = session.createQuery("from Customert").list();
//            for (Customer customer : customerList) {
//                System.out.println("name= " + customer.getFirstName() + " "+ customer.getLastName()+ ","+ "Order Date= "
//                        + customer.getOrders().get(0).getDate());
//            }
//            session.getTransaction().commit();
//        }
//
//        // Close the SessionFactory (best practice)
//        tearDown();
    }

}
