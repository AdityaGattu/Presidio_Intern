package day19;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class ItemMasterDAOImpl implements ItemMasterDAO{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
//		Connection con=DBUtility.getConnection();
//		
//		try {
//		Statement stmt=con.createStatement();
//	
//		int i=stmt.executeUpdate("create table items (itemid int(5),item_name varchar(20),item_unit varchar(20),price float(10))");
//		System.out.println(i+" rows updated.....");
//		
//		int i=stmt.executeUpdate("insert into items values(1,'aloo',2,20)");
//		System.out.println(i+" rows updates.....");
//		DBUtility.closeConnection(null, null);
//		
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
		int yes=1;
		while(yes==1) {
		System.out.println("Enter the option .........\n1.insertItem \t2.updateItem \t3.deleteItemByID \t4.deleteItemByDTO \n5.findByID \t6.findAll");
		int option =s.nextInt();
		
		switch (option) {
			case 1: {
				System.out.println("Enter the item details to be inserted.......");

				
				System.out.println("enter item id to be inserted....");
				int id=s.nextInt();
				
		
				System.out.println("enter item name to be inserted....");
				String name=s.next();
				
		
				System.out.println("enter item units to be inserted....");
				String unit=s.next();
				
				System.out.println("enter item price to be inserted....");
				int price=s.nextInt();
				
				ItemDTO item1=new ItemDTO();
				
				
				item1.setItemid(id);
				item1.setItem_name(name);
				item1.setItem_unit(unit);
				item1.setPrice(price);
				
				int k=new ItemMasterDAOImpl().insertItem(item1);
				System.out.println(k+" items inserted into table........");break;
			
			}
			case 2:{
				
				
				System.out.println("Enter the item detalis to be updated.......");
				System.out.println("enter item id to be updated....");
				int id=s.nextInt();
				
				System.out.println("enter item name to be updated....");
				String name=s.next();
				
				System.out.println("enter item units to be updated....");
				String unit=s.next();
				
				System.out.println("enter item price to be updated....");
				int price=s.nextInt();
				
				ItemDTO item2=new ItemDTO();
				
				item2.setItemid(id);
				item2.setItem_name(name);
				item2.setItem_unit(unit);
				item2.setPrice(price);
	
				int no_updates=new ItemMasterDAOImpl().updateItem(item2);
				System.out.println(no_updates+" items updated into table........");
				break;
			}
				
			
			case 3:{
				
				System.out.println("Enter the itemid to be deleted.....");
				int item_id=s.nextInt();
				
				int no_del=new ItemMasterDAOImpl().deleteItemByID(item_id);
				System.out.println(no_del+" items deleted from table.......");
				break;
			}
			
			case 4:{
				
				System.out.println("Enter the item details to be deleted.......");
				System.out.println("enter item id to be deleted....");
				int id=s.nextInt();
				
				System.out.println("enter item name to be deleted....");
				String name=s.next();
				
				System.out.println("enter item units to be deleted....");
				String unit=s.next();
				
				System.out.println("enter item price to be deleted....");
				int price=s.nextInt();
				
				ItemDTO item3=new ItemDTO();
				
				item3.setItemid(id);
				item3.setItem_name(name);
				item3.setItem_unit(unit);
				item3.setPrice(price);
	
				int no_del=new ItemMasterDAOImpl().deleteItemByDTO(item3);
				System.out.println(no_del+" items updated into table........");
				break;
				
			}
			
			case 5:{
				
				System.out.println("Enter  the item id to be searched in table.....");
				int item_id=s.nextInt();
				ItemDTO found=new ItemMasterDAOImpl().findByID(item_id);
				System.out.println(" items found is ........\n"+found);
				
			}
			
			case 6:{
				System.out.println("find lll elements in table items........");
				List<ItemDTO>answer=new ArrayList<ItemDTO>();
				answer=new ItemMasterDAOImpl().findAll();
				
				for(int i=0;i<answer.size();i++) {
					ItemDTO itm=answer.get(i);
					System.out.println(itm);
				}
			}
		 }
		  System.out.println("Do u want to continue.....press 1");
		  yes=s.nextInt();
	    }
	}

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
			  rs.setItem_unit(res.getString("item_unit"));
			  rs.setPrice(res.getInt(4));
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
			 obj.setItem_unit(rs.getString("item_unit"));
			 obj.setPrice(rs.getInt(4));
			 
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
		String z=itemDTO.getItem_unit();
		float p=itemDTO.getPrice();
		
		i=stmt.executeUpdate("insert into items values("+x+",'"+y+"','"+z+"',"+p+")");
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
			String z=itemDTO.getItem_unit();
			float p=itemDTO.getPrice();
			
			j=stmt.executeUpdate("update items set item_name='"+y+"',item_unit='"+z+"',price='"+p+"' where itemid="+x+" ");
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
			String z=itemDTO.getItem_unit();
			float p=itemDTO.getPrice();
			
			j=stmt.executeUpdate("delete from items where  itemid="+x+" and item_name='"+y+"' and item_unit='"+z+"' and price='"+p+"'  ");
			System.out.println(j+" rows updated....");
			
			DBUtility.closeConnection(null, null);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return j;
		
		
	}

}
