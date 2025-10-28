import java.util.Random;

public class RandomSubtraction {
    public static void main(String[] args) {
        Random rand = new Random();

        int numberOfProblems = 10; 

        for (int i = 0; i < numberOfProblems; i++) {
            
            int a = rand.nextInt(101);
            int b = rand.nextInt(101);

           
            int minuend = Math.max(a, b);
            int subtrahend = Math.min(a, b);

            int result = minuend - subtrahend;

            System.out.printf("%d - %d = %d%n", minuend, subtrahend, result);
        }
    }
}