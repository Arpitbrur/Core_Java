package Alphabet_pattern;

public class pattern_E {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for (int j=0; j<4; j++) {
				if(i==0 ||j==0 ||i==2 && j!=3 ||i==4) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
