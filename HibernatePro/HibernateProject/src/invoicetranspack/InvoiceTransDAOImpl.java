package invoicetranspack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import invoicepack.InvoiceDTO;
import utility.HibernateUtility;

public class InvoiceTransDAOImpl implements InvoiceTransDAO,Cloneable {
	
	public InvoiceTransDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	private static InvoiceTransDAOImpl obj;
	
	synchronized public static InvoiceTransDAOImpl getInvoiceTransDAOImpl() {
		if(obj==null){
			return new InvoiceTransDAOImpl();
		}
		return obj.getClone();
	}
	
	private InvoiceTransDAOImpl getClone() {
		
		try {
			return (InvoiceTransDAOImpl)super.clone();
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public InvoiceTransDTO getInvoice(int invid) {
		// TODO Auto-generated method stub
		
		
		Session session=HibernateUtility.getSession();
		InvoiceTransDTO invoice=(InvoiceTransDTO)session.get(InvoiceTransDTO.class, session);
		HibernateUtility.closeSession(null);
		return invoice;
		
		
	}

	@Override
	public List<InvoiceTransDTO> getAllInvoice() {
		
		List<InvoiceTransDTO> result =new ArrayList<InvoiceTransDTO>();
		try {
			Session session=HibernateUtility.getSession();
			Query query=session.createQuery("select * from invoicetrans");
			List list=query.list();
			Iterator<InvoiceTransDTO>customer=list.iterator();
			
			while(customer.hasNext()) {
				InvoiceTransDTO inv=(InvoiceTransDTO)customer.next();
				result.add(inv);
			}
			HibernateUtility.closeSession(null);
			return result;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public void createInvoiceTrans(InvoiceTransDTO t) {
		try {
			Session session=HibernateUtility.getSession();
			session.save(t);
			HibernateUtility.closeSession(null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateInvoiceTrans(InvoiceTransDTO t) {
		
		try {
			Session session=HibernateUtility.getSession();
			Query query=session.createQuery("update invoicetrans set itemid=:itemid,qty=:qty where invid=:invid");
			query.setParameter("invid", t.getInvid());
			
			int rows_updated=query.executeUpdate();
			System.out.println(rows_updated+" rows updated.........");
			HibernateUtility.closeSession(null);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteInvoiceTrans(InvoiceTransDTO t) {
		try {
			Session session=HibernateUtility.getSession();
			Query query=session.createQuery("delete from invoicetrans where invid=:invid");
			query.setParameter("invid", t.getInvid());
			int rows_deleted=query.executeUpdate();
			System.out.println(rows_deleted+" rows deleted.........");
			HibernateUtility.closeSession(null);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteInvoiceTransById(int invid) {
		try {
			Session session=HibernateUtility.getSession();
			Query query=session.createQuery("delete from invoicetrans where invid=:invid");
			query.setParameter("invid", invid);
			int rows_deleted=query.executeUpdate();
			System.out.println(rows_deleted+" rows deleted.........");
			HibernateUtility.closeSession(null);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	
	

}
