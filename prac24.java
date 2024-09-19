/*Write a java program which takes two integers x & y as 
input, you have to compute x/y. If x and y are not integers 
or if y is zero, exception will occur and you have to 
report it.*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class prac24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("enter x");
        int x=sc.nextInt();
        System.out.println("enter y");
        int y=sc.nextInt();

            int result = x / y;
            System.out.println("Result of " + result);
         
        } 
        catch (ArithmeticException |InputMismatchException E) {
            System.out.println("you are traying to divide by or x or y is not ints");
        } 
        finally{
            System.out.println("program terminated");

        }
    }
}
