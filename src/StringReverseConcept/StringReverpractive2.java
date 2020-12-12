package StringReverseConcept;

public class StringReverpractive2 {

	public static void main(String[] args) {

		String s = "Selenium";
		/// out put should be "muineles"

		int len = s.length(); // 8

		String s1 = "";

		System.out.println("lentgh = " + len);

		for (int i = len - 1; i >= 0; i--) {

			s1 = s1 + s.charAt(i);

			System.out.println(s1);

		}
		System.out.println(s1);

		StringBuffer stb = new StringBuffer(s);

		System.out.println(stb.reverse());

	}

}
