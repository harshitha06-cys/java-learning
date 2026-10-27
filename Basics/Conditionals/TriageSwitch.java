import java.util.Scanner;

public class TriageSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter triage level(1 to 5): ");
        int level = sc.nextInt();

        switch (level) {
            case 1:
                System.out.println("Immediate (Red)");
                break;
            
            case 2:
                System.out.println("Emergent (Orange)");
                break;

            case 3:
                System.out.println("Urgent (Yellow)");
                break;

            case 4:
                System.out.println("Less urgent (Green)");
                break;

            case 5:
                System.out.println("Non-urgent (Blue)");
                break;

            default:
                System.out.println("Invalid level");
                break;
        }

        sc.close();
    }
}
