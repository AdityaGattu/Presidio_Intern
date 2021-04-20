package annopack.minherpack;

public class VisitorImpl implements Visitor{
	

public void process(Automobile bsf) {
	System.out.println("auto processed...");
	
}

	public void process(Car lsf) {
		// TODO Auto-generated method stub
		System.out.println("car processed...");
	}

	public void process(Maruti sf) {
		
		System.out.println("maruti processed");
	}
}
