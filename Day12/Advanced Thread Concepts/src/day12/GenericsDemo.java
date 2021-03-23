package day12;

public class GenericsDemo {
	public static void main(String[] args) {
		PaintBrush<Paint> brush=PaintContainer.getPaintBrush();
		Paint paint=(Paint)brush.obj;
		System.out.println(brush.getObj());
		PaintBrush<Water> waterBrush=WaterContainer.getPaintBrush();
		Water water=(Water)waterBrush.getObj();
		System.out.println(waterBrush.getObj());
	}
}
class PaintContainer {
	public static PaintBrush<Paint> getPaintBrush() {
		PaintBrush<Paint> pb=new PaintBrush<>();
		Paint obj=new RedPaint();
		pb.setObj(obj);
		return pb;
	}
}
class WaterContainer{
	public static PaintBrush<Water> getPaintBrush() {
		PaintBrush<Water> pb=new PaintBrush<>();
		Water obj=new Water();
		pb.setObj(obj);
		return pb;
	}
}
abstract class Paint{
	
}
class RedPaint extends Paint{
	
}
class BluePaint extends Paint{
	
}
class PaintBrush<T>{
	//Paint paint;
	//Object obj;//generic
	//real generics is
	T obj;
	public T getObj() {
		return this.obj;
	}
	public void setObj(T obj) {
		this.obj=obj;
	}
}
class Water {}