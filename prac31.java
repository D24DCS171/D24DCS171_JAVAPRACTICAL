import java.io.*;

public class prac31 {
    public static void main(String[] args) {
        String charStreamFile = "abc.txt";
        String byteStreamFile = "xyz.txt";
        String consoleInputFile = "consoleInputFile.txt";
        
        System.out.println("Demonstrating Character Stream:");
        try {
            FileReader fileReader = new FileReader(charStreamFile);
            FileWriter fileWriter = new FileWriter("charStreamCopy.txt");
            
            int character;
            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
            }
            
            fileReader.close();
            fileWriter.close();
            
            System.out.println("Character Stream Copy Completed.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nDemonstrating Byte Stream:");
        try {
            FileInputStream fileInputStream = new FileInputStream(byteStreamFile);
            FileOutputStream fileOutputStream = new FileOutputStream("byteStreamCopy.txt");

            int byteData;
            while ((byteData = fileInputStream.read()) != -1) {
                fileOutputStream.write(byteData);
            }

            fileInputStream.close();
            fileOutputStream.close();

            System.out.println("Byte Stream Copy Completed.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nReading input from console and writing to a file:");
        try {
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(consoleInputFile));

            System.out.println("Enter text (type 'exit' to stop):");
            String inputLine;
            while (!(inputLine = consoleReader.readLine()).equals("exit")) {
                fileWriter.write(inputLine);
                fileWriter.newLine();  
            }

            consoleReader.close();
            fileWriter.close();

            System.out.println("Console input has been written to " + consoleInputFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

