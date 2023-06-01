package Alphabet_pattern;

public class pattern_Y {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i==j && i<=2 || i+j==4 && i<=2 || j==2 && j+i>4) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}


	}

}
