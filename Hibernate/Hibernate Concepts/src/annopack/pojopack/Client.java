package annopack.pojopack;

import java.math.BigDecimal;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Client {
	
public static void main(String[] args)throws Exception {
	//SessionFactory fac=new Configuration().configure().buildSessionFactory();
	
	SessionFactory factory = 
		new AnnotationConfiguration().configure("hibernate.anno.cfg.xml").buildSessionFactory();
	
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	
	Employee employee1 = new Employee();
	employee1.setId(200);
	employee1.setName("Han Yenn");
	
	employee1.setJoiningDate(LocalDate.now());
	employee1.setJoiningTime(LocalTime.now());
	employee1.setJoiningDateTime(LocalDateTime.now());
	employee1.setSalary(new BigDecimal(10000));
	employee1.setSsn("a1");
	
	session.save(employee1);	
	
	
	tx.commit();
	

	
	Query query=session.getNamedQuery("myquery");
	
	List<Employee> list=query.list();
	System.out.println(list.size());
	for(Employee e:list) {
		System.out.println(e);
	}
	
	
}
}

/*Hibernate: insert into EMPLOYEEEMP (JOININGDATE, JOININGDATETIME, JOININGTIME, NAME, SALARY, SSN, id) values (?, ?, ?, ?, ?, ?, ?)
Hibernate: select employee0_.id as id0_, employee0_.JOININGDATE as JOININGD2_0_, employee0_.JOININGDATETIME as JOININGD3_0_, employee0_.JOININGTIME as JOININGT4_0_, employee0_.NAME as NAME0_, employee0_.SALARY as SALARY0_, employee0_.SSN as SSN0_ from EMPLOYEEEMP employee0_
1
Employee [id=200, name=Han Yenn, joiningDate=2021-04-20, salary=10000, ssn=a1]
*/