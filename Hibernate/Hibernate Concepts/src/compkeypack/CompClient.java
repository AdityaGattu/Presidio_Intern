package compkeypack;

import org.hibernate.Session;

import utility.HibernateUtility;

public class CompClient {
	public static void main(String[] args) {
		ItemTrans it=new ItemTrans();
		
		CompKey ck=new CompKey();
		ck.setInv_id(1001);
		ck.setItem_id(200);
		
		it.setCompKey(ck);
		it.setQty(20);
		
		Session session=HibernateUtility.getSession();
		session.save(it);
		HibernateUtility.closeSession(null);
	}
}

/*
Hibernate: insert into INVTRAN (qty, inv_id, item_id) values (?, ?, ?)
mysql> show tables;
+----------------------+
| Tables_in_codab4     |
+----------------------+
| address              |
| batatable            |
| book                 |
| employee             |
| hibernate_unique_key |
| invtran              |
| lakhanitable         |
| shoefactory          |
| shoetable            |
| student              |
| student_has_training |
| training             |
+----------------------+
12 rows in set (0.01 sec)

mysql> select * from invtran;
+--------+---------+------+
| inv_id | item_id | qty  |
+--------+---------+------+
|   1001 |     200 |   20 |
+--------+---------+------+
1 row in set (0.00 sec)
*/