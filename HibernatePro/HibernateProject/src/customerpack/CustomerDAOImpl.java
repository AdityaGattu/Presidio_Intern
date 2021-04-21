package customerpack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import utility.HibernateUtility;

public class CustomerDAOImpl implements CustomerDAO,Cloneable{
	
	public CustomerDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	private static CustomerDAOImpl obj;
	
	synchronized public CustomerDAOImpl getCustomerDAOImpl() {
		if(obj==null) {
			return new CustomerDAOImpl();
		}
		return obj.getClone();
	}
	
	private CustomerDAOImpl getClone() {
		try {
			return (CustomerDAOImpl)super.clone();
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
			
		}
	}
	

	@Override
	public CustomerDTO getCustomerById(int cid) {
		
		try {
			
			Session session=HibernateUtility.getSession();
			CustomerDTO customer=(CustomerDTO)session.get(CustomerDTO.class, cid);
			HibernateUtility.closeSession(null);
			return customer;
			
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<CustomerDTO> getAllCustomers() {
		
		List<CustomerDTO>result =new ArrayList<CustomerDTO>();
		try {
			Session session=HibernateUtility.getSession();
			Query query=session.createQuery("select * from customer");
			
			List list=query.list();
			Iterator<CustomerDTO>customer=list.iterator();
			
			while(customer.hasNext()) {
				CustomerDTO cust=(CustomerDTO)customer.next();
				result.add(cust);
			}
			HibernateUtility.closeSession(null);

			return result;
		}
		catch(Exception e) {
			e.printStackTrace();
			return result;
		}
	}

	@Override
	public void createCustomer(CustomerDTO c) {
		
		try {
			Session session=HibernateUtility.getSession();
			session.save(c);
			HibernateUtility.closeSession(null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateCustomer(CustomerDTO c) {
		
		try {
			Session session=HibernateUtility.getSession();
			Query query=session.createQuery("update customer set cno=:cno,cname=:cname,caddress=:cadd where cid=:cid");
			query.setParameter("cno", c.getCno());
			query.setParameter("cname", c.getCname());
			query.setParameter("caddress", c.getCaddress());
			query.setParameter("cid", c.getCid());
			int rows_updated=query.executeUpdate();
			System.out.println(rows_updated+" rows updated.........");
			HibernateUtility.closeSession(null);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteCustomer(CustomerDTO c) {
		
		try {
			Session session=HibernateUtility.getSession();
			Query query=session.createQuery("delete from customer where cid=:cid");
			query.setParameter("cid", c.getCid());
			int rows_deleted=query.executeUpdate();
			System.out.println(rows_deleted+" rows deleted.........");
			HibernateUtility.closeSession(null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteCustomerById(int id) {
		
		try {
			Session session=HibernateUtility.getSession();
			Query query=session.createQuery("delete from customer where cid=:cid");
			query.setParameter("cid", id);
			int rows_deleted=query.executeUpdate();
			System.out.println(rows_deleted+" rows deleted.........");
			HibernateUtility.closeSession(null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
