package Logical_program_class;

public class program59 {

	public static void main(String[] args) {
		for(int z=10;z<100;z++) {
		int i = z;
		int j=i%10;
		int k = i/10;
		int res = (j+k)+(j*k);
	
		if(res==i) {
			System.out.println("it is Special number="+res);
		}//else {
			//System.out.println(" it is not Spaecial number");
		//}
		}

	}

}
