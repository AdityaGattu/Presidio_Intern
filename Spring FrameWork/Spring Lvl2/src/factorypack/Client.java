package factorypack;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		
		ShoeSeller shop=(ShoeSeller)ctx.getBean("advisedShop");
		Customer customer=new Customer();
		customer.setName("ramu");
		Shoe shoe=shop.sellShoe(customer);
		System.out.println(shoe);
		shop.sellShoe(customer);
		ctx.close();
	}
}

/*
sibi shoe shop created...
bats shoe factory object created...
setter method of shoe shop called...
set up init method called....
Welcome to my shoe shop....:ramu
Thankyou ...:ramu visit again....
factorypack.LeatherShoe@3e2055d6
Welcome to my shoe shop....:ramu
only one shoe per customer....Only one shoe per customer....
Exception in thread "main" java.lang.reflect.UndeclaredThrowableException
*/