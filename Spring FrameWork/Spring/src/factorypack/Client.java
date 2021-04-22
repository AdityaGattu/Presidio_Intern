package factorypack;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		
		SibiShoeShop shop=(SibiShoeShop)ctx.getBean("shop");
//		ctx.getBean("shop");
//		ctx.getBean("shop");
//		
		Shoe shoe=shop.sellShoe();		
		System.out.println(shoe);
		
//		System.out.println(shop.getMylist());
//		System.out.println(shop.getValue());
		
		ctx.close();
	}
}

/* o/p:
INFO: Loading XML bean definitions from class path resource [config.xml]
sibi shoe shop created...
bats shoe factory object created...
setter method of shoe shop called...
set up init method called....
factorypack.LeatherShoe@5ddeb7cb
[aaaaaaa, bbbbbbb]
hello world....
Apr 22, 2021 11:25:38 AM org.springframework.context.support.AbstractApplicationContext doClose
INFO: Closing org.springframework.context.support.ClassPathXmlApplicationContext@2473b9ce: startup date [Thu Apr 22 11:25:37 IST 2021]; root of context hierarchy
destroy method called....
*/