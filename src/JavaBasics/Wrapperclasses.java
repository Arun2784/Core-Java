package JavaBasics;

public class Wrapperclasses {

	public static void main(String[] agrs) {

		// String to integter

		String x = "100";

		System.out.println(x + 20);

		int i = Integer.parseInt(x);

		System.out.println(i + 20);

		// String to Double

		String s1 = "12.22";

		double d1 = Double.parseDouble(s1);
		System.out.println(d1 + 10);

		// String to Boolean

		String s2 = "true";

		Boolean b1 = Boolean.parseBoolean(s2);

		System.out.println(b1);

		// Inteter to String conversion

		int in = 20;
		System.out.println(in + 20);
		String si = String.valueOf(in);
		System.out.println(si + 20);

	}

}
