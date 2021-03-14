package lab6;

//49. Write a simple program find the volume of Box using method calls? 

public class q49 {

	int l;
	int b;
	int h;
	
	q49(int l,int b,int h){
		this.l=l;
		this.b=b;
		this.h=h;
	}
	
	void find_vol()
	{
		int vol=l*b*h;
		System.out.println("Volume is: "+vol);
	}
	
	
	
	public static void main(String[] args) {
		
		q49 b=new q49(5,6,7);
		b.find_vol();
	}
}

//o/p: Volume is: 210
