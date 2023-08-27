package Array;
// 97.WAP TO COPY THE ONE ARRAY ELEMENT INTO THE ANOTHER ARRAY
public class program_97 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int temp[]= new int[arr.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i]=arr[i];
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}
