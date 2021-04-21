package customerpack;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="customer")
@Table(name="customer")
public class CustomerDTO implements Serializable,Cloneable{
	
	@Id
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
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caccountdetails == null) ? 0 : caccountdetails.hashCode());
		result = prime * result + ((caddress == null) ? 0 : caddress.hashCode());
		result = prime * result + cid;
		result = prime * result + ((cname == null) ? 0 : cname.hashCode());
		result = prime * result + cno;
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
		CustomerDTO other = (CustomerDTO) obj;
		if (caccountdetails == null) {
			if (other.caccountdetails != null)
				return false;
		} else if (!caccountdetails.equals(other.caccountdetails))
			return false;
		if (caddress == null) {
			if (other.caddress != null)
				return false;
		} else if (!caddress.equals(other.caddress))
			return false;
		if (cid != other.cid)
			return false;
		if (cname == null) {
			if (other.cname != null)
				return false;
		} else if (!cname.equals(other.cname))
			return false;
		if (cno != other.cno)
			return false;
		return true;
	}
	
	

	
}
