/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.amp2.deparmentemployee;

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
            Department d1= new Department();
            Department d2= new Department();
            
            d1.setName("Production");
            d2.setName("Distribution");
            
            Employee emp1= new Employee();
            emp1.setName("Ayalew");
            emp1.setDepartment(d1);
            
            Employee emp2= new Employee();
            emp2.setName("Michael");
            emp2.setDepartment(d2);
            
            d1.empList.add(emp1);
             d2.empList.add(emp2);
 
            
            session.persist(emp1);
session.persist(emp2);
            session.getTransaction().commit();
        }

        try (Session session  = sessionFactory.openSession()) {
            session.beginTransaction();

            // retieve all cars and their respective owners 
            @SuppressWarnings("unchecked")
            List<Department> departmentList = session.createQuery("from Department").list();
            for (Department department : departmentList) {
                System.out.println("brand= " +department.getName() + ", Employee= "
                        + department.empList.get(0).getName());
            }
            session.getTransaction().commit();
        }

        // Close the SessionFactory (best practice)
        tearDown();
    }
}
