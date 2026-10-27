import java.util.Scanner;

public class VitalSigns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minHeartRate = 60;
        int maxHeartRate = 100;
        double minTemp = 97;
        double maxTemp = 99;

        System.out.print("Enter your heart rate: ");
        int heartRate = sc.nextInt();

        System.out.print("Enter body temperate(F): ");
        double temp = sc.nextDouble();

        if (heartRate <= 0 || temp <= 0){
            System.out.println("Please check the values again.");
        } else {

        if (heartRate < minHeartRate){
            System.out.println("Your heart rate is Low");
        } else if (heartRate <= maxHeartRate){
            System.out.println("Your heart rate is Normal");
        } else {
            System.out.println("Your heart rate is High");
        }

        if (temp < minTemp){
            System.out.println("Your body temperature is Low");
        } else if (temp <= maxTemp){
            System.out.println("Your body temperature is Normal");
        } else{
            System.out.println("Your have Fever");
        }

        boolean hrNormal = heartRate <= maxHeartRate && heartRate >= minHeartRate;
        boolean tempNormal = temp <= maxTemp && temp >= minTemp;

        if (!hrNormal || !tempNormal){
            System.out.println("ALERT: Needs Attention.");
        }
    }

        sc.close();
        
    }
}
