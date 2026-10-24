import java.util.Scanner;

public class RegistrationCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter patient name: ");
        String name = sc.nextLine();

        System.out.print("Enter patient age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter patient blood group: ");
        String bloodGroup = sc.nextLine();

        System.out.println("-----Patient Registration Card-----");
        System.out.println("Patient ID: " + id);
        System.out.println("Patient name: " + name);
        System.out.println("Patient age: " + age);
        System.out.println("Patient blood group: " + bloodGroup);

        sc.close();

    }
}
