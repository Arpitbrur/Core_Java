package Array_program;

public class Frequency_Array_113 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,20,30,20,30};
		int temp[]=new int[arr.length];
		for (int i = 0; i < temp.length; i++) {
			int count=1;
			for (int j = i+1; j < temp.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					temp[j]=-1;
					
				}
			}
			if(temp[i]!=-1 ) {
				System.out.println(arr[i]+ " "+ count);
			}
		}

	}

}
