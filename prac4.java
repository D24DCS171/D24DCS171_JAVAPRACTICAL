package part1;
import java.util.Scanner;

public class prac4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days you want to record expenses for: ");
        int Days = scanner.nextInt();
        int[] dailyExpenses = new int[Days];
        for (int i=0;i<Days;i++) {
            System.out.print("Enter expense for day " + (i + 1) + ": ");
            dailyExpenses[i] = scanner.nextInt();
        }
      int totalExpenses = 0;
        for (int i = 0; i < dailyExpenses.length; i++) {
            totalExpenses += dailyExpenses[i];
        }
        System.out.println("Total expenses for the month:" + totalExpenses);


       }
    
}
