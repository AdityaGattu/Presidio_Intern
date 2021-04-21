package itempack;

import java.util.List;

public class ItemClient {


	public static void main(String[] args) {
		
//		ItemDTO item=new ItemDTO();
//		item.setItemid(5);
//		item.setItem_name("apple");
//		item.setPrice(50);
//		item.setItem_unit("2");
//		
		//ItemMasterDAOImpl obj=new ItemMasterDAOImpl();	
		//obj.insertItem(item);
		//.................................................................
//		List<ItemDTO>list =obj.findAll();
//		
//		for(ItemDTO it:list) {
//			System.out.println(it);
//		}
		//ItemDTO [itemid=5, item_name=apple, item_unit=2, price=50.0]
		
		//................................................................
//		ItemDTO item1=new ItemDTO();
//		item1.setItemid(5);
//		item1.setItem_name("mango");
//		item1.setPrice(500);
//		item1.setItem_unit("3");
//		ItemMasterDAOImpl obj=new ItemMasterDAOImpl();
//		obj.updateItem(item1);
		
		//Hibernate: update item set item_name=?, item_unit=?, price=? where itemid=?
		//1rows updated......
		
		//.................................................................
		
		ItemMasterDAOImpl obj=new ItemMasterDAOImpl();
		ItemDTO item2=new ItemDTO();
		item2.setItemid(5);
		item2.setItem_name("mango");
		item2.setPrice(500);
		item2.setItem_unit("3");
		obj.deleteItemByDTO(item2);
		
	}
}
