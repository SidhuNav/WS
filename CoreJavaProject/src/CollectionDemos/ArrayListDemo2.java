package CollectionDemos;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("N");
		
		ArrayList al_dupli=new ArrayList();
		al_dupli.addAll(al);
		System.out.println(al_dupli);
		
		al_dupli.removeAll(al);
		System.out.println(al_dupli);
	}

}
