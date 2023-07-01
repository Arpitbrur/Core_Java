package Map;

import java.util.HashMap;
public class Hashmap {
	
	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put(0, 'a');
		h.put(1, 's');
		h.put(10, 'v');
		h.remove(10);
		System.out.println(h.get(0));
		
		System.out.println(h);
		
	}
	
}
