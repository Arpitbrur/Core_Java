package Array_program;

public class Sum_of_even_array_83_84 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int sum_even=0;
		int sum_odd=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				sum_even= sum_even+arr[i];		
			}else {
				sum_odd=sum_odd+arr[i];
			}
		}
		System.out.println("Sum of even array ="+sum_even);
		System.out.println("Sum of odd Array ="+ sum_odd);
	}

}
