/*Write a java program to generate user defined exception 
using “throw” and “throws” keyword. 
Also Write a java that differentiates checked and 
unchecked exceptions. (Mention at least two checked and 
two unchecked exceptions in program). */
import java.util.Scanner;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class prac26 {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18 && age>60) {
            throw new InvalidAgeException("Age is less than 18 and greater than 60, not allowed.");
        } else {
            System.out.println("You are eligible to vote!");
        }
    }

    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        checkAge(age);
        System.out.println("Program completed successfully.");
    }
}

