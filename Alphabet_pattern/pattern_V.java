package Alphabet_pattern;

public class pattern_V {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5;j++) {
				if( j==0 && i!=4|| j==2 && i!=4||i==4 && j!=3 && j!=4 && j!=0 && j!=2) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}


	}

}
