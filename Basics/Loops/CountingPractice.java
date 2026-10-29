public class CountingPractice{
    public static void main(String[] args) {
        
        System.out.println("Part 1: 1 to 10");
        int i;
        for(i = 1; i<=10; i++){
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Part 2a: Even numbers (step of 2)");
        for(i=2; i<=20; i+=2){
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Part 2b: Even numbers (using %2)");
        for(i=1; i<=20; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
        System.out.println();

        System.out.println("Part 3: 10 to 1 count down");
        int count = 10;
        while (count>=1) {
            System.out.println(count);
            count--;
        }
        System.out.println("DONE");
    }
}