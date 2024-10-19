import java.io.*;

public class prac30 {
    public static void main(String[] args) {
      String sourceFilePath = "abc.txt";
        String destinationFilePath = "xyz.txt";

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            
            fileInputStream = new FileInputStream(sourceFilePath);
            
            fileOutputStream = new FileOutputStream(destinationFilePath);

            byte[] buffer = new byte[1024];
            int length;

            while ((length = fileInputStream.read(buffer)) > 0) {
                fileOutputStream.write(buffer, 0, length);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error while closing files: " + e.getMessage());
            }
        }
    }
}
