package dbdemos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class DbDemo {
	
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void testDb() {
		try {
			System.out.println(dataSource.getConnection());
			
			JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
			
			jdbcTemplate.update("create table users (uid int(5),uname varchar(30),amount int(5))");
			
			jdbcTemplate.update("insert into users values (1,'ramu',1000)");
			jdbcTemplate.update("insert into users values (2,'somu',2000)");
			
			int noofrows=jdbcTemplate.queryForInt("select count(*) from users");
			
			System.out.println("no of rows...:"+noofrows);
			
			String uname=jdbcTemplate.queryForObject("select uname from users where amount>?", new Object[]{1500},String.class);
			
			
			System.out.println("Uname...:"+uname);
			
			User user=jdbcTemplate.queryForObject("select * from users where amount>?", new Object[]{1500},new MyRowMapper());
			
			System.out.println(user);
			
			List<User> listOfUsers=jdbcTemplate.query("select * from users where amount>?", new Object[]{500},new MyRowMapper());
			
			System.out.println(listOfUsers);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class MyRowMapper implements RowMapper<User>{
	@Override
	public User mapRow(ResultSet rs, int arg1) throws SQLException {
		User user=new User();
		user.setUid(rs.getInt("uid"));
		user.setUname(rs.getString("uname"));
		user.setAmount(rs.getInt("amount"));
		return user;
	}
}