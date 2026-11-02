import java.util.Scanner;

public class DataMasking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minLength = 5;
        int visibleDigits = 4;

        System.out.print("Enter your phone number: ");
        String phoneNo = sc.next();

        int length = phoneNo.length();

        if (length < minLength) {
            System.out.println("Number is too short.");
        } else if (!phoneNo.matches("\\d+")) {
            System.out.println("Phone number must contain digits only.");
        } else {
            String masked = "";

            for (int i = 0; i < length - visibleDigits; i++) {
                masked += "X";
            }

            masked += phoneNo.substring(length - visibleDigits);

            System.out.println("Masked phone number: " + masked);
        }

        sc.close();
    }
} 
    

