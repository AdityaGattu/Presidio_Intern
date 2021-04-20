package compkeypack;

import java.io.Serializable;

public class CompKey implements Serializable{
	private int inv_id;
	private int item_id;
	public final int getInv_id() {
		return inv_id;
	}
	public final void setInv_id(int inv_id) {
		this.inv_id = inv_id;
	}
	public final int getItem_id() {
		return item_id;
	}
	public final void setItem_id(int item_id) {
		this.item_id = item_id;
	}
}
