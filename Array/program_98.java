package Array;
// 98. WAP TO COPY THE ARRAY ELEMENTS IN REVERSE ORDER AND PRINT IT
public class program_98 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int temp[]= new int[arr.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i]=arr[i];
		}
		for (int i = temp.length-1 ; i>=0; i--) {
			System.out.println(temp[i]);
		}
	}
}
