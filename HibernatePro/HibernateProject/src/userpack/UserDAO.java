package userpack;

import org.hibernate.Query;
import org.hibernate.Session;

import utility.HibernateUtility;

public class UserDAO {
	
	
	public UserDAO() {
		
	}
	
	public void createUser(UserDTO user) {
		
		try {
			Session s=HibernateUtility.getSession();
			s.save(user);
			HibernateUtility.closeSession(null);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void updateUser(UserDTO u) {		
		
		try {
			Session session=HibernateUtility.getSession();
			
			Query query = session.createQuery("update user set username=:uname where userid=:uid");
			query.setParameter("uname", u.getUsername());
			query.setParameter("uid", u.getUserid());
			
			int result = query.executeUpdate();
			System.out.println(result+" rows updated......");

			HibernateUtility.closeSession(null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteUser(UserDTO u) {		
		
		try {
			Session session=HibernateUtility.getSession();
			
			Query query = session.createQuery("delete from user u where u.userid=:userid");
			query.setParameter("userid", u.getUserid());
			int result = query.executeUpdate();
			System.out.println(result+" rows deleted......");

			HibernateUtility.closeSession(null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


	
	
}
