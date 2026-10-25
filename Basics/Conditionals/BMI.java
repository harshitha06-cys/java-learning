import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        System.out.print("Enter your weight(kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height(m): ");
        double height = sc.nextDouble();


        if(height<=0 || weight<=0)
            {System.out.println("Please enter correct value.");}
        else{
            double bmi = weight / (height * height);
        
        if(bmi < 18.5)
            {System.out.printf("%.2f, Underweight%n", bmi);}

        else if(bmi < 25)
            {System.out.printf("%.2f, Normal%n", bmi);}

        else if(bmi < 30)
            {System.out.printf("%.2f, Overweight%n", bmi);}

        else
            {System.out.printf("%.2f, Obesity%n", bmi);}

        sc.close();
        }
    }
}
