package Array_program;

public class Sort_by_method {

	public static void main(String[] args) {
		
		sortArray();
	}
	public static void sortArray() {
		int arr[]= {10,20,23,1,40};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int j=0; j<arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
}
