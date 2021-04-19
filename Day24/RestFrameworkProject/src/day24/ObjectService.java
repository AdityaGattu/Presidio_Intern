package day24;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlRootElement;
@Path("/obs")
public class ObjectService {

	//http://localhost:8080/RestFrameworkProject/rest/obs/getemp
		@GET
		@Path("/getemp")
		//@Produces("application/json") 
		@Produces("application/xml")    
		public Employee getEmployee() {
			Employee emp=new Employee();
			emp.setEid(100);
			emp.setEname("ramu");
			emp.setEsal(10202);
			return emp;
		}
		
	@GET
	@Path("/getallemps")
	@Produces("application/xml")
	public List<Employee> getEmployees(){
		
		List<Employee> list=new ArrayList<>();
		Employee emp=new Employee();
		emp.setEid(100);
		emp.setEname("ramu");
		emp.setEsal(10202);
		Employee emp2=new Employee();
		emp.setEid(200);
		emp.setEname("somu");
		emp.setEsal(1432);
		Employee emp3=new Employee();
		emp.setEid(300);
		emp.setEname("raju");
		emp.setEsal(15454);
		list.add(emp);list.add(emp2);list.add(emp3);
		return list;
	}
	
	@POST
	@Path("/setEmp")
	@Consumes("application/xml")
	public void setEmployee(Employee emp) {
		System.out.println(emp);
	}
	
	@POST
	@Path("/setAllEmps")
	@Consumes("application/xml")
	public void setAllEmployees(List<Employee> list) {
		System.out.println(list);
	}
	
}
@XmlRootElement
class Employee{
	private int eid;
	private String ename;
	private float esal;
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
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
}
