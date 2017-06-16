package cs544.exercise23_1.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import cs544.exercise23_1.server.IGreeting;
//import cs544.exercise23_1.server.Person;
//import cs544.exercise23_1.server.ICalculate;
import cs544.exercise23_1.server.*;

public class RMIClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"springconfigclient.xml");
		ICalculate remoteServer = context
				.getBean("helloserver", ICalculate.class);
//		Person person = new Person("John", "Doe");
		
                Pair pair = new Pair(6,'+');
                int result = remoteServer.calc(pair);
		System.out.println("Receiving result: " + result);
	}

}
