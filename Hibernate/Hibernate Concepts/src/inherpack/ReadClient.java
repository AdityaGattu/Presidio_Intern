package inherpack;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import utility.HibernateUtility;

public class ReadClient {
	public static void main(String[] args) {
		Session session=HibernateUtility.getSession();
		
		Query query= session.createQuery("from ShoeFactory");
		
		List<ShoeFactory> factory=query.list();
		
		for(ShoeFactory sf:factory) {
//			if(sf instanceof BataShoeFactory) {
//				BataShoeFactory
//			}
//			else if(sf instanceof ShoeFactory) {
//				
//			}
//			else if(sf instanceof LakhaniShoeFactory) {
//				
//			}
			System.out.println(sf);
		}
		
	}
}

/*o/p:
 * Hibernate: select shoefactor0_.sid as sid0_, shoefactor0_.shoeName as shoeName0_, shoefactor0_.bataName as bataName0_, shoefactor0_.lakhaniName as lakhaniN5_0_, shoefactor0_.DISCRIMINATORCOLUMN as DISCRIMI2_0_ from SHOEFACTORY shoefactor0_
inherpack.ShoeFactory@537b32ef
inherpack.BataShoeFactory@65e7f52a
inherpack.LakhaniShoeFactory@304b9f1a

mysql> show tables;
+------------------+
| Tables_in_codab4 |
+------------------+
| batatable        |
| book             |
| lakhanitable     |
| shoefactory      |
| shoetable        |
+------------------+
5 rows in set (0.00 sec)

mysql> desc shoefactory;
+---------------------+--------------+------+-----+---------+-------+
| Field               | Type         | Null | Key | Default | Extra |
+---------------------+--------------+------+-----+---------+-------+
| sid                 | int          | NO   | PRI | NULL    |       |
| DISCRIMINATORCOLUMN | varchar(255) | NO   |     | NULL    |       |
| shoeName            | varchar(255) | YES  |     | NULL    |       |
| bataName            | varchar(255) | YES  |     | NULL    |       |
| lakhaniName         | varchar(255) | YES  |     | NULL    |       |
+---------------------+--------------+------+-----+---------+-------+
5 rows in set (0.00 sec)

mysql> select * from shoefactory;
+-----+---------------------+------------------------+-------------------+-----------------------+
| sid | DISCRIMINATORCOLUMN | shoeName               | bataName          | lakhaniName           |
+-----+---------------------+------------------------+-------------------+-----------------------+
|   1 | SF                  | shoe shoe shoe...      | NULL              | NULL                  |
|   2 | BSF                 | bshoe bshoe bshoe..... | bata bata bata... | NULL                  |
|   3 | LSF                 | lshoe lshoe lshoe..    | NULL              | lakki lakki lakki.... |
+-----+---------------------+------------------------+-------------------+-----------------------+



model 2: 

mysql> select * from shoeTABLE;
+-----+------------------------+
| sid | shoeName               |
+-----+------------------------+
|   1 | shoe shoe shoe...      |
|   2 | bshoe bshoe bshoe..... |
|   3 | lshoe lshoe lshoe..    |
|   4 | shoe shoe shoe...      |
|   5 | bshoe bshoe bshoe..... |
|   6 | lshoe lshoe lshoe..    |
+-----+------------------------+
6 rows in set (0.00 sec)

mysql> select * from batatable;
+-----+-------------------+
| sid | bataName          |
+-----+-------------------+
|   2 | bata bata bata... |
|   5 | bata bata bata... |
+-----+-------------------+
2 rows in set (0.00 sec)

mysql> select * from lakhanitable;
+-----+-----------------------+
| sid | lakhaniName           |
+-----+-----------------------+
|   3 | lakki lakki lakki.... |
|   6 | lakki lakki lakki.... |
+-----+-----------------------+
2 rows in set (0.00 sec)


model 3:


*/
