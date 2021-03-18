package day8;

public class DecoratorDemo {

	public static void main(String[] args) {
		
		Food thali = new Rice();
		System.out.println("thali cost : "+thali.cost());
		
		Food thali1 = new Rice(new Dal());
		System.out.println("thali cost : "+thali1.cost());
		

		Food thali2=new Rice(new Dal(new Chicken(new Rice())));
		System.out.println("Cost of Rice..+Daal..+chicken+rice..:"+thali2.cost());
	}
}

//static composition - static composition is achieved through generalization - part whole hierarchy

abstract class Food{
	public abstract int cost();
}

abstract class VegFood extends Food{
	
}

abstract class NonVegFood extends Food{
	
}


class Rice extends VegFood{
	Rice(){
		
	}
	private Food food;
	Rice(Food food){
		this.food=food;
	}
	public int cost() {
		if(food==null)
			return 10;
		else
			return 10+food.cost();
	}
}

class Dal extends VegFood{
	Dal(){
		
	}
	private Food food;
	Dal(Food food){
		this.food=food;
	}
	public int cost() {
		if(food==null)
			return 20;
		else
			return 20+food.cost();
	}
}

class Chicken extends NonVegFood{
	public Chicken() {
		// TODO Auto-generated constructor stub
	}
	private Food food;
	public Chicken(Food food) {
		this.food=food;
	}
@Override
	public int cost() {
		// TODO Auto-generated method stub
	if(food!=null) {
		return 20+food.cost();
	}
	else {
			return 20;
		}
	}
}
/*o/p:
thali cost : 10
thali cost : 30
Cost of Rice..+Daal..+chicken+rice..:60
*/