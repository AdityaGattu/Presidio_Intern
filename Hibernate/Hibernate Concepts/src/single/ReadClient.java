package single;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadClient {
	public static void main(String[] args) {

		Configuration cfg=new Configuration().configure();
		
		SessionFactory factory= cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		BookPojo book=(BookPojo)session.get(BookPojo.class,Integer.valueOf(1));
		
		System.out.println(book);
		System.out.println(book.getComment());
	}
}
