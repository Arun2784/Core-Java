package LogicalJava;

public class ArrayValuetoString {

	public static void main(String[] args) {
		
		char i[]= new char[]{'1','2','3','4','5'};
		
		//option1
		
		String str1 = String.valueOf(i);
		
		
		System.out.println("This is how to print int array to String :" + str1);
		//option2
		
		
		String str2 = new String(i);
		
		System.out.println("Option2 --" +str2);
		
		

	}

}
