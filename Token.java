package assig7;

import java.util.Scanner;

public class Token {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string ");
		String input = scanner.nextLine();

		try {

			int number = Integer.parseInt(input);

			System.out.println("The converted integer is: " + number);

		} catch (NumberFormatException e) {

			System.out.println("Error: Invalid input. The string cannot be converted to an integer.");
		}
	}
}
