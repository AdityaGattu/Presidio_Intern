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
		//shop.sellShoe(customer);
		shop.test();
		
		Exporter exporter=(Exporter)shop;
		exporter.doExport();
		ctx.close();
	}
}
