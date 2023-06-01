package UnBoxing;

public class Object_into_dataType {

	public static void main(String[] args) {
		//we can convert object type data into its original type form by using of wrapper class.
		Object a = 243243;
		int i = (int) a;
		System.out.println(i);
		
		Object b = 4543.345;
		double d = (double) b ;
		System.out.println(d);
	}
}
