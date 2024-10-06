package assig7;

import java.util.Scanner;

public class vowel {

	static class NoVowel extends Exception {
		public NoVowel(String message) {
			super(message);
		}
	}

	public static void checkVowels(String input) throws NoVowel {

		String lowerCaseInput = input.toLowerCase();

		if (!lowerCaseInput.matches(".*[aeiou].*")) {
			throw new NoVowel("No vowels found in the input string.");
		} else {
			System.out.println("The string contains vowels.");
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		try {

			checkVowels(input);
		} catch (NoVowel e) {

			System.out.println(e.getMessage());
		}
	}
}
