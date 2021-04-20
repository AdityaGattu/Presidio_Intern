package annopack.pojopack;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Id;

//import org.hibernate.validator.constraints.Length;


@Entity
public class AccountBean {
	@Id	 @GeneratedValue(strategy=GenerationType.AUTO)
	public int acno;
	
	//@Length(max=2)
	public String name;
	public float balance;
		public AccountBean() {
		// TODO Auto-generated constructor stub
		//acno=(int)System.nanoTime();
			//acno=1;
	}
	public float deposit(int amt)
	{
		balance=this.balance+amt;
		return balance;
	}
	
	public float getBalance()
	{
		return balance;
	}
	public float withdraw(int amt)
	{
		if(amt >balance)
		{
			return 0;
		}
		else
		{
			balance=balance-amt;
			return balance;
		}
		
	}
	@PrePersist
	public void beforePersist()
	{
		System.out.println("before persist called...");
	}
	@PostPersist
	public void afterPersist()
	{
		System.out.println("after persist called....");
	}
	@PreUpdate
	public void beforeUpdate()
	{
		System.out.println("before update called.....");
	}
	//@PreRemove @PostRemove @PostUpdate @PostLoad
}
