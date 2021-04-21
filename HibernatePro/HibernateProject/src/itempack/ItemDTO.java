package itempack;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="item")
@Table(name="item")
public class ItemDTO implements Serializable,Cloneable{
	
	@Id
	private int itemid;
	private String item_name;
	private String item_unit;
	private float price;
	
	private static ItemDTO itemDTO;
	synchronized public static ItemDTO getItemDTO() {
		if(itemDTO==null) {
			itemDTO=new ItemDTO();
		}
		return itemDTO.getCloneItemDTO();		
	}
	
	private ItemDTO getCloneItemDTO() {
		try {
			return (ItemDTO)super.clone();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public ItemDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "ItemDTO [itemid=" + itemid + ", item_name=" + item_name + ", item_unit=" + item_unit + ", price="
				+ price + "]";
	}

	
	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getItem_unit() {
		return item_unit;
	}

	public void setItem_unit(String item_unit) {
		this.item_unit = item_unit;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public static void setItemDTO(ItemDTO itemDTO) {
		ItemDTO.itemDTO = itemDTO;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item_name == null) ? 0 : item_name.hashCode());
		result = prime * result + ((item_unit == null) ? 0 : item_unit.hashCode());
		result = prime * result + itemid;
		result = prime * result + Float.floatToIntBits(price);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemDTO other = (ItemDTO) obj;
		if (item_name == null) {
			if (other.item_name != null)
				return false;
		} else if (!item_name.equals(other.item_name))
			return false;
		if (item_unit == null) {
			if (other.item_unit != null)
				return false;
		} else if (!item_unit.equals(other.item_unit))
			return false;
		if (itemid != other.itemid)
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		return true;
	}
	
}
