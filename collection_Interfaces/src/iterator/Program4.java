package iterator;

import java.util.*;

public class Program4 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(23);
		c1.add(54.7);
		c1.add("Sohan");
		c1.add(67);
		c1.add(54);
		c1.add("Rohan");
		removeNotInteger(c1);
	}
	public static void removeNotInteger(Collection c) {
		System.out.println("Collection Before remove not integer: ");
		System.out.println(c);
		System.out.println("==================");
		Iterator itr=c.iterator();
		while(itr.hasNext()) {
			Object o=itr.next();
//			System.out.println(c);
			if(!(o instanceof Integer))
				itr.remove();
		}
		System.out.println("After the removing Collection:");
		System.out.println(c);
	}
	
}
