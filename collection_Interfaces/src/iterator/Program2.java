package iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program2 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(23);
		c1.add(45.5);
		c1.add("Mohan");
		c1.add(43);
		c1.add(65.7);
		c1.add("Sohan");
		removeNotString(c1);
	}
	public static void removeNotString(Collection c) {
		System.out.println("Collection Before removeNotString:");
		System.out.println(c);
		Iterator itr=c.iterator();
		while(itr.hasNext()) {
			Object o=itr.next();
			if(!(o instanceof String))
				itr.remove();
		}
		System.out.println("Collection After removing");
		System.out.println(c);
	}

}
