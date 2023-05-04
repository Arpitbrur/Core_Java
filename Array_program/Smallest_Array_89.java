package Array_program;

public class Smallest_Array_89 {

	public static void main(String[] args) {
		int arr[]={10,5,30,90,12,32};
		int small = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(small>arr[i]) {
				small=arr[i];
			}		
		}
		System.out.println(small);

	}

}
