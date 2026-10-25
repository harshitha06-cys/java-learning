import java.util.Scanner;

public class Dosage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dosePerKg = 5;
        double tabletStrength = 250;
        double maxDose = 1000;

        System.out.print("Enter Patient weight: ");
        double weight = sc.nextDouble();

        if (weight <= 0) {
            System.out.println("Please enter correct weight!");
        } else {
            double totalDose = weight * dosePerKg;

            if (totalDose > maxDose) {
                System.out.println("Dose exceeds safe limit, consult a doctor.");
            } else {
                double numberOfTablets = totalDose / tabletStrength;
                System.out.printf("%.2f mg ", totalDose);
                System.out.println("Number of Tablets: " + numberOfTablets);
            }

        }

        sc.close();
    }
}
