import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String loginid = "Anupam";
        String pwd = "12345";
        int count = 0;


        while (loginid == "Anupam" && pwd == "12345"){
            System.out.println("you have logged in for "+ ++count +" times");
            System.out.println("enter ur login id and password");
            loginid = sc.nextLine();
            pwd = sc.nextLine();	
        }

        sc.close();
    }
}
