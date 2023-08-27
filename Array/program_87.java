package Array;
// 87.WAP TO CHECK ARRAYLENGTH WITHOUT USING LENGTH VARIABLE
public class program_87 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int count =0;
		for (int i : arr) {
			count++;
		}
		System.out.println("length of array is:- "+count);
	}
}
