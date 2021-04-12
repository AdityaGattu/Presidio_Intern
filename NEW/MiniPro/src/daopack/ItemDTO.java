package daopack;
import java.io.Serializable;

public class ItemDTO implements Serializable,Cloneable{
	
	private int itemid;
	private String item_name;
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
	ItemDTO() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

	@Override
	public String toString() {
		return "ItemDTO [itemid=" + itemid + ", item_name=" + item_name + ", price=" + price + "]";
	}

	public final int getItemid() {
		return itemid;
	}
	public final void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public final String getItem_name() {
		return item_name;
	}
	public final void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	
	public final float getPrice() {
		return price;
	}
	public final void setPrice(float price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item_name == null) ? 0 : item_name.hashCode());
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
		if (itemid != other.itemid)
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		return true;
	}

	
}
