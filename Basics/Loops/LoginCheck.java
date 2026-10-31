import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String storedUser = "Vish";
        String storedPass = "2601";
        boolean loggedIn = false;
        int maxAttempts = 3;

        int count = 1;
        for (count = 1; count <= maxAttempts; count++) {
            System.out.print("Enter User name: ");
            String userName = sc.nextLine();
            System.out.print("Enter password: ");
            String pass = sc.nextLine();

            if (storedUser.equals(userName) && storedPass.equals(pass)) {
                System.out.println("Access granted");
                loggedIn = true;
                break;
            } else {
                System.out.println("Access Denied");
                int remainingAttempts = maxAttempts - count;
                if (remainingAttempts > 0) {
                    System.out.println("Remaining attempts: " + remainingAttempts);
                }
            }
        }
        if (!loggedIn) {
            System.out.println("Account locked");
        }

        sc.close();
    }
}
