import java.util.Scanner;
public class SequentialProblems {
    public static void main(String[] args) {
        
	Scanner scanner = new Scanner(System.in);

        String[] problems = {
            "Problem 1: What is 5 + 3?",
            "Problem 2: What is the capital of France?",
            "Problem 3: Solve for x: 2x + 4 = 10",
            "Problem 4: What is the square root of 49?"
        };

        
        for (int i = 0; i < problems.length; i++) {
            System.out.println(problems[i]);

            
            System.out.print("Press Enter to continue...");
            scanner.nextLine();
            System.out.println(); 
        }

        System.out.println("All problems displayed!");
        
    }
}