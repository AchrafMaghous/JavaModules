package ex03;

import java.util.Scanner;

/**
 * The Program class represents a program that processes student grades data and draws a chart based on the data.
 * It contains methods for getting grades, drawing a chart, and the main method to run the program.
 */
/**
 * The Program class represents a program that processes student grades data and draws a chart based on the data.
 */
public class Program {
	
	/**
	 * Retrieves the minimum grade from a string of digits and updates the studentsData.
	 * 
	 * @param digits The string of digits representing the grades.
	 * @param studentsData The current studentsData.
	 * @return The updated studentsData with the minimum grade appended.
	 */
	private static long getGrades(String digits, long studentsData) {
		Scanner input = new Scanner(digits);
		int digitC = 0;
		int minGrade = 9;

		input.useDelimiter(" ");
		while (input.hasNext() && digitC < 5) {
			if (input.hasNextInt()) {
				int digit = input.nextInt();
				minGrade = (digit < minGrade) ? digit : minGrade;
				if (digit < 1 || digit > 9) {
					System.err.println("bad input");
					System.exit(-1);
				}
			} else
				break;
			digitC++;
		}
		if (digitC != 5 || input.hasNext()) {
			System.err.println("bad input");
			System.exit(-1);
		}
		input.close();
		return (studentsData * 10 + minGrade);
	}
	
	/**
	 * Draws a chart based on the studentsData and the total number of weeks.
	 * 
	 * @param studentsData The studentsData containing the grades.
	 * @param totalWeeks The total number of weeks.
	 */
	private static void drawChart(long studentsData, int totalWeeks) {
		int weekCount = 1;

		long division = (long) Math.pow(10, totalWeeks - 2);
		while (division > 0) {
			System.out.print("Week " + weekCount + " ");

			int digit = (int) (studentsData / division);
			studentsData = studentsData % division;
			division = division / 10;
			for (int j = 0; j < digit; j++)
				System.out.print("=");
			System.out.println(">");
			weekCount++;
		}
	}
	
	/**
	 * The main entry point of the program.
	 * 
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long studentsData = 0;
		int currWeek = 1;
		while (true) {
			String weekStr = input.nextLine();
			if (weekStr.equals("42") || currWeek > 18)
				break;
			if (!weekStr.equals("Week " + currWeek)) {
				System.err.println("Wrong input");
				System.exit(-1);
			}
			String digits = input.nextLine();
			studentsData = getGrades(digits, studentsData);
			currWeek++;
		}
		input.close();
		drawChart(studentsData, currWeek);
	}
}
