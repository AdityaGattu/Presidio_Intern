package annopack.pojopack;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
@Entity
@Table(name="EMPLOYEEEMP")
@NamedQuery(name="myquery", query = "from Employee")
public class Employee {	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "JOININGDATE", nullable = false)
	//@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate joiningDate;

	@Column(name = "JOININGTIME", nullable = false)
	//@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalTime")
	private LocalTime joiningTime;
	
	@Column(name = "JOININGDATETIME", nullable = false)
	//@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
	private LocalDateTime joiningDateTime;
	
	public LocalDateTime getJoiningDateTime() {
		return joiningDateTime;
	}

	public void setJoiningDateTime(LocalDateTime joiningDateTime) {
		this.joiningDateTime = joiningDateTime;
	}

	public LocalTime getJoiningTime() {
		return joiningTime;
	}

	public void setJoiningTime(LocalTime joiningTime) {
		this.joiningTime = joiningTime;
	}

	@Column(name = "SALARY", nullable = false)
	private BigDecimal salary;
	
	@Column(name = "SSN", unique=true, nullable = false)
	private String ssn;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (ssn == null) {
			if (other.ssn != null)
				return false;
		} else if (!ssn.equals(other.ssn))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", joiningDate="
				+ joiningDate + ", salary=" + salary + ", ssn=" + ssn + "]";
	}
	
	
	

}
