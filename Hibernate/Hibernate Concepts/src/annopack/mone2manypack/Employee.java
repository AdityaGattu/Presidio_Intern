package annopack.mone2manypack;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;

//import org.hibernate.annotations.CollectionOfElements;


@Entity(name="employee")
@Table(name="employee")
public class Employee {
	@Id //@GeneratedValue(strategy=GenerationType.AUTO)
	public int eid;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsalary() {
		return esalary;
	}

	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}

	public String ename;

	public float esalary;
	

	@OneToMany(cascade={CascadeType.ALL},
			fetch=FetchType.LAZY,mappedBy = "employee")
	public Set<Address> addresses=new HashSet<Address>(0);

	@ManyToMany(cascade={CascadeType.ALL},fetch=FetchType.EAGER)
	@JoinTable(name="Employee_has_Training")
	public Set<Training> trainings=new HashSet<Training>(0);
	
	public void setTrainings(Set<Training> trainings) {
		this.trainings = trainings;
	}


	public Set<Training> getTrainings()
	{
		return trainings;
	}
	

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}	
}
