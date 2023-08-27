package Array;

// 92.WAP TO CALCULATE SUM OF EVEN & ODD INDEX VALUE.
public class program_92_93 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int sum_even =0;
		int sum_odd=0;
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0) {
			sum_even = sum_even+arr[i];
			}else {
				sum_odd = sum_odd+arr[i];
			}
		}
		System.out.println("sum of even index:- "+sum_even);
		System.out.println("sum of odd index:- " +sum_odd);
	}
}
