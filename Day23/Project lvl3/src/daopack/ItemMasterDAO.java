package daopack;

import java.util.List;

public interface ItemMasterDAO {
	public ItemDTO findByID(Integer itemid);
	public List<ItemDTO> findAll();
	public int insertItem(ItemDTO itemDTO);
	public int updateItem(ItemDTO itemDTO);
	public int deleteItemByID(Integer itemid);
	public int deleteItemByDTO(ItemDTO itemDTO);
}
