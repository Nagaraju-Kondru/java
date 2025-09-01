
import java.util.LinkedList;
public class LinkedList1 {
	public static void main(String args[]) {
		LinkedList<String> a=new LinkedList<>();
		a.add(null);
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		System.out.println(a);
//  adding Element is Linked list
		//set
		System.out.println();
		System.out.println("Adding Elements in Linked List");
		//add first
		a.addFirst("first");
		System.out.println("add first: "+a);
		//add last
		a.addLast("last");
		System.out.println("add last: "+a);
		//offer
		a.offer("offer");
		System.out.println("offer: "+a);
		//offer first
		a.offerFirst("offerfirst");
		System.out.println("offer first: "+a);
		//offer last
		a.offerLast("offerlast");
		System.out.println("offer last: "+a);
		
		// Retrive the Elements in Linked List
		System.out.println();
		System.out.println("Retrive the Elements in Linked List");
		//element
		System.out.println("element: "+a.element());
		//get
		System.out.println("get: "+a.get(2));
		//getfirst
		System.out.println("get first: "+a.getFirst());
        //getlast
		System.out.println("get last: "+a.getLast());
		//peek
		System.out.println("peek: "+a.peek());
		//peek first
		System.out.println("peek first:"+a.peekFirst());
		//peek last
		System.out.println("peek last: "+a.peekLast());
		
//  Remove Element in linkedlist		
	System.out.println();
	System.out.println("Remove Element in linkedlist");
	System.out.println(a);
	//poll
	System.out.println("poll: "+a.poll());
	System.out.println("after poll: "+a);
	//poll first
	System.out.println("poll first: "+a.pollFirst());
	System.out.println("after poll first: "+a.pollLast());
	//poll last
	System.out.println("poll last: "+a.pollLast());
	System.out.println("after poll Last: "+a);
	//remove
	//removefirst
	//remove last

// Replace element in linked list
	System.out.println();
	System.out.println("Replace element in linked list");
	a.set(1, "nagaraju");
	System.out.println("after set: "+a);
	//to array
	System.out.println(a.toArray());	
	}
}
