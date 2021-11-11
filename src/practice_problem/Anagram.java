package practice_problem;

import java.util.Arrays;
import java.util.Scanner;
import org.junit.Test;
public class Anagram {
	public static void main(String[] args) {
		Anagram_Detection rv = new Anagram_Detection();
		rv.anagramDetection();
	}
}

class Anagram_Detection {
@Test	
	void anagramDetection() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the first String");
		String input1 = userInput.next();
		System.out.println("Enter the first String");
		String input2 = userInput.next();

		if (input1.length() != input2.length()) {
			System.out.println("The given two Strings are not Anagram");
		} else {
			char[] String1 = input1.toCharArray();
			char[] String2 = input2.toCharArray();

			Arrays.sort(String1);
			Arrays.sort(String2);

			String result2 = (Arrays.equals(String1, String2) == true) ? "Both the strings are Anagram"
					: "Both the strings are not Anagram";
			System.out.println(result2);
		}
	}
}
