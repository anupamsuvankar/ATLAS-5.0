
import java.io. BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task25 {
   public static void main(String[] args) {
      String filePath = "example.txt";
      String content = "Hello, World!\nThis is a BufferedWriter example.";

      try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
         // Write content to the file
         writer.write(content);
         System.out.println("Content written to file.");
      } catch (IOException e) {
         System.err.println("An error occurred: " + e.getMessage());
      }
   }
}
