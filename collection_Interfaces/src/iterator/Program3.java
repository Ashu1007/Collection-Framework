package iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program3 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(23);
		c1.add(34.6);
		c1.add("Rohan");
		c1.add(43);
		c1.add(54);
		c1.add("Sohan");
		removeInteger(c1);
	}
	public static void removeInteger(Collection c) {
		System.out.println("Collection Before remove Integer: ");
		System.out.println(c);
		Iterator itr=c.iterator();
		while(itr.hasNext()) {
			Object o=itr.next();
			if(o instanceof Integer)
				itr.remove();
		}
		System.out.println("Collection After removing:");
		System.out.println(c);
	}

}
