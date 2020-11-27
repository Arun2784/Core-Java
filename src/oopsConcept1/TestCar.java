package oopsConcept1;

public class TestCar {

	public static void main(String[] args) {

		Bmw b = new Bmw();// It is called static polymorhphis Or complie time polymorphism because at time
							// of compliation Java will
		// decide which method be called. so start() method is overidden or common
		// method this be execute.

		b.start();
		b.stop();
		b.refuel();
		b.antitheft();
		b.engine();

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();

		// Top Casting
		Car c1 = new Bmw();// child class object can be referred by Parent class refrence variable--dynamic
							// or runtime polymorphism
		c1.start();//
		c1.stop();
//down catsing --its not allowed 
		Bmw b2 = (Bmw) new Car();
//This will be famous interview Question--

	}

}
