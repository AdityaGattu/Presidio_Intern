package single;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SingleClient {
	public static void main(String[] args) {
		
		BookPojo book=new BookPojo();
		book.setBname("java");
		book.setBauthor("james");
		book.setPrice(300);
		book.setComment(new Comment("I love java..."));
		
		
		Configuration cfg=new Configuration().configure();
		
		SessionFactory factory= cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		session.save(book);//now book object is hibernate aware...
		
		session.beginTransaction().commit();
		
	}
}
