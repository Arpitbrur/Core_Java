package Alphabet_pattern;

public class pattern_S {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5;j++) {
				if(i==0 && j!=0 || j==0 && i!=3 && i!=0 &&i!=2||i==2 && j!=4 &&j!=0||j==4 && i!=1 &&i!=2 &&i!=4|| i==4 &&j!=4 ) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}


	}

}
