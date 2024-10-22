package iterator;

import java.util.*;

public class Program6 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(34);
		c1.add(45.6);
		c1.add("Rohan");
		c1.add(34);
		c1.add(36);
		c1.add(45);
		c1.add(45.6);
		c1.add("Sohan");
		countEvenInteger(c1);
	}
	public static void countEvenInteger(Collection c) {
		System.out.println("Collection Before count: ");
		System.out.println(c);
		int count=0;
		Iterator itr=c.iterator();
		while(itr.hasNext()) {
			Object o=itr.next();
			if(o instanceof Integer && (Integer)o%2==0) {
				count++;
			}
		}
		System.out.println("Collection After even count: "+count);
	}

}
