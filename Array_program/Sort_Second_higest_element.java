package Array_program;

public class Sort_Second_higest_element {

	public static void main(String[] args) {
		int arr[]= {60,10,30,12,40,50};
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length-1; i++) {
				if(arr[i]> arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			}
			System.out.println("Higest element="+ arr[arr.length-1]);
			System.out.println("Second higest Element="+ arr[arr.length-2]);
		}


}
