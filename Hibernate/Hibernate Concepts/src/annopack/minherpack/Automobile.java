package annopack.minherpack;

import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity(name="auto")
@Table(name="myauto")
//@Inheritance(strategy=InheritanceType.JOINED) 
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="disc")
@DiscriminatorValue(value="auto")
public class Automobile implements Serializable{
	@Id
	public int sno;
	
	@Column(name="featureofauto")
	public String autofeature;
		
	public Automobile()
	{
		
		sno=(int)System.nanoTime();
	}
	public String getAutofeature() {
		return autofeature;
	}
	public void setAutofeature(String autofeature) {
		this.autofeature = autofeature;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	@Override
	public String toString() {
		return "Auto:"+autofeature+".."+super.toString();
	}
	public void handle() {
		new VisitorImpl().process(this);
	}
}
