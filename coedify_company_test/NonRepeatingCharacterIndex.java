// Q No:- 2 Coedify
package coedify_company_test;
import java.util.*;

public class NonRepeatingCharacterIndex {
//	public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word");
		String s = scanner.next();

//        String s = "aabb";
//        int index1 = findFirstSolution(s);
		int index1 = findFirstNonRepeatingCharacterIndex(s);
        System.out.println("Index of first non-repeating character in '" + s + "': " + index1);

//        String s1 = "ypgeyqk";
//        int index2 = findFirstNonRepeatingCharacterIndex(s1);
//        System.out.println("Index of first non-repeating character in '" + s1 + "': " + index2);
    }

    public static int findFirstNonRepeatingCharacterIndex(String word) {
	
//    public static int findFirstSolution(String word) {
        // Create a map to store the count of each character in the word
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate over each character in the word and update the count in the map
        for (char c : word.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Iterate over the characters again to find the first non-repeating character
        for (int i = 0; i < word.length(); i++) {
            if (charCountMap.get(word.charAt(i)) == 1) {
                return i;
            }
        }

        // No non-repeating character found
        return -1;
    }
	
	}

