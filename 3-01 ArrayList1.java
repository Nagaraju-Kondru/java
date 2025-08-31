package collectionPractice;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		System.out.println("size: "+a.size());
		a.add(1);
		a.add(10);
		a.add(2);
		a.add(20);
		a.add(3);
		a.add(30);
		a.add(4);
		a.add(40);
		System.out.println(a);
		
		
//		for(Integer i:a) {
//			System.out.println(i);
//		}
//		
		//getMethod
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		//set method
		a.set(1, 100);
		System.out.println("get method: "+a);
		
		//subList method
		System.out.println("sublist: "+a.subList(0, 3));
		
		//remove
		System.out.println("remove: "+a.remove(2));
		System.out.println("after remove: "+a);
		
		//contains
		System.out.println("contains:100 "+a.contains(100));
		System.out.println("contains:200 "+a.contains(200));
		
		//clone method
		ArrayList<Integer> copy_a=(ArrayList<Integer>) a.clone();
		System.out.println("copyarray: "+copy_a);
		
		//clear
		copy_a.clear();
		System.out.println("copy array clear: "+copy_a);
		
		//is empty
		System.out.println("empty or not: "+copy_a.isEmpty());
		Collections.synchronizedList(a);
		
	}

}
