package annopack.mone2manypack;

import java.util.Collection;
import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Client1Reading {
public static void main(String[] args) {
	SessionFactory factory = 
			new AnnotationConfiguration().
			configure("hibernate.anno.cfg.xml").buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Employee emp=(Employee)session.get(Employee.class,new Integer(100));
		Collection col=emp.getAddresses();
		Iterator iter=col.iterator();
		while(iter.hasNext())
		{
			Address add=(Address)iter.next();
			System.out.println(add.getStreet());
		}
		
}
}
