package invoicepack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

import utility.HibernateUtility;

public class InvoiceDAOImpl implements InvoiceDAO,Cloneable{
	
	public InvoiceDAOImpl() {
	}
	
	private static InvoiceDAOImpl obj;
	
	synchronized public static InvoiceDAOImpl getInvoiceDAOImpl(){
		if(obj==null)
		{
			return new InvoiceDAOImpl();
		}
		return obj.getClone();
	}
	
	private InvoiceDAOImpl getClone() {
		
		try {
			return (InvoiceDAOImpl)super.clone();
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	

	@Override
	public InvoiceDTO getIvoice(int invid) {
		// TODO Auto-generated method stub
		
		Session session=HibernateUtility.getSession();
		InvoiceDTO invoice=(InvoiceDTO) session.get(InvoiceDTO.class, session);
		HibernateUtility.closeSession(null);
		return invoice;
	}

	@Override
	public List<InvoiceDTO> getAllInvoice() {
		
		List<InvoiceDTO> result =new ArrayList<InvoiceDTO>();
		try {
			Session session=HibernateUtility.getSession();
			Query query=session.createQuery("select * from invoice");
			List list=query.list();
			Iterator<InvoiceDTO>customer=list.iterator();
			
			while(customer.hasNext()) {
				InvoiceDTO inv=(InvoiceDTO)customer.next();
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
	public void createInvoice(InvoiceDTO i) {
		try {
			Session session=HibernateUtility.getSession();
			session.save(i);
			HibernateUtility.closeSession(null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}

	@Override
	public void updateInvoice(InvoiceDTO i) {
		try {
			Session session=HibernateUtility.getSession();
			Query query=session.createQuery("update invoice set invid=:invid,invdate=:invdate where cid=:cid");
			query.setParameter("invid", i.getInvid());
			query.setParameter("invdate", i.getInvdate());
			query.setParameter("cid", i.getCid());
			int rows_updated=query.executeUpdate();
			System.out.println(rows_updated+" rows updated.........");
			HibernateUtility.closeSession(null);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteInvoice(InvoiceDTO i) {
		try {
			Session session=HibernateUtility.getSession();
			Query query=session.createQuery("delete from invoice where cid=:cid");
			query.setParameter("cid", i.getCid());
			int rows_deleted=query.executeUpdate();
			System.out.println(rows_deleted+" rows deleted.........");
			HibernateUtility.closeSession(null);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteInvoiceById(int invid) {
		try {
			Session session=HibernateUtility.getSession();
			Query query=session.createQuery("delete from invoice where cid=:cid");
			query.setParameter("cid", invid);
			int rows_deleted=query.executeUpdate();
			System.out.println(rows_deleted+" rows updated.........");
			HibernateUtility.closeSession(null);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
