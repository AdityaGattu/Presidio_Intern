package day6;
public class ObjectCreationDemo1 {
	public static void main(String[] args)throws Exception {
		MyBusinessLogic1 myb=MyBusinessLogic1.createObject();
		myb.str="first object...";
		MyBusinessLogic1 myb2=MyBusinessLogic1.createObject();
		myb2.str="second object...";
		
		myb.setDataLogic(DataLogic.createObject());
		System.out.println(myb.getDataLogic());
		myb.setDataLogic(DataLogic.createObject());
		System.out.println(myb.getDataLogic());
		
		myb.setDataLogic(DataLogic.createObject());
		myb.setDataLogic(DataLogic.createObject());
		
		System.out.println(myb.str);
	}
}
class MyBusinessLogic1 implements Cloneable{
	String str;
	DataLogic dataLogic;
	
	public final DataLogic getDataLogic() {
		return dataLogic;
	}
	public final void setDataLogic(DataLogic dataLogic) {
		this.dataLogic = dataLogic;
	}
	private MyBusinessLogic1() {
		System.out.println("cons called...");		
	}
	private static MyBusinessLogic1 myb;
	synchronized public static MyBusinessLogic1 createObject() throws Exception{
		if(myb==null) {
			myb=new MyBusinessLogic1();
		}
		return myb.createClone();		
	}
	public  MyBusinessLogic1 createClone()throws Exception {	
			return (MyBusinessLogic1)super.clone();		
	}
}
class DataLogic implements Cloneable{
	private DataLogic() {
		System.out.println("DataLogic cons called...");		
	}
	private static DataLogic myb;
	synchronized public static DataLogic createObject() throws Exception{
		if(myb==null) {
			myb=new DataLogic();
		}
		return myb.createClone();		
	}
	public  DataLogic createClone()throws Exception {	
			return (DataLogic)super.clone();		
	}
}
//My Resources are shared but still properties are unique...