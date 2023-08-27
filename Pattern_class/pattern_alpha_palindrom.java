package Pattern_class;

public class pattern_alpha_palindrom {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			char k=65;
			for(int j=0; j<5; j++) {
				if(i>=j) {
					System.out.print(k++%2 +" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
}
