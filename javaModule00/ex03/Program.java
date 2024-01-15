package ex03;

import java.util.Scanner;

public class Program {
	private static boolean isNumber(String str) {
		if (str == null)
			return false;
		try {
			int weeknum = Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
	private static String parseInput(String str) {
		String[] tokens = str.split(" ");
		if (tokens[0] == "Week" && tokens[1].is)
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String week = input.nextLine();
	}
}
