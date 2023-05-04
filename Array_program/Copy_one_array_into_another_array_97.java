package Array_program;

public class Copy_one_array_into_another_array_97 {

	public static void main(String[] args) {
		int arr[]= {10,90,30,40,50};
		int temp[]= new int[arr.length];
		for (int i = 0;  i< temp.length; i++) {
			temp[i]=arr[i];
			
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}

	}

}
