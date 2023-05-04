package Array_program;

public class LCM_Array {

	public static void main(String[] args) {
		int arr[]= {2,4,8,12,24,16};
		int i;
		for(i=1;;i++) {
			if(i%arr[0]==0 && i%arr[1]==0 && i%arr[2]==0 && i%arr[3]==0 && i%arr[4]==0 && i%arr[5]==0) {
				{
					break;
				}
			}

		}
		System.out.println("LCM is ="+i);
	}

}
