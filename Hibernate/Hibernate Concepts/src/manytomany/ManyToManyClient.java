package manytomany;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import utility.HibernateUtility;

public class ManyToManyClient {
	public static void main(String[] args) {
		Student student=new Student();
		student.setSname("ramu");
		student.setMarks(450);
		
		Training t1=new Training();
		t1.setTname("java");
		t1.setStartDate(new Date());
		
		Training t2=new Training();
		t2.setTname("jee");
		t2.setStartDate(new Date());
		
		Set<Training> trainings=new HashSet<Training>();
		trainings.add(t1);
		trainings.add(t2);
		
		student.setTrainings(trainings);
		
		Session session= HibernateUtility.getSession();
		session.save(student);
		//session.save(t1);
		//session.save(t2);
		
		HibernateUtility.closeSession(null);
	}
}

/*
 * Hibernate: insert into STUDENT (sname, marks, sid) values (?, ?, ?)
Hibernate: insert into TRAINING (tname, startDate, tid) values (?, ?, ?)
Hibernate: insert into TRAINING (tname, startDate, tid) values (?, ?, ?)
Hibernate: insert into STUDENT_HAS_TRAINING (STUDENT_SID, TRAINING_TID) values (?, ?)
Hibernate: insert into STUDENT_HAS_TRAINING (STUDENT_SID, TRAINING_TID) values (?, ?)

mysql> show tables;
+----------------------+
| Tables_in_codab4     |
+----------------------+
| address              |
| batatable            |
| book                 |
| employee             |
| hibernate_unique_key |
| lakhanitable         |
| shoefactory          |
| shoetable            |
| student              |
| student_has_training |
| training             |
+----------------------+
11 rows in set (0.01 sec)

mysql> select * from training;
+-------+-------+---------------------+
| tid   | tname | startDate           |
+-------+-------+---------------------+
| 32768 | jee   | 2021-04-20 10:58:19 |
| 32769 | java  | 2021-04-20 10:58:19 |
+-------+-------+---------------------+
2 rows in set (0.00 sec)

mysql> select * from student_has_training;
+-------------+--------------+
| STUDENT_SID | TRAINING_TID |
+-------------+--------------+
|           1 |        32768 |
|           1 |        32769 |
+-------------+--------------+
2 rows in set (0.00 sec)

mysql> select * from student;
+-----+-------+-------+
| sid | sname | marks |
+-----+-------+-------+
|   1 | ramu  |   450 |
+-----+-------+-------+
1 row in set (0.00 sec)
*/
