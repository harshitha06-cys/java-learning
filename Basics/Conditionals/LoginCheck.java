import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String storedUser = "mani";
        String storedPass = "234";

        System.out.print("Enter user name: ");
        String userName = sc.next();

        System.out.print("Enter password: ");
        String pass = sc.next();

        if (storedUser.equals(userName) && storedPass.equals(pass)){
            System.out.println("Access granted");
        } else{
            System.out.println("Access denied");
        }

        sc.close();
    }
}
