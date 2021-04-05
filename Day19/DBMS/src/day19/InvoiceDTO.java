package day19;

import java.io.Serializable;
import java.sql.Date;

public class InvoiceDTO implements Serializable,Cloneable {

	private int invid,cid;
	private Date invdate;
	
	private InvoiceDTO() {
		
		// TODO Auto-generated constructor stub
	}
	
	private static InvoiceDTO obj;
	
	synchronized public static InvoiceDTO getIvInvoiceDTO() {
		if(obj==null) {
			return new InvoiceDTO();
		}
		return obj.getClone();
	}
	
	private InvoiceDTO getClone() {
		try {
			return (InvoiceDTO)super.clone();
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public int getInvid() {
		return invid;
	}

	public void setInvid(int invid) {
		this.invid = invid;
	}

	public Date getInvdate() {
		return invdate;
	}

	public void setInvdate(Date invdate) {
		this.invdate = invdate;
	}

	public InvoiceDTO getObj() {
		return obj;
	}

	public void setObj(InvoiceDTO obj) {
		this.obj = obj;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
