package cs544.bank;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Collection;

import cs544.bank.domain.Account;
import cs544.bank.domain.AccountEntry;
import cs544.bank.domain.Customer;
import cs544.bank.service.AccountService;
import cs544.bank.service.IAccountService;


public class App {
	public static void main(String[] args) {
          new ClassPathXmlApplicationContext("springconfig.xml");
			
	}
}


