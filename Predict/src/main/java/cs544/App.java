package cs544;

 
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context
                = new ClassPathXmlApplicationContext("springconfig.xml");
        A a = context.getBean("a", A.class);
        a.doSomething();
        context.close();
    }
}
