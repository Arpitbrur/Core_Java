//30.WAP TO PRINT PALINDROME NUMBER B/W 10 TO 200
package Logical_program_class;

public class program_30 {

	public static void main(String[] args) {
		int num, k, m = 0;
		for (int i = 10; i <= 200; i++) {
			num = i;
			while (num > 0){
				k = num % 10;
				m = m * 10 + k;
				num = num / 10;
			}
			if (m == i) {
				System.out.print(i + " ");
			}
			m = 0;
		}
	}
}
