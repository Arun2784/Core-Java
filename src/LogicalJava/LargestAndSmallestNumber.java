package LogicalJava;

import java.util.Arrays;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {

		int numbers[] = { 0, 3, 25, -90, 897 };

		int largest = numbers[0];

		int smallest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] > largest) {

				largest = numbers[i];
			} else if (numbers[i] < smallest) {

				smallest = numbers[i];

			}
		}
		System.out.println("\n given array is :" + Arrays.toString(numbers));

		System.out.println("Largest number is " + largest);

		System.out.println("smallest number is " + smallest);
	}

}
