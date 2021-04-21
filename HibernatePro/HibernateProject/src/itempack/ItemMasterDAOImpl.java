package itempack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import utility.HibernateUtility;

public class ItemMasterDAOImpl{
		

	public ItemDTO findByID(Integer itemid) {
		
		Session session=HibernateUtility.getSession();
		ItemDTO item=(ItemDTO)session.get(ItemDTO.class,itemid);
		return item;
	}


	public List<ItemDTO> findAll() {
		
		Session session=HibernateUtility.getSession();
		Query query=session.createQuery("from item");
		
		List list=query.list();
		Iterator<ItemDTO>items=list.iterator();
		
		List<ItemDTO>res=new ArrayList<ItemDTO>();
		while(items.hasNext()) {
			ItemDTO i=(ItemDTO)items.next();
			res.add(i);
		}
		return res;
	}

	public void insertItem(ItemDTO itemDTO) {
		
		Session session=HibernateUtility.getSession();
		session.save(itemDTO);
		HibernateUtility.closeSession(null);
		
	}

	public void updateItem(ItemDTO itemDTO) {
		
		Session session=HibernateUtility.getSession();
		
		Query query=session.createQuery("update item set item_name=:name, item_unit=:unit, price=:price where itemid=:id");
		query.setParameter("name", itemDTO.getItem_name());
		query.setParameter("unit", itemDTO.getItem_unit());
		query.setParameter("price", itemDTO.getPrice());
		query.setParameter("id", itemDTO.getItemid());
		
		int rows_updated=query.executeUpdate();
		System.out.println(rows_updated+"rows updated......");
		
		HibernateUtility.closeSession(null);
	}

	public void deleteItemByID(Integer itemid) {
		
		
		Session session=HibernateUtility.getSession();
		
		Query query=session.createQuery("delete from item where itemid=:id");
		query.setParameter("id", itemid);
		
		int rows_updated=query.executeUpdate();
		System.out.println(rows_updated+"rows updated......");
		
		HibernateUtility.closeSession(null);
		
	}

	public void deleteItemByDTO(ItemDTO itemDTO) {
		
		Session session=HibernateUtility.getSession();
		Query query=session.createQuery("delete from item where itemid=:id");
		query.setParameter("id", itemDTO.getItemid());
		
		int rows_updated=query.executeUpdate();
		System.out.println(rows_updated+"rows updated......");
		
		HibernateUtility.closeSession(null);
		
		
	}

}
