package Alphabet_pattern;

public class pattern_Q {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5;j++) {
				if(i==j && i>=2||j==0 &&i!=4 && i!=3 &&i!=0 ||j==3 && i!=0 &&i!=4 && i!=3||i==0 && j!=3&& j!=4 &&j!=0|| i==3 && j!=4 &&j!=3 && j!=0) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
}
