package LogicalJava;

public class ReverseNum2 {

	public static void main(String[] args) {

		int num = 123456;

		int rev = 0;

		while (num != 0) {

			rev = rev * 10 + num % 10;

			num = num / 10;

		}

		System.out.println(rev);

		// 2. Using String Buffer method

		int num2 = 123450;
		System.out.println(new StringBuffer(String.valueOf(num2)).reverse());

		// System.out.println(stfr);

	}
}
