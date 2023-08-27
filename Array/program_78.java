package Array;

import java.util.Scanner;

// 78.WAJP TO STORE RCB PLAYERS NAME IN AN ARRAY AND DISPLAY IT
//viratKholi, Duplasis, Maxwell, Dinesh, Hasranga, Siraj, Harshal, AkashDeep, FinnAlen, AnujRawat,KarnSharma

public class program_78 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String player[] = new String[11];
		System.out.println("Enter the player name");
		player[0] = scanner.next();
		player[1] = scanner.next();
		player[2] = scanner.next();
		player[3] = scanner.next();
		player[4] = scanner.next();
		player[5] = scanner.next();
		player[6] = scanner.next();
		player[7] = scanner.next();
		player[8] = scanner.next();
		player[9] = scanner.next();
		player[10] = scanner.next();
		
		for (int i = 0; i < player.length; i++) {
			System.out.println(player[i]);
			System.out.println(" ");
		}
	}
}
