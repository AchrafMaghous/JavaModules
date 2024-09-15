
import java.util.Scanner;
import java.util.TreeMap;


public class Program {
  public static void main(String[] args) {
    Scanner skarner = new Scanner(System.in);
    TreeMap<Integer, Integer> weekData = new TreeMap<>();
    int weekCounter = 1;

    while (skarner.hasNext()) {
      String line = skarner.nextLine();
      if (line.equals("42"))
        break;
      if (line.startsWith("Week ")) {
        int week;
        week = Integer.parseInt(line.substring(5).trim());
        if (week < 1 || week > 18) {
          System.err.println("IllegalArgument");
          System.exit(-1);
        }
        if (week != weekCounter) {
          System.err.println("IllegalArgument");
          System.exit(-1);
        }

        int[] grades = new int[5];
        int i = 0;
        while (i < 5 && skarner.hasNextInt()) {
          grades[i] = skarner.nextInt();
          i++;
        }
        skarner.nextLine();
        if (i != 5) {
          System.err.println("IllegalArgument");
          System.exit(-1);
        }
        int minGrade = 10;
        for (int grade : grades) {
          if (grade < 1 || grade > 9) {
            System.err.println("IllegalArgument");
            System.exit(-1);
          }
          if (grade < minGrade)
            minGrade = grade;

        }
        weekData.put(week, minGrade);
        weekCounter += 1;
      }
    }
    for (int week : weekData.keySet()) {
      int minGrade = weekData.get(week);
      System.out.print("Week " + week + " ");
      for (int i = 0; i < minGrade; i++) {
        System.out.print("=");
      }
      System.out.println(">");
    }
    skarner.close();

  }
}
