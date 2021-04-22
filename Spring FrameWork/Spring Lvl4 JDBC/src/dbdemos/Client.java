package dbdemos;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("config3.xml");
		
		DbDemo db=(DbDemo)ctx.getBean("dbdemo");
		
		db.testDb();
	}
}
	
/*
jdbc:mysql://localhost/codaspring, UserName=adityag@localhost, MySQL Connector/J
no of rows...:2
Uname...:somu
User [uid=2, uname=somu, amount=2000]
[User [uid=1, uname=ramu, amount=1000], User [uid=2, uname=somu, amount=2000]]
*/

/*
mysql> use codaspring;
Database changed
mysql> show tables;
+----------------------+
| Tables_in_codaspring |
+----------------------+
| users                |
+----------------------+
1 row in set (0.02 sec)

mysql> select * from users;
+------+-------+--------+
| uid  | uname | amount |
+------+-------+--------+
|    1 | ramu  |   1000 |
|    2 | somu  |   2000 |
+------+-------+--------+
2 rows in set (0.00 sec)
*/