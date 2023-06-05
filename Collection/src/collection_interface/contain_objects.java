package collection_interface;

import java.util.ArrayList;
import java.util.Collection;

public class contain_objects {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(12);
		c1.add(23);
		c1.add(45.8);
		c1.add(78);
		c1.add("Mohan");
		c1.add(345435);
		System.out.println(c1.contains(23));
		System.out.println(c1.contains(65));
		Collection c2 = new ArrayList();
		c2.add(33);
		c2.addAll(c1);			
		System.out.println(c2);
		System.out.println(c2.containsAll(c1));
		System.out.println(c1.containsAll(c2));
	}
}
