package looping;

public class swapping_two_no {

	public static void main(String[] args) {
		
		int a = 1;
		int b= 2;
		
		System.out.println(" Before swapping two number.."+a+""+b);
		//logic - thired variable
		
		/*int t = a;
		a=b;
		b=t;*/
		
		// logic 2nd use without using thired variable
		a= a+b;
		b=a-b;
		a=a-b;		
		
		System.out.println(" afte swapping value..."+a+""+b);

	}

}
