package Exercise3;

import java.util.Scanner;

public class MidChar {

	public static String midChar(String input) {
		String output = "";
		if(input.length() %2 == 0) {
			output = input.substring((input.length() /2 )- 1, + (input.length()/2) + 1);
		}
		else {
			output += input.charAt(input.length()/2);
		}
		
		return output;
	}
	
	
	
	public static void main(String[] args) {

		System.out.println("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		System.out.println(midChar(input));
	}

}
