package iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program1 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(23);
		c1.add(45.6);
		c1.add("Mohan");
		c1.add(45);
		c1.add(44.7);
		c1.add("Sohan");
		removeString(c1);
		
	}
	public static void removeString(Collection c) {
		System.out.println("Collection Before removeString is: ");
		System.out.println(c);
		Iterator itr=c.iterator();
		while(itr.hasNext()) {
			Object o=itr.next();
			if(o instanceof String)
				itr.remove();
		}
		System.out.println("Collection After removing String is: ");
		System.out.println(c);
	}

}
