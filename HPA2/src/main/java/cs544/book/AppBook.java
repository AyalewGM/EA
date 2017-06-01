/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.book;

import cs544.hpa1.Car;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
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
 
 


public class AppBook{

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
// Open a session
// Create 3 books save them to the database
// Close the session
            
            Book book1 = new Book(  "Frankenstein", "093452-34", "Mary Jo", 23.34, d1 );
          
            session.persist(book1);
        
             Book book2 = new Book(  "Introducton to Hibernet ", "093452-234", "Michael", 23.34, d1 );
           
            session.persist(book2);
             
             Book book3 = new Book(  "Java for Funy People ", "093231-234", "Michael", 32.90, d2 );
            
            session.persist(book3);
            
            
            session.getTransaction().commit();
        }

        try (Session session  = sessionFactory.openSession()) {
            session.beginTransaction();

            // retieve all cars
            @SuppressWarnings("unchecked")
            List<Book> bookList = session.createQuery("from Book").list();
            for (Book book : bookList) {
                System.out.println("Title= " + book.getTitle() + ", Publication Year= "
                        + book.getPublish_date() + ", price= " + book.getPrice());
            }
            session.getTransaction().commit();
        }

        // Close the SessionFactory (best practice)
        tearDown();
    }
}

