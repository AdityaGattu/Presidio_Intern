package query;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;
import onetomany.Address;
import onetomany.Employee;
import utility.HibernateUtility;
public class QueryClient {
	public static void main(String[] args) {
		QueryClient obj=new QueryClient();
		obj.query2();
	}
	
	public void query1() {
		Session session=HibernateUtility.getSession();
		Query query=session.createQuery("from Employee");
		List<Employee> list=query.list();
		for(Employee emp:list) {
			System.out.println(emp.getEname()+":"+emp.getEid());
			Set<Address> addresses=emp.getAddresses();
			for(Address add:addresses) {
				System.out.println(add.getCity()+":"+add.getStreet());
			}
		}		
	}
	//1.o/p: Hibernate: select employee0_.eid as eid0_, employee0_.ename as ename0_, employee0_.esal as esal0_ from EMPLOYEE employee0_
	
	//where clause and named query
	public void query2() {
		Session session=HibernateUtility.getSession();
		//Query query=session.createQuery("from Employee emp where emp.eage>=20");
		Query query=session.getNamedQuery("myquery");
		List<Employee> list=query.list();
		for(Employee emp:list) {
			System.out.println(emp.getEname());
			Set<Address> addresses=emp.getAddresses();
			for(Address add:addresses) {
				System.out.println(add.getCity()+":"+add.getStreet());
			}
		}	
	}
	//scalars
	public void query3() {
		Session session=HibernateUtility.getSession();
		Query query=session.createQuery("select emp.ename from Employee emp where emp.eage>=20");
		List<Object> list=query.list();
		for(Object emp:list) {
			System.out.println((String)emp);
		}
		
		Query query2=session.createQuery("select emp.ename,emp.eage from Employee emp where emp.eage>=20");
		List<Object[]> list2=query2.list();
		for(Object[] emp:list2) {
			System.out.println((String)emp[0]+":"+(Integer)emp[1]);
		}
	}
	//query paramter and also multiple objects joined...
	public void query4() {
		Session session=HibernateUtility.getSession();
		Query query=session.createQuery
				("select e.ename, a.city from Employee e, Address a where a.city=:c");
			query.setParameter("c", "chennaii");
			Iterator<Object[]> obj=query.iterate();
			while(obj.hasNext())
			{
				Object o[]=obj.next();
				System.out.println(o[0]+":"+o[1]);
			}
	}
	public void query5() {
		//an inner join will retun a employee name ONLY if their atleast one matching address
		Session session=HibernateUtility.getSession();
		Query query=session.createQuery
				("select e.ename, a.city from Employee e join e.addresses a with a.city=:c");
		query.setParameter("c", "chennaii");
		Iterator<Object[]> obj=query.iterate();
		while(obj.hasNext())
		{
			Object o[]=obj.next();
			System.out.println(o[0]+":"+o[1]);
		}
		
		
	}
	public void query6() {
		//an outer join will return all employee names once with a NULL address if no
		//matching employees are found.
		Session session=HibernateUtility.getSession();
		Query query=session.createQuery
				("select e.ename, a.city from Employee e left join e.addresses a with a.city=:c");
		query.setParameter("c", "chennaii");
		Iterator<Object[]> obj=query.iterate();
		while(obj.hasNext())
		{
			Object o[]=obj.next();
			System.out.println(o[0]+":"+o[1]);
		}	
	}
	public void query7()
	{
		Session session=HibernateUtility.getSession();
		Query q=session.createQuery("update Employee set eage=age+100");
		int updateditems=q.executeUpdate();
		System.out.println("No of records updated...:"+updateditems);
		session.beginTransaction().commit();
	}
	public void query8()
	{	
		Session session=HibernateUtility.getSession();
		Query q=session.createQuery
		("insert into BackupEmployee (eid, ename,eage) select e.eid,e.ename,e.eage from Employee e");
		int createobjects=q.executeUpdate();
		System.out.println(createobjects);
		session.beginTransaction().commit();
	}
	
}