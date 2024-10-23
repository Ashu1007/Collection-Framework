package iterator;

import java.util.*;

public class Program9 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(34);
		c1.add(55);
		c1.add(45);
		c1.add(45);
		c1.add("Sohan");
		c1.add(56.7);
		bigAndSmallPrint(c1);
	}
	public static void bigAndSmallPrint(Collection c) {
		System.out.println("Collection is: ");
		System.out.println(c);
		int big=Integer.MIN_VALUE;
		int small=Integer.MAX_VALUE;
		Iterator itr=c.iterator();
		while(itr.hasNext()) {
			Object o=itr.next();
			if(o instanceof Integer) {
				int temp=(Integer)o;
				if(temp>big)
					big=temp;
				if(temp<small)
					small=temp;
			}
		}
		System.out.println("Biggest is: "+big);
		System.out.println("Smallest is: "+small);
	}

}
