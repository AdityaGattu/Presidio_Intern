package query;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;
import manytomany.Student;
import manytomany.Training;
import utility.HibernateUtility;
public class QueryDemo1 {
	public static void main(String[] args) {
		QueryDemo1 obj=new QueryDemo1();
		//obj.query1();
		//obj.query2();
		//obj.query3();
		obj.query4();
	}
	
	public void template() {
		try {
			Session session=HibernateUtility.getSession();
			
			HibernateUtility.closeSession(null);
		}catch(Exception e) {
			e.printStackTrace();
			HibernateUtility.closeSession(e);
		}
	}
	public void query1() {
		try {
			Session session=HibernateUtility.getSession();
			Query query=session.createQuery("from Student");
			List list=query.list();
			Iterator<Student> iter=list.iterator();
			while(iter.hasNext()) {
				Object obj=iter.next();
				System.out.println(obj);
				Student student=(Student)obj;
				System.out.println(student.getSname());
				Set<Training> trainings=student.getTrainings();
				for(Training t:trainings) {
					System.out.println(t.getTname());
				}
			}
			HibernateUtility.closeSession(null);
		}catch(Exception e) {
			e.printStackTrace();
			HibernateUtility.closeSession(e);
		}
	}
	
	/*
	 * Hibernate: select student0_.sid as sid0_, student0_.sname as sname0_, student0_.marks as marks0_ from STUDENT student0_
manytomany.Student@5652f555
ramu
Hibernate: select trainings0_.STUDENT_SID as STUDENT1_0_1_, trainings0_.TRAINING_TID as TRAINING2_1_, training1_.tid as tid2_0_, training1_.tname as tname2_0_, training1_.startDate as startDate2_0_ from STUDENT_HAS_TRAINING trainings0_ inner join TRAINING training1_ on trainings0_.TRAINING_TID=training1_.tid where trainings0_.STUDENT_SID=?
java
jee
	 */
	public void query2() {
		try {
			Session session=HibernateUtility.getSession();
			Query query=session.createQuery("select student.sname from Student student");
			List list=query.list();
			Iterator<String> iter=list.iterator();
			while(iter.hasNext()) {
				Object obj=iter.next();
				System.out.println(obj);
				String name=(String)obj;
				System.out.println("Name...:"+name);
//				Set<Training> trainings=student.getTrainings();
//				for(Training t:trainings) {
//					System.out.println(t.getTname());
//				}
			}
			HibernateUtility.closeSession(null);
		}catch(Exception e) {
			e.printStackTrace();
			HibernateUtility.closeSession(e);
		}
	}
	
	/*
	 * Hibernate: select student0_.sname as col_0_0_ from STUDENT student0_
	ramu
	Name...:ramu
	 */
	
	public void query3() {
		try {
			Session session=HibernateUtility.getSession();
			Query query=session.createQuery("select student.sname,student.marks from Student student");
			List list=query.list();
			Iterator<Object[]> iter=list.iterator();
			while(iter.hasNext()) {
				Object obj[]=iter.next();
				for(Object o:obj) {
					System.out.println(o);
				}
//				System.out.println("Name...:"+name);
//				Set<Training> trainings=student.getTrainings();
//				for(Training t:trainings) {
//					System.out.println(t.getTname());
//				}
			}
			HibernateUtility.closeSession(null);
		}catch(Exception e) {
			e.printStackTrace();
			HibernateUtility.closeSession(e);
		}
	}
	
	/*
	 *Hibernate: select student0_.sname as col_0_0_, student0_.marks as col_1_0_ from STUDENT student0_
	ramu
	450 
	 */
	public void query4() {
		try {
			Session session=HibernateUtility.getSession();
			Query query=session.createQuery("from Student student where student.marks>300");
			List list=query.list();
			Iterator<Student> iter=list.iterator();
			while(iter.hasNext()) {
				Object obj=iter.next();
				System.out.println(obj);
				Student student=(Student)obj;
				System.out.println(student.getSname());
				Set<Training> trainings=student.getTrainings();
				for(Training t:trainings) {
					System.out.println(t.getTname());
				}
			}
			HibernateUtility.closeSession(null);
		}catch(Exception e) {
			e.printStackTrace();
			HibernateUtility.closeSession(e);
		}
	}
}

/* o/p:
 * Hibernate: select student0_.sid as sid0_, student0_.sname as sname0_, student0_.marks as marks0_ from STUDENT student0_ where student0_.marks>300
manytomany.Student@241a0c3a
ramu
Hibernate: select trainings0_.STUDENT_SID as STUDENT1_0_1_, trainings0_.TRAINING_TID as TRAINING2_1_, training1_.tid as tid2_0_, training1_.tname as tname2_0_, training1_.startDate as startDate2_0_ from STUDENT_HAS_TRAINING trainings0_ inner join TRAINING training1_ on trainings0_.TRAINING_TID=training1_.tid where trainings0_.STUDENT_SID=?
java
jee
 */
