package lab2;

/*  Create a class Student consisting of name and rollno as members. 
 *  Create a class exam inheriting student. It can have marks for 3 subjects.
 *  Create a class result inheriting exam contaning totalmark as member 
 *  and a function to calculate the totalmark
 */

class Student {
	String name;
	int rollno;
	
	Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	
}

class Exam extends Student{
	int math;
	int science;
	int eng;
	
	Exam(String name,int rollno,int x,int y,int z){
		super(name,rollno);
		this.math=x;
		this.science=y;
		this.eng=z;
	}
	
}

class Result extends Exam{
	
	int res;
	
	Result(String name, int rollno, int x, int y, int z) {
		super(name, rollno, x, y, z);
	}

	public void totalmark()
	{
		res=math+science+eng;
		System.out.println("Student "+this.name+" rollno: "+this.rollno+" obtained totol marks are:  "+this.res);
		
	}
}
public class q14 {
	public static void main(String[] args) {
		
		Result res=new Result("aditya",2,75,80,90);
		res.totalmark();
	}

}
//o/p:
//Student aditya rollno: 2 obtained totol marks are:  245