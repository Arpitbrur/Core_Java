package Array;
//94.WAP TO FIND MAXIMUM ELEMENT IN ODD INDEX VALUES
public class program_95 {

	public static void main(String[] args) {
		int arr[]= {10,20,13,34,16};
		int max =0;
		
		for (int i = 0; i < arr.length; i++) {
			if(i%2!=0) {
				if(arr[i]>max) {
					max = arr[i];
				}
			}
		}
		System.out.println(max);
	}
}
