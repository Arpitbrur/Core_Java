package collection_interface;

import java.util.ArrayList;
import java.util.Collection;

public class remove_all {

	public static void main(String[] args) {
		Collection c1 = new ArrayList<>();
		c1.add(12);
		c1.add(23);
		c1.add(45.8);
		c1.add(78);
		c1.add("Mohan");
		c1.add(345435);
		Collection c2 = new ArrayList();
		c2.add(45);
		c2.add(56);
		c2.addAll(c1);
		System.out.println(c2.containsAll(c1));
		System.out.println("=================");
		c2.removeAll(c1);
		System.out.println(c2);
	}
}
