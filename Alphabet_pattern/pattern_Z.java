package Alphabet_pattern;

public class pattern_Z {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
			if(i+j==4 || i==4 || i==0) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();

	}
	}
}
