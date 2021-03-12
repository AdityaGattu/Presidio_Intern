package lab2;

/* Create an inheritance hierarchy of Wipro:   WiproTechnologies, Wipro Infotech , 
 * Wipro BPO     etc.  In the base class, provide methods that are common to all Wipro,
 *  and override these in the derived classes to perform different behaviors depending 
 *  on the specific type of Wipro. Create an array of Wipro, fill it with different 
 *  specific types of Wipro,and call your base-class methods to see what happens.
 */

class Wipro{
	
	void display()
	{
		System.out.println("Company: WIPRO");
	}
}

class  WiproTechnologies extends Wipro{
	
	void display()
	{
		System.out.println("Company: WiproTechnologies");
	}
}

class WiproInfotech extends Wipro{
	
	void display()
	{
		System.out.println("Company: WiproInfotech");
	}
	
}

class WiproBPO extends Wipro{
	
	void display()
	{
		System.out.println("Company: WiproBPO");
	}
	
}


public class q12 {
	public static void main(String[] args) {
		
		Wipro w=new Wipro();
		WiproTechnologies wtech=new WiproTechnologies();
		WiproInfotech info=new WiproInfotech();
		WiproBPO bpo=new WiproBPO();
		
		Wipro[] arr= {w,wtech,info,bpo};
		
		for(Wipro ele:arr)
		{
			ele.display();
		}
		
	}

	
}

/*o/p
 * Company: WIPRO
Company: WiproTechnologies
Company: WiproInfotech
Company: WiproBPO
*/
