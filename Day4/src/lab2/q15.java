package lab2;

/*   Write a program to find the cost of constructing a house creating a class called House.
 *   Create 2 classes Door and window. House has instance of door and window.
 *   House has member which provide information related to area of construction of door 
 *   and window. House delegates the responsibility of calculating the cost of door 
 *   and window to the respective classes 
 */


class House{
	Door d;
	Window w;
	
	int dcost;
	int wincost;
	
	House(int dor,int win)
	{
		this.d=new Door();
		this.w=new Window();
		this.dcost=dor;
		this.wincost=win;
	}
	
	void display() {
		int val=d.getdoorCost(dcost)+w.getwinCost(wincost);
		System.out.println("Total cost: "+val);
	}
	
}
class Door{
	
	int getdoorCost(int dcost)
	{return dcost*1000;}
	
}
class Window{
	int getwinCost(int wincost)
	{return wincost*500;}
	
}
public class q15 {
	public static void main(String[] args) {
		
		House h=new House(20,10);
		h.display();
		
	}

	
}
//o/p : Total cost: 25000