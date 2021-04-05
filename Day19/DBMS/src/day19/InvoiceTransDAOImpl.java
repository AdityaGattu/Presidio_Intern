package day19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
		
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from invoicetrans where invid=?");
			ps.setInt(1, invid);
			
			ResultSet rs=ps.executeQuery();
			InvoiceTransDTO t=InvoiceTransDTO.getInvoiceTransDTO();
			while(rs.next()) {
				t.setInvid(rs.getInt(1));
				t.setItemid(rs.getInt(2));
				t.setQty(rs.getInt(3));
			}
			con.close();
			ps.close();
			return t;
		
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
			
		}
		
		
	}

	@Override
	public List<InvoiceTransDTO> getAllInvoice() {
		
		List<InvoiceTransDTO> list =new ArrayList<InvoiceTransDTO>();
		
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from invoicetrans");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				InvoiceTransDTO ob=InvoiceTransDTO.getInvoiceTransDTO();
				ob.setInvid(rs.getInt(1));
				ob.setItemid(rs.getInt(2));
				ob.setQty(rs.getInt(3));
				list.add(ob);
			}
			ps.close();
			con.close();
			return list;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int createInvoiceTrans(InvoiceTransDTO t) {
		
		try {
			Connection con=DBUtility.getConnection();
		
			PreparedStatement ps=con.prepareStatement("insert into invoicetrans values (?,?,?) ");
			ps.setInt(1, t.getInvid());
			ps.setInt(2, t.getItemid());
			ps.setInt(3,t.getQty());
			
			int no_rows=ps.executeUpdate();
			ps.close();
			con.close();
			return no_rows;
			
		}
		catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int updateInvoiceTrans(InvoiceTransDTO t) {
		
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("update invoicetrans set itemid=?,qty=? where invid=? ");
			
			ps.setInt(1, t.getItemid());
			ps.setInt(2,t.getQty());
			ps.setInt(3, t.getInvid());
			
			int no_rows=ps.executeUpdate();
			ps.close();
			con.close();
			
			return no_rows;
			
		}
		catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int deleteInvoiceTrans(InvoiceTransDTO t) {
		
		try {
			Connection con=DBUtility.getConnection();
			
			PreparedStatement ps=con.prepareStatement("delete from invoicetrans where invid=?,itemid=?,qty=? ");

			ps.setInt(1, t.getInvid());
			ps.setInt(2, t.getItemid());
			ps.setInt(3,t.getQty());
			
			int no_rows_deleted=ps.executeUpdate();
			ps.close();
			con.close();
			return no_rows_deleted;
			
		}
		catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int deleteInvoiceTransById(int invid) {
		
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from invoicetrans where invid=? ");

			ps.setInt(1, t.getInvid());
			
			int no_rows_deleted=ps.executeUpdate();
			ps.close();
			con.close();
			return no_rows_deleted;
			
		}
		catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	

}
