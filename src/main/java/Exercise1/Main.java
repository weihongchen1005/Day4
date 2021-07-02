package Exercise1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		int output = UserMainCode.checkCharacters(input);
		
		if(output == 1) {
			System.out.println("Valid");
		}
		
		else {
			System.out.println("Invalid");
		}
	}

}
