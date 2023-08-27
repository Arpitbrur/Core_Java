package Numeric_pattern;

public class Snake_pattern {

	public static void main(String[] args) {
		int count =1;
		for(int i=1; i<=4; i++) {
			if(i%2!=0) {
				for(int j=1; j<=4; j++) {
					System.out.print(count+" ");
					count++;
				}
			}else {
				int store = count+3;
				for(int j=4; j>=1; j--) {
					System.out.print(store+" ");
					store--;
					count++;
				}
			}
			System.out.println();
		}
	}
}
