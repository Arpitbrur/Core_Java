package Pattern_class;

public class pattern_aplha_row {

	public static void main(String[] args) {
		char k='A';
		for(int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if(i>=j) {
					System.out.print(k++ +" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}


	}

}
