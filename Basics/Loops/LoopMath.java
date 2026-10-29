import java.util.Scanner;

public class LoopMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Part A: Multiplication table");

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i;
        for(i=1; i<=10; i++){
            int ans = n*i;
            System.out.println(n + " X " + i + " = " + ans);
        }
        System.out.println();

        System.out.println("Part B: Sum of numbers");

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int total = 0;
        for(i=1; i<=num; i++){
            total += i;
        }
        System.out.println("Sum of the numbers: " + total);

        System.out.println();

        System.out.println("Part C: sum of even numbers only");

        System.out.print("Enter a number: ");
        int limit = sc.nextInt();

        int evenTotal = 0;

        for (i=1; i<=limit; i++){
            if (i%2 == 0){
                evenTotal += i;
            }
        }
        System.out.println("Sum of even numbers: " + evenTotal);
        sc.close();
    }
}
