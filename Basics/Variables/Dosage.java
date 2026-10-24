import java.util.Scanner;

public class Dosage {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter Patient weight: ");
       double weight = sc.nextDouble();

       double dosePerKg = 5;
       double totalDose = weight * dosePerKg;

       System.out.println("Total Dose: " + totalDose + " mg");

       double tabletStrength = 250;
       double numberOfTablets = totalDose/tabletStrength ;

       System.out.println("Number of Tablets: " + numberOfTablets);

       sc.close();
    }
}
