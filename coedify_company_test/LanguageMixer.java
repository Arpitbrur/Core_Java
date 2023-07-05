package coedify_company_test;

import java.util.Scanner;

public class LanguageMixer {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.nextLine(); // Consume the newline after reading k

        boolean validSentence = true;

        for (int i = 0; i < k; i++) {
            String word = scanner.next();

            if (!isValidWord(word)) {
                validSentence = false;
                break;
            }
        }

        if (validSentence) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }

    public static boolean isValidWord(String word) {
        boolean uppercase = false;
        boolean lowercase = false;
        boolean both = false;
        for (char c : word.toCharArray()) {
            if (c >= 'N' && c <= 'Z') {
                uppercase = true;
            } else if (c >= 'a' && c <= 'm') {
                lowercase = true;
            } 
//            else if((c >= 'N' && c <= 'Z') || (c >= 'a' && c <= 'm') ) {
//            	both = ;
//            } 
            else {
                return false;
            }

//            if (uppercase && lowercase) {
//                return false;
//            }
        }

        return lowercase ^ uppercase;
    }
}
