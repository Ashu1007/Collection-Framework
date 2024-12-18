package iterator;

import java.util.*;

public class Program5 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(23);
		c1.add(45.7);
		c1.add("Sohan");
		c1.add(54);
		c1.add(56);
		c1.add("Rohan");
		countInteger(c1);
	}
	public static void countInteger(Collection c) {
		System.out.println("Collection Before count Integer: ");
		System.out.println(c);
		int count =0;
		Iterator itr=c.iterator();
		while(itr.hasNext()) {
			Object o=itr.next();
			if(o instanceof Integer)
				count++;
		}
		System.out.println("\nCollection After count Integer: "+count);
	}

}
