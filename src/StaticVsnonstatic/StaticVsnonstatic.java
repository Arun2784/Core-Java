package StaticVsnonstatic;

public class StaticVsnonstatic {

	String name="Tom";
	
	static int age=20;
	
	
	
	public static void main(String[] args) {
		
		sum();
		
		System.out.println(age);
		
		
		StaticVsnonstatic obj = new StaticVsnonstatic();
		
		obj.sendmail();
		
		System.out.println(obj.name);
		
		obj.sum();
		
		System.out.println(obj.age);
		
		
		

	}

	public void sendmail() {
		
		System.out.println("Non static method---send mail");
		
	}
	
	public static void sum() {
		
		System.out.println("Static method-----sum method");
		
		
	}
	
}
