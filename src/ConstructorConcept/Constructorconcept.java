package ConstructorConcept;

public class Constructorconcept {

	public Constructorconcept() {

		System.out.println("Default constructor");

	}

	public Constructorconcept(int i) {

		System.out.println("Single Parameter constructor");

		System.out.println("Value of i is " + i);

	}

	public Constructorconcept(int i, int j) {
		System.out.println("double Parameter constructor");

		System.out.println("Value of i is " + i);

		System.out.println("Value of i is " + j);

	}

	public static void main(String[] args) {

		Constructorconcept obj = new Constructorconcept();

		Constructorconcept obj1 = new Constructorconcept(10);
		
		Constructorconcept obj2 = new Constructorconcept(10,20);
	}

}
