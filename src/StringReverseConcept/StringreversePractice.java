package StringReverseConcept;

public class StringreversePractice {

	public static void main(String[] args) {

		String str = "Automation";// 10

		int len = str.length();

		String revrs = "";

		System.out.println("String value= " + str);
		// System.out.println("Total lenth is = " + len);

		for (int i = len - 1; i >= 0; i--) {

			revrs = revrs + str.charAt(i); // returns the char value from specified index--n--""+n= n;

		}

		System.out.println("Reverse string of = " + str + "is =" + revrs);

		// 2. 2nd method

		StringBuffer stb = new StringBuffer(str);

		System.out.println("2nd method is this one = " + stb.reverse());

	}

}
