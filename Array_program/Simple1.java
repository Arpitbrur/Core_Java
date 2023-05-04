package Array_program;

public class Simple1 {
	// By using new keyword
	public static void main(String[] args) {
		//int arr[]= new int[5];
		String ar[]= new String[5];
		// if we are not giving any value at any index then its consider only default value
//		arr[0]=37;
//		arr[2]=10;
//		arr[4]=50;
		ar[0]="hello";
		ar[1]="I";
		ar[2]="am";
		ar[3]="your";
		ar[4]="dad";
		
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}

	}

}
