package ex01;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int nbr = input.nextInt();
		if (nbr <= 1) {
			System.err.print("IllegalArgument");
			input.close();
			System.exit(-1);
		}
		int i = 2;
		for (i = 2; i <= Math.sqrt(nbr); ++i) {
			if (nbr % i == 0) {
				System.out.println("false " + (i -1));
				input.close();
				System.exit(0);
			}
		}
		System.out.println("true " + (i -1));
		input.close();
		System.exit(0);
	}
}

