package day13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;
public class CollectionDemo1 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>(30);
		
		list.add("hello world");
		list.add("hai");
		list.add("earth");
		list.add(new String("world"));
		
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("*********************************************");
		for(Object obj:list) {
			System.out.println(obj);
		}
		
		System.out.println("*********************************************");
		Iterator<String> iter=list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println(iter.hasNext());
		
		System.out.println("************************************************");
		ListIterator<String> liter=list.listIterator();
		while(liter.hasNext()) {
			System.out.println(liter.next());
		}
		System.out.println("_______________________________________________");
		while(liter.hasPrevious()) {
			System.out.println(liter.previous());
		}
		
		System.out.println("hai is there....:"+list.contains("hai"));
		list.remove("hai");
		System.out.println("hai is there....:"+list.contains("hai"));
		list.sort((o1,o2)->{return o2.compareTo(o1);});//lambda implementation
		System.out.println(list);
		
		List list2=list.subList(0, 2);
		System.out.println(list2);
		
		Stream stream=list.stream();
	}
}
class MyComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}
class Employee{
	
}

/* O/p:
 * [hello world, hai, earth, world]
hello world
hai
earth
world
*********************************************
hello world
hai
earth
world
*********************************************
hello world
hai
earth
world
false
************************************************
hello world
hai
earth
world
_______________________________________________
world
earth
hai
hello world
hai is there....:true
hai is there....:false
[world, hello world, earth]
[world, hello world]
*/
