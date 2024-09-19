import java.util.Scanner;
public class prac15 {
    public int length;
    public int breadth;
    public prac15(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int returnArea() {
        return length * breadth;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle:");
        int breadth = sc.nextInt();
        prac15 rectangle = new prac15(length, breadth);
        System.out.println("The area of the rectangle is: " + rectangle.returnArea());
    }
}


