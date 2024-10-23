package list;

import java.util.*;

public class Program2 {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(34);
		l1.add(1, 50);
		System.out.println(l1);
		l1.add(0, 35);
		System.out.println(l1);
		l1.add(null);
		l1.add(4, 55);
		System.out.println(l1);
		l1.add(null);
		System.out.println(l1);
	}

}
