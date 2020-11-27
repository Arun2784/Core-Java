package oopsConcept1;

public class Bmw extends Car{ // has a relationship

	public void start() {//Method overriding: when same method is present both parant and child

		System.out.println("BMW---Start");

	}

	public void antitheft() {

		System.out.println("BMW---Antitheft");

	}
}
