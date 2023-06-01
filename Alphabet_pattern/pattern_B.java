package Alphabet_pattern;

public class pattern_B {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==0 || i==0 && j!=4 || i==2 && j!=4 || j==4 && i!=0 && i!=2 && i!=4 ||i==4 && j!=4) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
