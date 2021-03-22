package day10;
public class BuilderDemo {
	public static void main(String[] args) throws Exception {
		Computer myComputer=Computer.ComputerBuilder.createObject("i7 core processor","12gb").build();
		
		System.out.println(myComputer);
		
		Computer myCom2=Computer.ComputerBuilder.createObject("18 core proccsss","16gb ram").setGraphicsCard("graphics card")
												.setHdd("my new hdd").build();
		System.out.println(myCom2);
		
		myCom2.setHdd("2tb");
		System.out.println(myCom2);
	}
}

class Computer implements Cloneable{
	
	//fixed properties
	private String motherBoard;
	private String ram;
	public String getMotherBoard() {
		return motherBoard;
	}
	
	public void setMotherBoard(String motherBoard) {
		this.motherBoard = motherBoard;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getGraphicsCard() {
		return graphicsCard;
	}
	public void setGraphicsCard(String graphicsCard) {
		this.graphicsCard = graphicsCard;
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	//optional Properties
	private String graphicsCard;
	private String hdd;
	
	@Override
	public String toString() {
		return "Computer [motherBoard=" + motherBoard + ", ram=" + ram + ", graphicsCard=" + graphicsCard + ", hdd="
				+ hdd + "]";
	}
	public Computer(ComputerBuilder builder) {
		this.motherBoard=builder.motherBoard;
		this.ram=builder.ram;
		this.graphicsCard=builder.getGraphicsCard();
		this.hdd=builder.getHdd();
	}
	public static class ComputerBuilder implements Cloneable{
		//fixed properties
		private String motherBoard;
		public String getMotherBoard() {
			return motherBoard;
		}
		public ComputerBuilder setMotherBoard(String motherBoard) {
			this.motherBoard = motherBoard;
			return this;
		}
		private String ram;
		//optional Properties
		private String graphicsCard;
		public String getRam() {
			return ram;
		}
		public ComputerBuilder setRam(String ram) {
			this.ram = ram;
			return this;
		}
		private String hdd;
		
		private ComputerBuilder() {
			System.out.println("ComputerBuilder...cons called...");		
		}
		private static ComputerBuilder myb1;
		synchronized public static ComputerBuilder createObject(String MotherBoard,String ram) throws Exception{
			if(myb1==null) {
				myb1=new ComputerBuilder().setRam(ram).setMotherBoard(MotherBoard);
			}
			return myb1.createClone();		
		}
		public  ComputerBuilder createClone()throws Exception {	
				return (ComputerBuilder)super.clone();		
		
		}
		
				
		
		public String getGraphicsCard() {
			return graphicsCard;
		}
		public ComputerBuilder setGraphicsCard(String graphicsCard) {
			this.graphicsCard = graphicsCard;
			return this;
		}
		public String getHdd() {
			return hdd;
		}
		public ComputerBuilder setHdd(String hdd) {
			this.hdd = hdd;
			return this;
		}
		public Computer build() {
			return new Computer(this);
		}
	}
	
}


/*
ComputerBuilder...cons called...
Computer [motherBoard=i7 core processor, ram=12gb, graphicsCard=null, hdd=null]
Computer [motherBoard=i7 core processor, ram=12gb, graphicsCard=graphics card, hdd=my new hdd]
Computer [motherBoard=i7 core processor, ram=12gb, graphicsCard=graphics card, hdd=2tb]
*/