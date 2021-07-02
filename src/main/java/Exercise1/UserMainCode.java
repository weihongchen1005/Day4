package Exercise1;

// UserMainCode class includes a checkCharacters method to check if the first and last character are same.
public class UserMainCode {

	static int checkCharacters(String input) {
		if (input.charAt(0) == input.charAt(input.length() - 1)) {
			return 1;
		}

		else {
			return -1;
		}
	}
}
