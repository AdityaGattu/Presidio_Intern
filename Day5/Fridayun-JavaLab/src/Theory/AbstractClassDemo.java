package Theory;

//An abstract class is a class which is used to represent a common noun
//All commons nouns are by default abstract
//Abstract class represents kind of relationship
//Helps to create classification or part whole hierarchy
//we classify for gaining 6 advantages...
//its compulsory that we declare the parent classification class as ABSTRACT
//Because abstracts don't  exists in real life.
//for example - can u see Paint,car,bus,table,chair etc - they are abstract
//meaning of abstract is overview

public class AbstractClassDemo {
	public static void main(String[] args) {
		PaintBrush brush=new PaintBrush();
		//dependency injection
		brush.paint=new RedPaint();
		brush.doPaint();
	}
}
//paintbrush is closed for modification but open for extension
class PaintBrush{
	Paint paint;
	public void doPaint() {
		System.out.println(paint);
	}
}
abstract class Paint{
	
}
class RedPaint extends Paint{
	
}
class BluePaint extends Paint{
	
}
class PinkPaint extends Paint{
	
}
/*
 *  with the help of inheritance we created a hierarchy.
 *  we made the paintbrush reusable as an object
 *  we eliminated if-else-condition
 *  How to eliminate the if-else-if
 *  a. convert the condition to classes.
 *  b. Group them uner a hierarchy (inheritance)
 *  c. Create a associaiton (relation) between the using (PaintBrush) class and Hierarchial classifier class (Paint)
*/
