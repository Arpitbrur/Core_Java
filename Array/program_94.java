package Array;
// 94.WAP TO FIND MAXIMUM ELEMENT IN EVEN INDEX VALUES
public class program_94 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int max =0;
		for(int i = 0;i<arr.length;i++) {
			if(i%2==0) {                   //even index sum   //if(i%2==1) //odd index sum	           		                                     	
				if(arr[i]>max){
					max=arr[i];
				}
			}			
		}
		System.out.println("maximum number at even index:- "+max);
	}
	
	
}
