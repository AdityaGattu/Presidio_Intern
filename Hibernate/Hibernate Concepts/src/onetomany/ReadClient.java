package onetomany;

import java.util.Set;

import org.hibernate.Session;

import utility.HibernateUtility;

public class ReadClient {
	public static void main(String[] args) {
		Session session=HibernateUtility.getSession();
		
		Employee emp=(Employee)session.get(Employee.class, Integer.valueOf(1));
		
		System.out.println(emp.getEname());
		
		Set<Address> addresses=emp.getAddresses();
		
//		for(Address a:addresses) {
//			System.out.println(a.getEmp().getEname());
//		}
	}
}


/*
 if lazy = true ->it is lazy so defered loading ...when employee is feteched ..addressses are not feteched..
Hibernate: select employee0_.eid as eid0_0_, employee0_.ename as ename0_0_, employee0_.esal as esal0_0_ from EMPLOYEE employee0_ where employee0_.eid=?
ramu

 if lazy = false ->not lazy so fetchs address records also when employee is fetched.... eager loading
Hibernate: select employee0_.eid as eid0_0_, employee0_.ename as ename0_0_, employee0_.esal as esal0_0_ from EMPLOYEE employee0_ where employee0_.eid=?
Hibernate: select addresses0_.EMPLOYEE_EID as EMPLOYEE4_0_1_, addresses0_.aid as aid1_, addresses0_.aid as aid1_0_, addresses0_.street as street1_0_, addresses0_.city as city1_0_, addresses0_.EMPLOYEE_EID as EMPLOYEE4_1_0_ from ADDRESS addresses0_ where addresses0_.EMPLOYEE_EID=?
ramu

*/