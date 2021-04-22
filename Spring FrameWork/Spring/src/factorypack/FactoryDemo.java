package factorypack;

import java.util.List;

public class FactoryDemo {
	public static void main(String[] args)throws Exception {
		
	}
}


abstract class Shoe{
	
}

class LeatherShoe extends Shoe{
}
class SportsShoe extends Shoe{
}

interface Seller{	
}

interface ShoeSeller extends Seller{
	public Shoe sellShoe();
}
abstract class ShoeShop implements ShoeSeller{
	public ShoeShop() {
		// TODO Auto-generated constructor stub
	}
	private ShoeManufacturer manufacturer;
	public ShoeManufacturer getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(ShoeManufacturer manufacturer) {
		System.out.println("setter method of shoe shop called...");
		this.manufacturer = manufacturer;
	}
	
}

interface Manufacturer{
}
interface ShoeManufacturer extends Manufacturer{
	public Shoe makeShoe();
}
abstract class ShoeFactory implements ShoeManufacturer{
}

class BataShoeFactory extends ShoeFactory{
	public BataShoeFactory() {
		System.out.println("bata shoe factory object created...");
	}
	@Override
	public Shoe makeShoe() {
		return new LeatherShoe();
	}
}
class LakhaniShoeFactory extends ShoeFactory{
	public LakhaniShoeFactory() {
		// TODO Auto-generated constructor stub

		System.out.println("lakhani shoe factory object created...");
	}
	@Override
	public Shoe makeShoe() {
		return new SportsShoe();
	}
}
class SibiShoeShop extends ShoeShop{
	private String value;
	private List<String> mylist;
	public void setup() {
		System.out.println("set up init method called....");
	}
	public void close() {
		System.out.println("destroy method called....");
	}
	public SibiShoeShop() {
		System.out.println("sibi shoe shop created...");
	}
	@Override
	public Shoe sellShoe() {
		return getManufacturer().makeShoe();
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public List<String> getMylist() {
		return mylist;
	}
	public void setMylist(List<String> mylist) {
		this.mylist = mylist;
	}
}