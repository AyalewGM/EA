/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.imp1.b;

import cs544.imp1.a.*;
 
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
public class App {

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

            SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
            Date d1 = format.parse("01/01/1990");
            Date d2 = format.parse("02/01/2016");

            Customer customer = new Customer("Ayalew", "Mersha");

            Order order = new Order(d2);
            OrderLine line = new OrderLine();
            Product product = new Product("Bike ", "Mountain Bike ");
            line.setProduct(product);
            order.addOrderLines(line);
                       
            customer.addOrder(order);
            
            
 

            session.persist(customer);
           // session.persist(emp2);
            session.getTransaction().commit();
        }

        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            // retieve all cars and their respective owners 
            @SuppressWarnings("unchecked")
            List<Customer> customerList = session.createQuery("from Customert").list();
            for (Customer customer : customerList) {
                System.out.println("name= " + customer.getFirstName() + " "+ customer.getLastName()+ ","+ "Order Date= "
                        + customer.getOrders().get(0).getDate());
            }
            session.getTransaction().commit();
        }

        // Close the SessionFactory (best practice)
        tearDown();
    }

}
