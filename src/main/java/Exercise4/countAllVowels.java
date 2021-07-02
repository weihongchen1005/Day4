package Exercise4;

import java.util.Scanner;

public class countAllVowels {

	public static int countVowels(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
					|| input.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		System.out.println("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(countVowels(input));
	}

}
