import java.util.InputMismatchException;
import java.util.Scanner;
public class prac25 {
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
        catch (ArithmeticException E) {
            System.out.println("you are traying to divide by 0");
        } 
        catch (InputMismatchException E) {
            System.out.println("enter only int value");
        } 
        finally{
            System.out.println("program terminated");

        }
    }
}


