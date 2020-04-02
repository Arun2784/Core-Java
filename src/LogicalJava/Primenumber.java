package LogicalJava;

import java.io.ObjectInputStream.GetField;

public class Primenumber {

	
	public static boolean isPrimenumer(int num) {
		
		if(num<=1) {                  //Start from corner
			
			return false;
		}
		for (int i=2; i<num; i++) {
			if(num % i==0) {
				
				  return false;
			}
		}
		
		return true;
		
	}
	
	public  static void getprimenumber(int num) {
		
		
		for (int i =2; i<num; i++ ) {
			
			if (isPrimenumer(i))
			System.out.print(i +  " ");
			
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("this number is Prime number:"   + isPrimenumer(2));
		
		System.out.println("This number is prime numer:"    +  isPrimenumer(10));
		
		getprimenumber(20);
		getprimenumber(100);

	}

}
