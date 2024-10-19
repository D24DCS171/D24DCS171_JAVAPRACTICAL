/*Write an example that counts the number of times a
particular character, such as e, appears in a file. The 
character can be specified at the command line. You can 
use xanadu.txt as the input file. */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prac28{
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("enter vaild command line 1argument");
            return;
        }

        String fileName = args[0];
        char characterToCount = args[1].charAt(0); 
        int charCount = 0;

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                charCount += countCharacter(line, characterToCount);
            }
            System.out.println("The character '" + characterToCount + "' appears " + charCount + " times in " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
    public static int countCharacter(String line, char ch) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
