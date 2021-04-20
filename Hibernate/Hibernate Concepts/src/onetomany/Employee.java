package onetomany;

import java.util.Set;

public class Employee {
	private int eid;
	private String ename;
	private float esal;
	private Set<Address>  addresses;
	public final int getEid() {
		return eid;
	}
	public final void setEid(int eid) {
		this.eid = eid;
	}
	public final String getEname() {
		return ename;
	}
	public final void setEname(String ename) {
		this.ename = ename;
	}
	public final float getEsal() {
		return esal;
	}
	public final void setEsal(float esal) {
		this.esal = esal;
	}
	public final Set<Address> getAddresses() {
		return addresses;
	}
	public final void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
}
