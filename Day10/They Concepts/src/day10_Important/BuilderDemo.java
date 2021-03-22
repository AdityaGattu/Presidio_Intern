package day10_Important;

public class BuilderDemo {
	public static void main(String[] args) {
		Computer myComputer=new Computer.ComputerBuilder("i7 core processor","12gb").build();
		
		System.out.println(myComputer);
		
		Computer myCom2=new Computer.ComputerBuilder("18 core proccsss","16gb ram").setGraphicsCard("graphics card")
												.setHdd("my new hdd").build();
		
		System.out.println(myCom2);
	}
}
class Computer{
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
	public static class ComputerBuilder{
		//fixed properties
		private String motherBoard;
		private String ram;
		//optional Properties
		private String graphicsCard;
		private String hdd;
		
		public ComputerBuilder(String motherBoard,String ram) {
			this.motherBoard=motherBoard;
			this.ram=ram;
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
Computer [motherBoard=i7 core processor, ram=12gb, graphicsCard=null, hdd=null]
Computer [motherBoard=18 core proccsss, ram=16gb ram, graphicsCard=graphics card, hdd=my new hdd]
*/