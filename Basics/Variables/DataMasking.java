import java.util.Scanner;

public class DataMasking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your phone number: ");
        String phoneNo = sc.next();

        int length = phoneNo.length();
        String lastFour = phoneNo.substring(length - 4);
        String masked = "XXXXXX" + lastFour;

        System.out.println("Masked phone number:" + masked);

        sc.close();
    }
    
}
