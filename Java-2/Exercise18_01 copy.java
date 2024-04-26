package doctor_jay;

import java.util.Scanner;
import java.math.*;


public class Exercise18_01 {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		String n = input.nextLine();

		// Display factorial
		System.out.println("Factorial of " + n + " is "
			+ factorial(new BigInteger(n)));
	}

	/** Retrun the factorial for the specified number */
	public static BigInteger factorial(BigInteger n) {
		if (n.equals(BigInteger.ZERO)) // Base case
			return BigInteger.ONE;
		else // Recursive call
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
	}
}