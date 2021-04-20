package inherpack;

import org.hibernate.Session;

import utility.HibernateUtility;

public class InherClient {
	public static void main(String[] args) {
		ShoeFactory factory=new ShoeFactory();
		factory.setShoeName("shoe shoe shoe...");
		
		BataShoeFactory bsf=new BataShoeFactory();
		bsf.setShoeName("bshoe bshoe bshoe.....");
		bsf.setBataName("bata bata bata...");
		
		LakhaniShoeFactory lsf=new LakhaniShoeFactory();
		lsf.setShoeName("lshoe lshoe lshoe..");
		lsf.setLakhaniName("lakki lakki lakki....");
		
		Session session=HibernateUtility.getSession();
		session.save(factory);
		session.save(bsf);
		session.save(lsf);
		
		HibernateUtility.closeSession(null);
	}
}
