package Array_program;

public class Array_2D_3_into_5 {

	public static void main(String[] args) {
		int arr[][]= {{10,20,30},{12,32,31},{11,22,33},{44,65,32},{87,56,34}};
		int temp[][]=new int[3][5];
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				temp[i][j]=arr[j][i];
			}
		}
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp.length; j++) {
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
	}

}
