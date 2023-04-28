package CollectionDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Declare ArrayList
		//ArrayList<Integer> al=new ArrayList<Integer>();
		//List al=new ArrayLis();
		ArrayList al=new ArrayList();		
		
		//add new element to ArrayList
		al.add(100);
		al.add("Welcome");
		al.add(15.5);
		al.add(true);
		al.add('A');
		
		System.out.println(al);		//[100, welcome, 15.5 true, A]
		
		//size()
		System.out.println("Number of elements in arrayList is = "+al.size());
		
		//remote
		al.remove(1);	//here 1 is index
		//al.remove("Welcome");	//welcome is element
		System.out.println("After removing element from ArrayList = "+al);
		
		//insert a new element
		//add(index,object)
		al.add(1,"Welcome to Hell");
		System.out.println("After adding  element from ArrayList = "+al);

		//retrieve specific value
		System.out.println(al.get(2));
		
		//change element/replace
		al.set(4, "C");
		System.out.println("After replacing  element from ArrayList = "+al);
		
		//search - contains() - return true/false
		System.out.println("C");		//true
		System.out.println("C++");		//false
		
		//isEmpty()
		System.out.println(al.isEmpty());
		
		//Reading Data with diiferent methods
		//1) for loop
		System.out.println("------------With For Loop ---------");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}

		//2nd enchanced loop
		System.out.println("------------With Enchance For Loop ---------");
		for(Object z:al)
		{
			System.out.println(z);
		}
		
		//3rd with Iterator
		System.out.println("------------With Iterator ---------");
		//Iterator - is an Interface of collection 
		//iterator() is method of collection which is a part of Java.utils
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());	//print element and move to next
		}
		
		
		
	}

}
