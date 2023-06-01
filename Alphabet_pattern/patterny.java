package Alphabet_pattern;

public class patterny {

	public static void main(String[] args) {
		for(int i=0; i<7; i++) {
			for(int j=0; j<7;j++) {
				if(i==j && i<=3|| i+j==4 && i<=3 || j==39 && j+i>4 )  {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}


	}

}
