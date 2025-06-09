import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Id: ");
        String id = scanner.nextLine();

        System.out.print("Pwd: ");
        String pwd = scanner.nextLine();

        System.out.println("\nHi ,\n");
        System.out.println("Your login id is " + id);
        System.out.println("And your pwd is " + pwd);
        
        scanner.close();
    }
}
