package Array_program;

public class even_index_90 {

	public static void main(String[] args) {
		int arr[]= {10,11,12,13,14};

		for (int i = 0; i < arr.length; i++) {
			if(i%2==0) {
				System.out.println("Even Index ="+arr[i]);
			}
//			else {
//				System.out.println("odd Number ="+arr[i]);
//			}
		}
	}

}
