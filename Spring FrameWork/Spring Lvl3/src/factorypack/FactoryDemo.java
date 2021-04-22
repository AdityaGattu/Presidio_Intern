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
	public Shoe sellShoe(Customer customer);
	public void test();
}
class Customer{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
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
	private String value;
	public BataShoeFactory() {
		System.out.println("bats shoe factory object created...");
	}
	@Override
	public Shoe makeShoe() {
		return new LeatherShoe();
	}
}
class LakhaniShoeFactory extends ShoeFactory{
	public LakhaniShoeFactory() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Shoe makeShoe() {
		return new SportsShoe();
	}
}
class SibiShoeShop extends ShoeShop{
	
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
	public Shoe sellShoe(Customer customer) {
		return getManufacturer().makeShoe();
	}
	@Override
	public void test() {
		System.out.println("test method called..........of shoe shop.....");
	}
}