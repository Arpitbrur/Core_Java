package Numeric_pattern;

public class Reverse_same_num_same_clm {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
