package comppack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import utility.HibernateUtility;

public class CompkeyClient {
	public static void main(String[] args) {
		SessionFactory factory = 
				new AnnotationConfiguration().configure("hibernate.anno.cfg.xml").buildSessionFactory();
			
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
		Invoice inv=new Invoice();
		CompKey ck=new CompKey();
		ck.setInv_id(1001);
		ck.setItem_id(20001);
		inv.setCompkey(ck);
		
		inv.setDetails("bla bla bla");
		
		session.save(inv);
		session.beginTransaction().commit();
	}
}
