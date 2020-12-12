package StringReverseConcept;

public class StringReverse {

	public static void main(String[] args) {

		String s = "merijaaanhotum";

		int len = s.length();
		String rev = "";
		System.out.println("String value is = " + s);
		System.out.println("Total length of value = " + len);

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}

		System.out.println("Reverse value is = "+rev);

	}

}
