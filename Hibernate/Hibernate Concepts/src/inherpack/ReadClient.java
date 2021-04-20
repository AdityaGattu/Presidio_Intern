package inherpack;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import utility.HibernateUtility;

public class ReadClient {
	public static void main(String[] args) {
		Session session=HibernateUtility.getSession();
		
		Query query= session.createQuery("from ShoeFactory");
		
		List<ShoeFactory> factory=query.list();
		
		for(ShoeFactory sf:factory) {
//			if(sf instanceof BataShoeFactory) {
//				BataShoeFactory
//			}
//			else if(sf instanceof ShoeFactory) {
//				
//			}
//			else if(sf instanceof LakhaniShoeFactory) {
//				
//			}
			System.out.println(sf);
		}
		
	}
}
