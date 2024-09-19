import java.util.Arrays;
import java.util.Scanner;

public class prac10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1 = scanner.nextLine();
        int length = s1.length();
        System.out.println("The length of the string is: " + length);
        String lower= s1.toLowerCase();
        System.out.println("lower string:"+lower);
        String upper= s1.toUpperCase();
        System.out.println("Upper string:"+upper);
        char arr[] = s1.toCharArray();
        Arrays.sort(arr);
        String sort = new String(arr);
        System.out.println("sorted string="+sort);
        String reversed = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            reversed += s1.charAt(i);
        }
        System.out.println("reversed string:"+reversed);

        
    }
}
