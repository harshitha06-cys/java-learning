//package Basics.Variables;

import java.util.Scanner;

public class PatientInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter patient name: ");
        String name = sc.nextLine();

        System.out.print("Enter patient age: ");
        int age = sc.nextInt();

        System.out.print("Enter body temperature(F): ");
        double temp = sc.nextDouble();

        System.out.println("Patient name: " + name);
        System.out.println("Patient age: " + age);
        System.out.println("Body Temperature: " + temp);

        sc.close();
    }
}
