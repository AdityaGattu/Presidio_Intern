package daopack;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class ItemMasterDAOImpl implements ItemMasterDAO{
	@Override
	public ItemDTO findByID(Integer itemid) {
		
		Connection con=DBUtility.getConnection();
	    
		ItemDTO rs=new ItemDTO();
		try {
		Statement stmt=con.createStatement();
		
		  ResultSet res=stmt.executeQuery("select * from items where itemid="+itemid+" ");
		  
		  while(res.next()) {
			  rs.setItemid(res.getInt(1));
			  rs.setItem_name(res.getString("item_name"));
			  rs.setPrice(res.getInt(3));
		  }
		  DBUtility.closeConnection(null, null);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public List<ItemDTO> findAll() {
		// TODO Auto-generated method stub
		
		ArrayList<ItemDTO> arr=new ArrayList<>();
		
		Connection con=DBUtility.getConnection();
		
		try {
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from items");
		
		 while(rs.next()) {
			 ItemDTO obj=new ItemDTO();
			 obj.setItemid(rs.getInt(1));
			 obj.setItem_name(rs.getString("item_name"));
			 obj.setPrice(rs.getInt(3));
			 
			 arr.add(obj);
			 
		 }
		 st.close();
		 rs.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return arr;
	}

	@Override
	public int insertItem(ItemDTO itemDTO) {
		
		int i = 0;
		Connection con=DBUtility.getConnection();
		try {
		Statement stmt=con.createStatement();
		int x=itemDTO.getItemid();
		String y=itemDTO.getItem_name();
		float p=itemDTO.getPrice();
		
		i=stmt.executeUpdate("insert into items values("+x+",'"+y+"',"+p+")");
		System.out.println(i+" items updated.....");
	
		DBUtility.closeConnection(null, null);
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return i;
	}

	@Override
	public int updateItem(ItemDTO itemDTO) {
		
		int j=0;
		Connection con=DBUtility.getConnection();
		
		try {
			Statement stmt=con.createStatement();
			
			int x=itemDTO.getItemid();
			String y=itemDTO.getItem_name();
			float p=itemDTO.getPrice();
			
			j=stmt.executeUpdate("update items set item_name='"+y+"',price='"+p+"' where itemid="+x+" ");
			System.out.println(j+" rows updated....");
			
			DBUtility.closeConnection(null, null);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return j;
	}

	@Override
	public int deleteItemByID(Integer itemid) {
		// TODO Auto-generated method stub
		
		int j=0;
		Connection con=DBUtility.getConnection();
		
		try {
			Statement stmt=con.createStatement();
			
			int x=itemid;
			
			j=stmt.executeUpdate("delete from items where itemid="+x+" ");
			System.out.println(j+" rows deleted....");
			
			DBUtility.closeConnection(null, null);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return j;
	}

	@Override
	public int deleteItemByDTO(ItemDTO itemDTO) {
		// TODO Auto-generated method stub
		
		
		int j=0;
		Connection con=DBUtility.getConnection();
		
		try {
			Statement stmt=con.createStatement();
			
			int x=itemDTO.getItemid();
			String y=itemDTO.getItem_name();
			float p=itemDTO.getPrice();
			
			j=stmt.executeUpdate("delete from items where  itemid="+x+" and item_name='"+y+"' and price='"+p+"'  ");
			System.out.println(j+" rows updated....");
			
			DBUtility.closeConnection(null, null);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return j;
		
		
	}
}
