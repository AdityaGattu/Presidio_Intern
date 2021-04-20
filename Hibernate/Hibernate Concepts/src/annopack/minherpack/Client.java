package annopack.minherpack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Client {
public static void main(String[] args) {
	SessionFactory factory = 
		new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();

	Maruti maruti=new Maruti();
	maruti.setAutofeature("auto features...");
	maruti.setCarfeatures("car features....");
	maruti.setMarutifeatures("maruti features....");
	
	session.save(maruti);
	
	Car car=new Car();
	car.setAutofeature("aaaaaaaaaaaaaaaaaaaa");
	car.setCarfeatures("ccccccccccccccccccccc");
	
	session.save(car);
	tx.commit();
	
	Query q=session.createQuery("select a from auto a");
	List l=q.list();
	Iterator i=l.iterator();
	while(i.hasNext())
	{
		Automobile a=(Automobile)i.next();
		a.handle();
	}	
}
public void display()
{
//select r from Automobile a	
}

}

/*
 * Hibernate: insert into myauto (featureofauto, carfeatures, marutifeatures, disc, sno) values (?, ?, ?, 'maruti', ?)
Hibernate: insert into myauto (featureofauto, carfeatures, disc, sno) values (?, ?, 'car', ?)
Hibernate: select automobile0_.sno as sno0_, automobile0_.featureofauto as featureo3_0_, automobile0_.carfeatures as carfeatu4_0_, automobile0_.marutifeatures as marutife5_0_, automobile0_.disc as disc0_ from myauto automobile0_
maruti processed
car processed...
 */
/**

none
No action will be performed.

create-only
Database creation will be generated.

drop
Database dropping will be generated.

create
Database dropping will be generated followed by database creation.

create-drop
Drop the schema and recreate it on SessionFactory startup. Additionally, drop the schema on SessionFactory shutdown.

validate
Validate the database schema

update
Update the database schema
**/
