package Exercise2;

public class Main {

	public static void main(String[] args) {
		String a = "cat";
		// String a = new String ("cat")
		String b = "cat";
		System.out.println(a == b);

		StringBuilder cat = new StringBuilder();
		cat.append("cat");
		System.out.println(cat.equals(a));
	}

}
