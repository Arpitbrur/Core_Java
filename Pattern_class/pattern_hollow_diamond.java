package Pattern_class;

public class pattern_hollow_diamond {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if(i+j<=1 || i-j>=3 || j-i>=3 || i+j>=7) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}




	}

}
