import java.util.Scanner;

public class DataMasking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Phone number: ");
        String phoneNo = sc.next();

        int length = phoneNo.length();
        int requiredLength = 10;
        int visibleDigits = 4;

        if(length != requiredLength){
            System.out.println("Please enter a valid number");
        }
        else if(!phoneNo.matches("\\d+")){//the whole thing returns true only if every character is a digit.
            System.out.println("Phone number must contain numbers only");
        }
        else{
            String lastFour = phoneNo.substring(length - visibleDigits);
            String masked = "XXXXXX" + lastFour;
            System.out.println("Masked phone number: " + masked);
        }

        sc.close();
    }
}
