package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class CollectionDemo4 {
	public static void main(String[] args) {
	//	Map<String,String> map=new HashMap<String, String>();
//		Map<String,String> map=new TreeMap<String, String>((o1,o2)->{return o2.compareTo(o1);});
//		
//		map.put("a2", "hello");
//		map.put("a3", "hai");
//		map.put("a1", "world");
		
		Map<Emp,String> map=new TreeMap<Emp, String>((o1,o2)->{return o2.compareTo(o1);});
		map.put(new Emp(300), "hello");
		map.put(new Emp(200), "world");
		map.put(new Emp(100),"hai");
		
		System.out.println(map);
		
		Set<Map.Entry<Emp,String>> s=map.entrySet();
		Iterator<Map.Entry<Emp,String>> iter=s.iterator();
		while(iter.hasNext()) {
			Map.Entry<Emp,String> me=iter.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
	}
}	
class Emp implements Comparable<Emp>{
	Integer eid;
	public Emp(Integer eid) {
		this.eid=eid;
	}
	@Override
	public String toString() {
		return ""+this.eid;
	}
	@Override
	public int compareTo(Emp o) {
		return eid.compareTo(o.eid);
	}
}

/*
{300=hello, 200=world, 100=hai}
300:hello
200:world
100:hai
*/