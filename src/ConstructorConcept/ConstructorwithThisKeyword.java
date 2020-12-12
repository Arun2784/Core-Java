package ConstructorConcept;

public class ConstructorwithThisKeyword {

	String name;

	int age;

	ConstructorwithThisKeyword(String name, int age) {
		
		this.name = name;
		this.age= age;
		System.out.println(name);
		System.out.println(age);

	}

	public static void main(String[] args) {

		ConstructorwithThisKeyword obj = new ConstructorwithThisKeyword("Tom", 30);

	}

}
