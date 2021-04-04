package day19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

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
		InvoiceDTO i=null;
		try {
			
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from invoicemaster from where invid=?");
			ps.setInt(1, invid);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				i.setInvid(rs.getInt(1));
				i.setCid(rs.getInt(2));
				i.setInvdate(rs.getDate("invdate"));
				
			}
			
			return i;
		}
		catch(Exception e) {
			e.printStackTrace();
			return i;
		}
	}

	@Override
	public List<InvoiceDTO> getAllInvoice() {
		
		List<InvoiceDTO> list =new ArrayList<InvoiceDTO>();
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from invoicemaster");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				InvoiceDTO io=InvoiceDTO.getIvInvoiceDTO();
				io.setInvid(rs.getInt(1));
				io.setCid(rs.getInt(2));
				io.setInvdate(rs.getDate("invdate"));
				list.add(io);
			}
			return list;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public int createInvoice(InvoiceDTO i) {
		
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into invoicemaster where invid=?,cid=?,invdate=?");
			ps.setInt(1, i.getInvid());
			ps.setInt(2, i.getCid());
			ps.setDate(3, i.getInvdate());
			int rows_updated=ps.executeUpdate();
			return rows_updated;
		}
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int updateInvoice(InvoiceDTO i) {
		
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("update invoicemaster set cid=?,invdate=? where invid=?");
			ps.setInt(1, i.getCid());
			ps.setDate(2, i.getInvdate());
			ps.setInt(3, i.getCid());
			
			int rows_updated=ps.executeUpdate();
			return rows_updated;
		}
		catch (Exception e) {
			e.printStackTrace();		
			return 0;
		}
	}

	@Override
	public int deleteInvoice(InvoiceDTO i) {
		
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from invoicemaster where  invid=?,cid=?,invdate=? ");
			ps.setInt(1, i.getCid());
			ps.setInt(2, i.getCid());
			ps.setDate(3, i.getInvdate());
			
			int rows_deleted=ps.executeUpdate();
			return rows_deleted;
			
		}
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public int deleteInvoiceById(int invid) {
		
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from invoicemaster where invid=?");
			ps.setInt(1, invid);
			int rows_deleted=ps.executeUpdate();
			return rows_deleted;
		}
		catch (Exception e) {
			e.printStackTrace();	
			return 0;
		}
		
	}
	
	
}
