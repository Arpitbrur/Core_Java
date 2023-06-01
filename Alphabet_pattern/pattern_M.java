package Alphabet_pattern;

public class pattern_M {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5;j++) {
				//if(j==0 || j==4 || i==0 && j!=2 && j!=3 && j!=1 ||i==1 &&j!=2 || i==2 && j!=1 && j!=3 ) {
				if(i==j && i<=2||i+j==4 && i<=2|| j==0 || j==4) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}


	}

}
