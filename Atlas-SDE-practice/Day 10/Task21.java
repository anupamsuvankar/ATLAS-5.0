import java.io.*;

class Task21 {
    public static void main(String args[]) {
        try {
            FileInputStream file1 = new FileInputStream("NewFile01.txt");
            FileInputStream file2 = new FileInputStream("NewFile02.txt");
            SequenceInputStream file3 = new SequenceInputStream(file1, file2);

            BufferedInputStream br1 = new BufferedInputStream(file3);
            BufferedOutputStream br2 = new BufferedOutputStream(System.out);
            int ch;
            while ((ch = br1.read()) != -1) {
                br2.write((char) ch);
            }
            br1.close();

            file1.close();
            file2.close();
            System.out.println("Merge Two File Sucessfully ");
            br2.close();
        } catch (IOException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        }
    }
}
