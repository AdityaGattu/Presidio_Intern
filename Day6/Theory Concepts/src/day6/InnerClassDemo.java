package day6;
public class InnerClassDemo {
	public static void main(String[] args) {
		//Cola campaCola=new CampaCola();
		//Cola campaCola=new Kalimark().new CampaCola();
		//Cola campaCola=new Kalimark().trojan(); //or I can also do hacking...
		Pepsi pepsiCo=new Pepsi();
		Kalimark kali=new Kalimark();
		
		//pepsiCo.setCola(campaCola);
		//kali.setCola(campaCola);
		kali.sellBovontoCola();
		pepsiCo.sellPepsiCola();
		
	}
}
//abstract class Cola{
//	public abstract void makeCola();
//}
interface Cola{
	public void makeCola();
}
class Pepsi{
	private Cola cola;
	public void setCola(Cola cola) {
		this.cola=cola;
	}
	public void sellPepsiCola() {
		//Pepsi purchases cola from campacola and fills it in pepsi bottle
		cola.makeCola();
		System.out.println("Pepsi cola ready...");
	}
}
class Kalimark{
	private Cola cola;
	public void setCola(Cola cola) {
		this.cola=cola;
	}
	public static void makeBovontoCola() {
		System.out.println("campa cola logic copied..to create cola....");
	}
	public void sellBovontoCola() {
		//local inner class - a class defined inside a method...
//		class CampaCola extends Cola{
//			@Override
//			public void makeCola() {
//				System.out.println("campa cola create cola....");
//			}
//		}
		//merging
		//anonymous inner classes (1. anonymous 2. method refrencing 3. Lambda)
		//1. anonymous
//		new Cola() {			
//			@Override
//			public void makeCola() {
//				System.out.println("campa cola create cola....");
//			}
//		}.makeCola();
		//2. Method refrencing - (this works only with interfaces)
		//Cola cola=Kalimark::makeBovontoCola;
		
		//3.  Lamda - (this also works only with interfaces)
		Cola cola=()->{
			System.out.println("campa cola logic copied to create cola .....-lambda way");
			};
		//Pepsi purchases cola from campacola and fills it in pepsi bottle
		//setCola(new CampaCola());
		cola.makeCola();
		System.out.println("bovonto cola ready...");
	}
	
//	public Cola trojan() {
//		return new CampaCola();
//	}
}