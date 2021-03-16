package day7;
public class TemplateMethodDemo {
	public static void main(String[] args) {
		Dominos dominos=new UdhayPizza();
		
		dominos.dominosProcess();
	}
}
abstract class Dominos{
	final public void processToCook() {//template methods - parts
		System.out.println("domino chief cook has defined the process...");
	}
	final public void processAddIngredients() {//template method-parts
		System.out.println("donomis chief cook has made the ingredients...");
	}
	final public void processPacking() {//template methods - parts
		System.out.println("dominos has defined the packing process...");
	}
	final private void processCollection() {//template methods - parts
		System.out.println("dominos has defined the collection and profit sharing process...");
	}
	public abstract void cookPizza();
	public abstract void deliverPizza();
	final public void dominosProcess() {//template method- whole
		cookPizza();
		deliverPizza();
		processCollection();
	}
}
class UdhayPizza extends Dominos{
	@Override
	public void cookPizza() {
		System.out.println("pizza cooking  started...");
		processToCook();
		processAddIngredients();
		System.out.println("pizza ready......");
	}
	@Override
	public void deliverPizza() {
		processPacking();
		System.out.println("pizza delivered....");
	}
	
}