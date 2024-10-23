package list;

import java.util.*;

public class Program1 {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(34);
		l1.add(45.5);
		System.out.println(l1.get(0));
		System.out.println(l1.get(1));
		System.out.println((Integer)l1.get(0)+100);
		System.out.println(l1);
		
	}

}
