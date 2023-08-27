package Array;
// 90.WAP TO PRINT EVEN & ODD INDEX VALUES IN AN ARRAY.
public class program_90_91 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0) {
				System.out.println("even index value:- "+arr[i]);
			}else {
				System.out.println("odd index value:- "+arr[i]);
			}
		}
	}
}
