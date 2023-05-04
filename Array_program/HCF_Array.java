package Array_program;

public class HCF_Array {

	public static void main(String[] args) {
		int arr[]= {3,9,15,21};
		int i; int hcf=1;
		for(i=1; i<=arr[0] && i<=arr[1] && i<=arr[2] && i<=arr[3]; i++) {
			if(arr[0]%i==0 && arr[1]%i==0 && arr[2]%i==0 && arr[3]%i==0) {
				hcf=i;
			}
		}
		System.out.println("HCF is ="+hcf);
	}

}
