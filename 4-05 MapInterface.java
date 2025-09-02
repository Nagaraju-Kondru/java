package collectionPractice;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
public class MapInterface {
	public static void main(String args[]) {
		Map<Integer,String> m=new HashMap<>();
		m.put(100,"Java");
		m.put(101, "C++");
		m.put(102,"SpringBoot");
		m.put(103,"Python");
		System.out.println(m);
		
//put if absent the value
		m.replace(101, "C");
		m.putIfAbsent(103, "Hibernate");
		m.putIfAbsent(104,"ReactJs");
		System.out.println("after put if absent: "+m);
		
//retrival value from the map
		System.out.println("get: "+m.get(102));

//get keys from map
		System.out.println("------------keys--------------------");
		Set<Integer> keys=m.keySet();
		for(Integer key:keys){
			System.out.println(key);
		}
		
//get values from map
		System.out.println("-------------Values----------------");
		Collection<String> values=m.values();
		for(String value:values) {
			System.out.println(value);
		}
//verification keys elements in map
		System.out.println("------verify keys------------");
		System.out.println(m.containsKey(102));
		System.out.println(m.containsKey(109));
	
//verification values elements in map
				System.out.println("------verify values------------");
				System.out.println(m.containsValue("Python"));
				System.out.println(m.containsValue("hello"));
//return keys with values	
				System.out.println("-----------return keys with values--------	");
				Set<Entry<Integer,String>> entries=m.entrySet();
				for(Entry<Integer,String>entry:entries) {
					System.out.println(entry);
				}
//return keys and values another method
			System.out.println("------------------------------------");
			System.out.println(m.entrySet());
			
//return keys and values another method
			System.out.println("------------------------------------");
			for(Entry<Integer,String> entry:m.entrySet()) {
				System.out.println(entry);
			}
			
		   System.out.println("key set: "+m.keySet());
		   System.out.println("key values: "+m.values());
				
	}
}
