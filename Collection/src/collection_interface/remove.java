package collection_interface;

import java.util.ArrayList;
import java.util.Collection;

public class remove {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(12);
		c1.add(23);
		c1.add(45.8);
		c1.add(78);
		c1.add("Mohan");
		c1.add(345435);
		c1.add(23);
		c1.remove(78);
		System.out.println(c1);
		
		
	}
}
