//    *     
//  * * *   
//* * * * * 
//  * * *   
//    *     

package Pattern_class;

public class pattern_diamond1 {

	public static void main(String[] args) {
		for(int i=0; i<9; i++) {
			for (int j=0; j<9; j++) {
				if(i>=j && i+j>=8) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		for(int i=1; i<9; i++) {
			for (int j=0; j<9; j++) {
				if(i<=j && i+j<=8) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
