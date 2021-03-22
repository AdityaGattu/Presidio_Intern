package day10_mywork;

import day10_mywork.Computer;
import day10_mywork.FixedProperties;

public class Builder_Decorator_Prototype {

	public static void main(String[] args) {
		
		Computer c=new FixedProperties("i7 processor","8gb ram");
		c.display();
		
		Computer c1=new OptionalProperties(new FixedProperties("i9 processor","16gb ram")).setGraphiccard("nvidiea").setHdd("256gb");
		c1.display();
	}
}	


abstract class Computer{
	
	public abstract void display();
}

class FixedProperties extends Computer{
	
	FixedProperties(){
		
	}
	private String motherBoard;
	private String ram;
	
	
	FixedProperties(String motherBoard,String ram){
		this.motherBoard=motherBoard;
		this.ram=ram;
	}
	
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getMotherBoard() {
		return motherBoard;
	}
	public void setMotherBoard(String motherBoard) {
		this.motherBoard = motherBoard;
	}
	
	public void display() {
		 System.out.println("Computer [motherBoard=" + motherBoard + ", ram=" + ram +"]");
	}
	
}

class OptionalProperties extends Computer{
	
	private FixedProperties fp;
	
	public OptionalProperties(FixedProperties comp) {
		this.fp=comp;
	}
	private String graphiccard;
	private String hdd;
	
	
	public String getGraphiccard() {
		return graphiccard;
	}
	public OptionalProperties setGraphiccard(String graphiccard) {
		this.graphiccard = graphiccard;
		return this;
	}

	public String getHdd() {
		return hdd;
	}

	public OptionalProperties setHdd(String hdd) {
		this.hdd = hdd;
		return this;
	}
	
	public void display() {
		System.out.println("Computer [motherBoard=" + fp.getMotherBoard() + ", ram=" + fp.getRam() + ", graphicsCard=" + this.getGraphiccard() + ", hdd="
				+ this.getHdd() + "]");
		
	}
	
	
	
}

