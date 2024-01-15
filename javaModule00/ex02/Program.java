package ex02;

import java.util.Scanner;


public class Program {

	private static int sumOfDigits(int nbr) {
		int sumOfDigits = 0;
		while (nbr != 0) {
			sumOfDigits += nbr % 10;
			nbr /= 10;
		}
		return sumOfDigits;
	}

	private static boolean isPrime(int nbr) {
		for (int i = 2; i <= Math.sqrt(nbr); ++i) {
			if (nbr % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int coffeeReqCount = 0;
		Scanner input = new Scanner(System.in);
		while (true) {
			int nbr = input.nextInt();
			if (nbr <= 1)
				continue;
			int sumOfDigits = sumOfDigits(nbr);
			if (isPrime(sumOfDigits))
			coffeeReqCount += 1;
			if (nbr == 42) {
				System.out.println("Count of coffee-request: " + coffeeReqCount);
				break;
			}
		}
		input.close();
	}
}
