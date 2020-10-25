package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {

		// array- to store similar data types values in array variable
		// Disavntage- size is fixed(means static array) to overcome this we use
		// Arraylist, hashtbale
		// types only
		// can store similar data -->To overcome this we use object array.

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		// lowest bound//index=0
		// Highest bound/index=3 or (n-1) where n is size of array
		System.out.println(i[0]);

		System.out.println(i[1]);

		System.out.println(i[3]);

		// System.out.println(i[4]);// ArrayIndexOutOfBoundsException: exception

		// how to print the lenght of Array

		System.out.println(i.length);

		// how to print all the values of array--for loop

		for (int j = 0; j < i.length; j++) {

			System.out.println(i[j]);

		}

		// double Array

		double d[] = new double[3];

		d[0] = 12.33;
		d[1] = 20.1;
		d[2] = 45.22;

		System.out.println(d.length);

		for (double k = 0; k < d.length; k++) {

			System.out.println(d[(int) k]);

		}

		// Object Array- Object is super class.--is used to store different data types;

		Object obj[] = new Object[5];

		obj[0] = "tom";
		obj[1] = 12;
		obj[2] = 12.22;
		obj[3]="1/04/1990";
		obj[4]='M';
		
		System.out.println(obj.length);
		
		System.out.println(obj[4]);

	}

}
