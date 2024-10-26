package list;

import java.util.*;

public class Program3 {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(34);
		l1.add(1, 10);
		System.out.println(l1);
		System.out.println((Integer)l1.get(1)+100+(Integer)l1.get(0));
	}

}
