package day12;

import java.lang.reflect.Field;
public class GenericsDemo1 {
	public static void main(String[] args) throws Exception{
		PaintBrush1<Paint1> brush=PaintContainer1.getPaintBrush();
		Paint1 paint=(Paint1)brush.obj;
		System.out.println(brush.getObj());
		PaintBrush1<Water1> waterBrush=WaterContainer1.getPaintBrush();
		Water1 water=(Water1)waterBrush.getObj();
		System.out.println(waterBrush.getObj());
	}
}
class PaintContainer1 {
	public static PaintBrush1<Paint1> getPaintBrush()throws Exception {
		PaintBrush1<Paint1> pb=new PaintBrush1<>();
		Paint1 obj=new RedPaint1();
		Field field=pb.getClass().getDeclaredField("obj");
		field.setAccessible(true);
		In in=field.getAnnotation(In.class);
		if(in!=null) {
			pb.setObj(obj);//dependency injection
		}
		return pb;
	}
}
class WaterContainer1{
	public static PaintBrush1<Water1> getPaintBrush()throws Exception {
		PaintBrush1<Water1> pb=new PaintBrush1<>();
		Water1 obj=new Water1();
		Field field=pb.getClass().getDeclaredField("obj");
		field.setAccessible(true);
		In in=field.getAnnotation(In.class);
		if(in!=null) {
			String s=in.value();
			System.out.println("The value..is:"+s);
			pb.setObj(obj);//dependency injection}
		}
		return pb;
	}
}
abstract class Paint1{
	
}
class RedPaint1 extends Paint1{
	
}
class BluePaint1 extends Paint1{
	
}
class PaintBrush1<T>{
	//Paint paint;
	//Object obj;//generic
	//real generics is
	@In//(value="helloworld")
	T obj;
	public T getObj() {
		return this.obj;
	}
	public void setObj(T obj) {
		this.obj=obj;
	}
}
class Water1 {}

/*
day12.RedPaint1@6aceb1a5
The value..is:helloworld
day12.Water1@12bc6874
*/