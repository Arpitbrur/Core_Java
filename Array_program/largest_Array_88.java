package Array_program;

public class largest_Array_88 {

	public static void main(String[] args) {
		int arr[]={10,20,30,90,12,32};
		int big = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(big<arr[i]) {
				big=arr[i];
			}
		
		}
		System.out.println(big);
	}

}
