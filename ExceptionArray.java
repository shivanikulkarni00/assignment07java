package assig7;

import java.util.Scanner;

public class ExceptionArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter the size of the array: ");
			int n = scanner.nextInt();
			int[] array = new int[n];
			System.out.println("Enter " + n + " integer elements:");
			for (int i = 0; i < n; i++) {
				array[i] = scanner.nextInt();
			}

			System.out.print("Enter the index of the element you want to access: ");
			int index = scanner.nextInt();

			System.out.println("The value at index " + index + " is: " + array[index]);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Error: Index is out of bounds");
		} catch (Exception e) {

			System.out.println("Error: Invalid input ");
		} finally {
			scanner.close();
		}
	}
}
