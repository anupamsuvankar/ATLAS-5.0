import java.io.*;
import java.util.*;

public class Task17 {
    public static void main(String args[]) {
        FileOutputStream outfile = null;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to write to the file: ");
        String s = sc.nextLine();

        byte[] b1 = s.getBytes();

        try {
            outfile = new FileOutputStream("FileName02.txt"); 
            outfile.write(b1); 
        } catch (IOException e) {
            System.out.println("Error: " + e);
            System.exit(-1);
        } finally {
            try {
                if (outfile != null)
                    outfile.close();
            } catch (IOException e) {
                System.out.println("Error closing file: " + e);
            }
        }

        System.out.println("Write Byte");
        System.out.println("Thank You...!!!");
        sc.close();
    }
}
