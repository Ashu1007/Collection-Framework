package iterator;

import java.util.*;

public class Program8 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(34);
		c1.add(35);
		c1.add(36);
		c1.add("Sohan");
		c1.add(54.7);
		c1.add(45);
		printSumEvenInteger(c1);
	}
	public static void printSumEvenInteger(Collection c) {
		System.out.println("Collection Before Print Sum Even Integer: ");
		System.out.println(c);
		int sum=0;
		Iterator itr=c.iterator();
		while(itr.hasNext()) {
			Object o=itr.next();
			if(o instanceof Integer && (Integer)o%2==0) {
				sum=sum+(Integer)o;
			}
		}
		System.out.println("Collection After print Sum Even Integer: "+sum);
	}

}
