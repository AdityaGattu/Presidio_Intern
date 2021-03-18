package day9;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Scanner;

public class FactoryDemo {
	public static void main(String[] args) throws Exception {
		ShoeSeller seller=Container.getShoeSeller();
		Shoe shoe=seller.sellShoe();
		System.out.println(shoe);
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		Importer importerObj=new ImporterImpl();
		Object obj=Proxy.newProxyInstance(seller.getClass().getClassLoader(),
						new Class[] {ShoeSeller.class,Importer.class},
						new MyInvocationHandler(new Object[] {seller,importerObj}));
		ShoeSeller shop=(ShoeSeller)obj;
		System.out.println(shop.sellShoe());
		Importer importer=(Importer)obj;
		importer.doImport();
	}
}

class MyInvocationHandler implements InvocationHandler{
	Object obj[];
	public MyInvocationHandler(Object obj[]) {
		this.obj=obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object returnObject=null;
		for(Object o:obj) {
			Method m[]=o.getClass().getDeclaredMethods();
			for(Method met:m) {
				if(met.getName().equals(method.getName())) {
					met.setAccessible(true);
					returnObject=method.invoke(o, args);
				}
			}
		}
		return returnObject;
	}
}
class Container{
	public static ShoeSeller getShoeSeller() throws Exception{
		ShoeShop seller=(ShoeShop)Class.forName("day9.AdityaShoeShop").getConstructor().newInstance();
		ShoeManufacturer manufacturer=(ShoeManufacturer)Class.forName("day9.BataShoeFactory").getConstructor().newInstance();
		//dependency injection
		seller.setManufacturer(manufacturer);
		return seller;
	}
}

interface Importer{
	public void doImport();
}
class ImporterImpl implements Importer{
	@Override
	public void doImport() {
		System.out.println("do import logic called....");
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

interface ShoeSeller extends Seller{ //one interface can extend another interface.
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
		// TODO Auto-generated constructor stub
	}
	public Shoe makeShoe() {
		return new LeatherShoe();
	}
	
}

class LakhaniShoeFactory extends ShoeFactory{
	
	public LakhaniShoeFactory() {
		// TODO Auto-generated constructor stub
	}
	public Shoe makeShoe() {
		return new SportsShoe();
	}
}

class AdityaShoeShop extends ShoeShop{
	
	public AdityaShoeShop() {
		// TODO Auto-generated constructor stub
	}
	public Shoe sellShoe() {
		return getManufacturer().makeShoe();
	}
	
}
/*o/p:

day9.SportsShoe@606d8acf
aditya
day9.SportsShoe@6df97b55
do import logic called....
*/