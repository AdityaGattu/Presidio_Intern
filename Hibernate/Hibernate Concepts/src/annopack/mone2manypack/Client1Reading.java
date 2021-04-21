package annopack.mone2manypack;

import java.util.Collection;
import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Client1Reading {
public static void main(String[] args) {
	SessionFactory factory = 
			new AnnotationConfiguration().
			configure("hibernate.anno.cfg.xml").buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Employee emp=(Employee)session.get(Employee.class,new Integer(100));
		Collection col=emp.getAddresses();
		Iterator iter=col.iterator();
		while(iter.hasNext())
		{
			Address add=(Address)iter.next();
			System.out.println(add.getStreet());
		}
		
}
}

/*
 * Hibernate: select employee0_.eid as eid1_1_, employee0_.ename as ename1_1_, employee0_.esalary as esalary1_1_, trainings1_.employee_eid as employee1_1_3_, training2_.tid as trainings2_3_, training2_.tid as tid2_0_, training2_.tname as tname2_0_ from employee employee0_ left outer join Employee_has_Training trainings1_ on employee0_.eid=trainings1_.employee_eid left outer join Training training2_ on trainings1_.trainings_tid=training2_.tid where employee0_.eid=?
Hibernate: select addresses0_.employee_eid as employee3_1_1_, addresses0_.aid as aid1_, addresses0_.aid as aid0_0_, addresses0_.employee_eid as employee3_0_0_, addresses0_.street as street0_0_ from address addresses0_ where addresses0_.employee_eid=?
*/
