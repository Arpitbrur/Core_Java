package Array_program;

public class Missing_Array_115 {

	public static void main(String[] args) {
		int arr[]= {18,21,24,30};
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = arr[i]+1; j < arr[i+1]; j++) {
				System.out.print(j+","+" ");
			}
		}

	}

}
