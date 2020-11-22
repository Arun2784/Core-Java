package JavaBasics;

public class MethodOverLoding {

	public static void main(String[] args) {

		MethodOverLoding obj = new MethodOverLoding();

		obj.sum();
		obj.sum(10);
		obj.sum(20, 30);
		MethodOverLoding.main(20);
	}

	public static void main(int i) {

		System.out.println("We can over load main method also");
		System.out.println(i);
	}

	// We can over load main method also.
	// you can not create the method inside method.
	// Duplicate Method-->same method name with same number of arguments are not
	// allowed
	// Method overloading-->When the method name is same with different arguments or
	// input paramter with in the same class

	public void sum() {

		System.out.println("Sum Method with --zero paramter");

	}

	public void sum(int i) {

		System.out.println("Sum Method with --1 paramter");
		System.out.println(i);
	}

	public void sum(int j, int k) {

		System.out.println("Sum Method with -2 Paramter");
		System.out.println(j + k);

	}
}
