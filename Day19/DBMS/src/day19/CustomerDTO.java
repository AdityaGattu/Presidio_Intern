package day19;

import java.io.Serializable;

public class CustomerDTO implements Serializable,Cloneable{
	
	private int cid,cno;
	private String cname,caddress,caccountdetails;
	
	

	private CustomerDTO() {
		
	}
	
	
	private static CustomerDTO instance;
	
	synchronized public static CustomerDTO getCustomerDTO() {
		
		if(instance==null) {
			 instance=new CustomerDTO();
		}
		return instance.getCloneCustomerDTO();
	}
	
	
	private CustomerDTO getCloneCustomerDTO() {	
		try {
		return (CustomerDTO)super.clone();
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public int getCid() {
		return cid;
	}


	public int getCno() {
		return cno;
	}


	public String getCname() {
		return cname;
	}


	public String getCaddress() {
		return caddress;
	}


	public String getCaccountdetails() {
		return caccountdetails;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public void setCno(int cno) {
		this.cno = cno;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}


	public void setCaccountdetails(String caccountdetails) {
		this.caccountdetails = caccountdetails;
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
