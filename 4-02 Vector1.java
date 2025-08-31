package collectionPractice;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		Vector<Integer> a=new Vector<>(3);
		System.out.println("size: "+v.size());
		System.out.println("capacity:"+v.capacity());
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add(200);
		v.add(32);
		v.add(1);
		v.add(4);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		//create new vector object
		
		Vector v1=new Vector();
		v1.add(1);
		v1.add(2);
		System.out.println(v1);
		
		//adding v1 data to v
		v.addAll(v1);
		System.out.println(v);
		
		//remove v1 data in v
		v.removeAll(v1);
		System.out.println("removeall: "+v);
		
		//verification of list
		System.out.println("verify: "+v.contains("A"));
		System.out.println("verify all: "+v.containsAll(v1));
		
		//get the data
		System.out.println(v.get(1));
		
		//update
		v.set(1,"BB");
		System.out.println(v);
		
		//indexOf
		System.out.println("index of C: "+v.indexOf("C"));
      //System.out.println("last index of: "+v.lastIndexOf(""))
		
		//first element and last element
		System.out.println("first element: "+v.firstElement());
		System.out.println("last element: "+v.lastElement());
		
		//add element
		v.addElement(5000);
		System.out.println(v);
		
		//insert element
		v.insertElementAt("hello", 7);
		System.out.println(v);
		
		
		//a vector
		System.out.println(a);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println(a);
		System.out.println("size: "+a.size());
		
		//retainAll
		v.retainAll(a);
		System.out.println(v);
		
		

	}

}
