package query;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import annopack.mone2manypack.*;
import utility.HibernateUtility;
public class QueryClient2 {
	public static void main(String[] args) {
		QueryClient2 obj=new QueryClient2();
		obj.query3();
	}
	public static void display(Criteria criteria)
	{
		List<Employee> employees=criteria.list();
		Iterator<Employee> iter=employees.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next().getEname());
		}
	}
	public void query1() {
		Session session=HibernateUtility.getSession();
		Criteria criteria=session.createCriteria(Employee.class);
		display(criteria);
	}
	public void query11()
	{
		Session session=HibernateUtility.getSession();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.addOrder(Order.desc("ename"));
		display(criteria);
	}
	public void query2()
	{
		Session session=HibernateUtility.getSession();
		Criteria criteria=session.createCriteria(Employee.class);
		//criteria.add(Restrictions.eq("name", "ramu"));
		//or
		criteria.add(Property.forName("ename").eq("ramu"));
		Employee emp=(Employee)criteria.uniqueResult();
		System.out.println(emp.getEname());
	}
	
	//O/p: Hibernate: select this_.eid as eid1_1_, this_.ename as ename1_1_, this_.esalary as esalary1_1_, trainings2_.employee_eid as employee1_1_3_, training3_.tid as trainings2_3_, training3_.tid as tid2_0_, training3_.tname as tname2_0_ from employee this_ left outer join Employee_has_Training trainings2_ on this_.eid=trainings2_.employee_eid left outer join Training training3_ on trainings2_.trainings_tid=training3_.tid where this_.ename=?
	//ramu
	public void query3()
	{
		Session session=HibernateUtility.getSession();
		Criteria criteria=session.createCriteria(Address.class);
//		criteria.add(Restrictions.eq("emp.ename", "ramu"));
//		//or
		criteria.add(Property.forName("emp.ename").eq("ramu"));
		List<Address> addresses=criteria.list();
		Iterator<Address> iter=addresses.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next().getAid());
		}
	}
	public void query4()
	{
		Session session=HibernateUtility.getSession();
		int f[]={new Integer(20),new Integer(40)};
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.between("eage",new Float(20),new Float(40)));
		//or
		//criteria.add(Property.forName("eage").in(f));
		display(criteria);
	}
	public void query5()
	{
		Session session=HibernateUtility.getSession();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.like("ename", "R%").ignoreCase());
		display(criteria);	
	}
	public void query6()
	{
		Session session=HibernateUtility.getSession();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.
			add(Restrictions.like("ename", "R%").ignoreCase())
			.add(Restrictions.gt("eage", new Float(20)));
		display(criteria);
	}
	public void query7()
	{
		Session session=HibernateUtility.getSession();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(
				Restrictions.or(Restrictions.like("ename", "R%")
						.ignoreCase(),
				Restrictions.gt("eage", new Float(20))));
				display(criteria);
	}
	public void query8()
	{
		Session session=HibernateUtility.getSession();
		DetachedCriteria dc=DetachedCriteria.forClass(Employee.class);
		dc.add(
				Restrictions.or(Restrictions.like("ename", "R%"),
				Restrictions.gt("eage", new Float(20)))
			);
		Criteria criteria=dc.getExecutableCriteria(session);
		display(criteria);
	}
}