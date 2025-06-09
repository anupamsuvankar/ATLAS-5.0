import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctLoginId = "Anupam";
        String correctPwd = "12345";
        int count = 0;

        String loginid;
        String pwd;

        do {
            System.out.print("Enter your login id: ");
            loginid = sc.nextLine();

            System.out.print("Enter your password: ");
            pwd = sc.nextLine();

            if (loginid.equals(correctLoginId) && pwd.equals(correctPwd)) {
                System.out.println("You have logged in sucessfully");
                break;
            } else {
                System.out.println("Incorrect id or pwd. You tried logging in for " + ++count + " times");
            }

        } while (loginid != correctLoginId && pwd!= correctPwd);

        sc.close();
    }
}
