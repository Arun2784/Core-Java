package JavaBasics;

public class LocalvsGlobal {

	String name = "Tom";
	int age = 20;// Global Variable

	public static void main(String[] args) {
		int i = 50;//local Varial

		System.out.println(i);
		
		LocalvsGlobal obj = new LocalvsGlobal();
		System.out.println(obj.name);
		System.out.println(obj.age);
	}

	public void sum() {

		int i = 10;
		int j = 20;

	}

}
