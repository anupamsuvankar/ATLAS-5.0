import java.io.*;

public class Task22 {
    public static void main(String args[]) {
        // Check for correct number of arguments
        if (args.length != 2) {
            System.out.println("Usage: java Task22 <sourceFile> <destinationFile>");
            return;
        }

        File f1 = new File(args[0]);
        File f2 = new File(args[1]);

        if (f1.renameTo(f2)) {
            System.out.println("Renamed file " + f1.getName() + " to " + f2.getName() + " successfully.");
        } else {
            System.out.println("Failed to rename file. Make sure the source file exists and is not open.");
        }
    }
}
