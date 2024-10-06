package assig7;

import java.util.StringTokenizer;

public class Slipt {
	public static void main(String[] args) {

		String input = "Hello World";

		StringTokenizer tokenizer = new StringTokenizer(input);

		try {

			String token1 = tokenizer.nextToken();
			String token2 = tokenizer.nextToken();
			String token3 = tokenizer.nextToken();

			System.out.println("Token 1: " + token1);
			System.out.println("Token 2: " + token2);
			System.out.println("Token 3: " + token3); // This won't be reached due to exception

		} catch (Exception e) {

			System.out.println("Error: No more tokens available!");
		}
	}
}
