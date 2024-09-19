
import java.util.Scanner;

public class prac9 {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = s.nextLine();
        System.out.println("new string: " + doubleChar(input));
    }
    public static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result += c;
            result += c;
        }
        return result;
    }
}

    

