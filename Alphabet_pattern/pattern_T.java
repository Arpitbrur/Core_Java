package Alphabet_pattern;

public class pattern_T {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i==0 || j==2) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
