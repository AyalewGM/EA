package cs544.hpa1;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class AppCar {

    private static EntityManagerFactory entityFactory;

    /* Reads hibernate.cfg.xml and prepares Hibernate for use     */
    protected static void setUp() throws Exception {
        // A SessionFactory is set up once for an application!
//        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
//                .configure()
//                .build();
entityFactory= Persistence.createEntityManagerFactory("cs544.hibernet.intro.jpa");
        
    }

    protected static void tearDown() throws Exception {
     entityFactory.close();
    }

    public static void main(String[] args) throws Exception {
        setUp();

       EntityManager em = entityFactory.createEntityManager();
       em.getTransaction().begin();
       
       Car car= new Car();
       car.setBrand("Audi");
       car.setPrice(440000);
       em.persist(car);
       em.getTransaction().commit();
      em.close();
      em= entityFactory.createEntityManager();
        em.getTransaction().begin();
             
            List<Car> carList = em.createQuery("from Car").getResultList();
            for (Car car1 : carList) {
                System.out.println("brand= " + car1.getBrand() + ", year= "
                        + car1.getYear() + ", price= " + car1.getPrice());
            }
            em.getTransaction().commit();
        

        // Close the SessionFactory (best practice)
        tearDown();
    }
}

