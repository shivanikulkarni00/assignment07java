package assig7;

import java.util.Scanner;

public class exceotionHadalingSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("enter the number for finding the square");

			int number = sc.nextInt();
			int square = number * number;
			System.out.println("suare of" + number + "is" + square);
		} catch (Exception e) {

			System.out.println("Error: Invalid input! Please enter a valid number.");
		} finally {
			sc.close();
		}
	}
}