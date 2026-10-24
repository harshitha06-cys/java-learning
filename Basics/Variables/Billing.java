import java.util.Scanner;

public class Billing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gstRate = 0.18;

        System.out.print("Consultation fee: ");
        double fee = sc.nextDouble();

        System.out.print("Medicine cost: ");
        double medCost = sc.nextDouble();

        System.out.print("Lab test cost: ");
        double labTestCost = sc.nextDouble();

        double subTotal = fee + medCost + labTestCost;
        System.out.printf("Sub Total: %.2f%n", subTotal);
        //+ just dumps the raw double. printf lets you say how to format it.

        double gstAmount = subTotal*gstRate;
        System.out.printf("GST(18%%): %.2f%n", gstAmount);
        //printf treats the first string as a format template, and any % in it is special

        double finalTotal = subTotal + gstAmount;
        System.out.printf("Final Total: %.2f%n", finalTotal);

        sc.close();
    }
}
