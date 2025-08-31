package collectionPractice;
import java.util.Stack;
public class Stack1 {

	public static void main(String[] args) {
		Stack<String> str=new Stack<>();
		str.push("A");
		str.push("B");
		str.push("C");
		str.push("D");
		str.push("E");
		System.out.println(str);
		//LIFO
		System.out.println("Peek: "+str.peek());
		
		System.out.println("Pop:"+str.pop());
		System.out.println("Search:"+str.search("D"));
		System.out.println("Search:"+str.search("F"));
		System.out.println("Empty: "+str.empty());
		str.clear();
		System.out.println("Empty: "+str.empty());
		System.out.println("isEmpty: "+str.isEmpty());

	}

}
