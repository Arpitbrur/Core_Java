package Pattern_class;

public class pattern_num_inc {

	public static void main(String[] args) {
		int k=1;
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
