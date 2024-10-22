package iterator;

import java.util.*;

public class Program7 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(23);
		c1.add(45.7);
		c1.add(45);
		c1.add("Sohan");
		printSum(c1);
	}
	public static void printSum(Collection c) {
		System.out.println("Collection Before print sum: ");
		System.out.println(c);
		int sum=0;
		Iterator itr=c.iterator();
		while(itr.hasNext()) {
			Object o=itr.next();
			if(o instanceof Integer) {
				sum=sum+(Integer)o;
			}
		}
		System.out.println("Collection After Print sum: "+sum);
	}

}
