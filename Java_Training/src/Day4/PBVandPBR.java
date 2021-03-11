package Day4;

public class PBVandPBR {
	public static void main(String[] args) {
		
		Laddu laddu=new Laddu();
		System.out.println("Size of original laddu...:"+laddu.size);
		
		PassByValue pbv=new PassByValue();
		pbv.getLaddu(laddu.size);
		
		System.out.println("size of laddu after PBV...:"+laddu.size);
		//in pass by value, a copy of the variable is passed, so the original will not change...
		
		PassByRef pbr=new PassByRef();
		pbr.getLaddu(laddu);
		//in case of pass by reference (laddu), then a copy is not made, but rather the original is supplied/passed
		System.out.println("size of laddu after PBR....:"+laddu.size);
		
	}
}
class Laddu{
	int size=10;
}
class PassByValue{
	public void getLaddu(int size) {
		size=0;
	}
}
class PassByRef{
	public void getLaddu(Laddu laddu) {
		laddu.size=0;
	}
}
