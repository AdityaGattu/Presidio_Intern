package day19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
		// TODO Auto-generated method stub
		
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from customer where cid=?");
			
			ps.setInt(1, cid);
			ResultSet rs=ps.executeQuery();
			
			CustomerDTO obj=CustomerDTO.getCustomerDTO();
			while(rs.next()) {
				obj.setCid(rs.getInt(1));
				obj.setCno(rs.getInt(2));
				obj.setCname(rs.getString("cname"));
				obj.setCaddress(rs.getString("caddress"));
				obj.setCaccountdetails(rs.getString("caccountdetails"));
			}
			
			ps.close();
			con.close();
			return obj;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<CustomerDTO> getAllCustomers() {
		
		List<CustomerDTO>list =new ArrayList<CustomerDTO>();
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from customer");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				CustomerDTO c=CustomerDTO.getCustomerDTO();
				c.setCid(rs.getInt(1));
				c.setCno(rs.getInt(2));
				c.setCname(rs.getString("cname"));
				c.setCaddress(rs.getString("caddress"));
				c.setCaccountdetails(rs.getString("caccountdetails"));
				list.add(c);
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
	public int createCustomer(CustomerDTO c) {
		
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into customer values(?,?,?,?,?)");
			ps.setInt(1,c.getCid());
			ps.setInt(2,c.getCno());
			ps.setString(3,c.getCname());
			ps.setString(4,c.getCaddress());
			ps.setString(5,c.getCaccountdetails());
			
			int rows_inserted=ps.executeUpdate();
			ps.close();
			con.close();
			return rows_inserted;
		}
		catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int updateCustomer(CustomerDTO c) {
		
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("update customer set cno=?,cname=?,caddress=?,caccountdetails=? where cid=?");
			
			ps.setInt(1,c.getCno());
			ps.setString(2,c.getCname());
			ps.setString(3,c.getCaddress());
			ps.setString(4,c.getCaccountdetails());
			ps.setInt(5,c.getCid());
			
			int rows_updated=ps.executeUpdate();
			ps.close();
			con.close();
			return rows_updated;
		}
		catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int deleteCustomer(CustomerDTO c) {
		
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from customer where cid=?");
			ps.setInt(1,c.getCid());
			
			int rows_deleted=ps.executeUpdate();
			ps.close();
			con.close();
			return rows_deleted;
		}
		catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int deleteCustomerById(int id) {
		
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from customer where cid=?");
			ps.setInt(1,id);
			
			int rows_deleted=ps.executeUpdate();
			ps.close();
			con.close();
			return rows_deleted;
		}
		catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	

}
