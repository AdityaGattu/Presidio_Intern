package invoicetranspack;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="invoicetrans")
@Table(name="invoicetrans")
public class InvoiceTransDTO implements Serializable,Cloneable{
	
	@Id
	private int invid,itemid,qty;
	
	public int getInvid() {
		return invid;
	}

	public void setInvid(int invid) {
		this.invid = invid;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public static InvoiceTransDTO getObj() {
		return obj;
	}

	public static void setObj(InvoiceTransDTO obj) {
		InvoiceTransDTO.obj = obj;
	}

	private InvoiceTransDTO() {
		// TODO Auto-generated constructor stub
	}
	
	private static InvoiceTransDTO obj;
	
	synchronized public static InvoiceTransDTO getInvoiceTransDTO() {
		if(obj==null) {
			return new InvoiceTransDTO();
		}
		return obj.getClone();
	}
	
	private InvoiceTransDTO getClone() {
		try {
			return (InvoiceTransDTO)super.clone();
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + invid;
		result = prime * result + itemid;
		result = prime * result + qty;
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
		InvoiceTransDTO other = (InvoiceTransDTO) obj;
		if (invid != other.invid)
			return false;
		if (itemid != other.itemid)
			return false;
		if (qty != other.qty)
			return false;
		return true;
	}
	
	
	
}
