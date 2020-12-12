package ConstructorConcept;

public class B extends A {

	public B() {
		super(10);

		System.out.println("Chile class constructor class calling");
	}

	public static void main(String[] args) {

		B obj = new B();

	}

}
