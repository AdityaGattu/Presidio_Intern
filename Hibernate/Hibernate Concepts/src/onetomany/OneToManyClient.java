package onetomany;

import java.util.HashSet;

import org.hibernate.Session;

import utility.HibernateUtility;

public class OneToManyClient {
	public static void main(String[] args) {
		
		Employee emp=new Employee();		
		emp.setEname("ramu");
		emp.setEsal(10000);
		
		Address add1=new Address();
		add1.setCity("chennai");
		add1.setStreet("mg street");
		add1.setEmp(emp);
		
		Address add2=new Address();
		add2.setCity("banglore");
		add2.setStreet("abc street");
		add2.setEmp(emp);
		
		HashSet<Address> addresses=new HashSet<Address>();
		addresses.add(add1);
		addresses.add(add2);
		
		emp.setAddresses(addresses);
		
		Session session=HibernateUtility.getSession();
		session.save(emp);  //->if cascade=all pull all related addresses of emp and update it so no need to nxt to save stmts. 
//		session.save(add1);
//		session.save(add2);
		
		HibernateUtility.closeSession(null);
	}
	
}

// if lazy = false ->not lazy so fetchs address records also when employee is fetched.... eager loading
// if lazy = true ->it is lazy so defered loading ...when employee is feteched ..addressses are not feteched..


/* with inverse="true"
 * Hibernate: insert into EMPLOYEE (ename, esal, eid) values (?, ?, ?)
Hibernate: insert into ADDRESS (street, city, EMPLOYEE_EID, aid) values (?, ?, ?, ?)
Hibernate: insert into ADDRESS (street, city, EMPLOYEE_EID, aid) values (?, ?, ?, ?)
 */

/* with inverse="false"
 * Hibernate: insert into EMPLOYEE (ename, esal, eid) values (?, ?, ?)
Hibernate: insert into ADDRESS (street, city, EMPLOYEE_EID, aid) values (?, ?, ?, ?)
Hibernate: insert into ADDRESS (street, city, EMPLOYEE_EID, aid) values (?, ?, ?, ?)
Hibernate: update ADDRESS set EMPLOYEE_EID=? where aid=?
Hibernate: update ADDRESS set EMPLOYEE_EID=? where aid=?
 */
/*
 * 
 * 
 * mysql> use codab4;
Database changed
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
+----------------------+
8 rows in set (0.02 sec)

mysql> select * from employee;
+-----+-------+-------+
| eid | ename | esal  |
+-----+-------+-------+
|   1 | ramu  | 10000 |
+-----+-------+-------+
1 row in set (0.01 sec)

mysql> select * from address
    -> ;
+-------+------------+----------+--------------+
| aid   | street     | city     | EMPLOYEE_EID |
+-------+------------+----------+--------------+
| 32768 | mg street  | chennai  |            1 |
| 32769 | abc street | banglore |            1 |
+-------+------------+----------+--------------+
2 rows in set (0.00 sec)
*/
