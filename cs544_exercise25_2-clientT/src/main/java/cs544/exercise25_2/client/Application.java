package cs544.exercise25_2.client;

import cs544.exercise25_2.service.IGreeting;
import cs544.exercise25_2.service.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StopWatch;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		IGreeting remoteService = context.getBean("greetingHttpInvokerProxy", IGreeting.class);
                StopWatch watch = new StopWatch();
                

		Person person = new Person("John", "Doe");
		String result = remoteService.getMessage(person);
		watch.start();
                System.out.println("Receiving result: " + result);
                watch.stop();
                System.out.println("Total time: " + watch.getLastTaskTimeMillis());
	}
}
