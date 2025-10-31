import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        
        System.out.println("Question 1: What is the capital of France?");
        
	System.out.println("a) Berlin");
        
	System.out.println("b) London");
        
	System.out.println("c) Paris");
        
	System.out.println("d) Rome");
        
	System.out.print("Your answer: ");
        
	String answer1 = scanner.nextLine();
        
	if (answer1.equalsIgnoreCase("c")) {
        
	    System.out.println("Correct!");
        
	    score++;
        
	} else {
        
	    System.out.println("Wrong! The correct answer is c) Paris.");
        
	} 
        
	System.out.println();

        
        System.out.println("Question 2: Which planet is known as the Red Planet?");
        
	System.out.println("a) Earth");
        
	System.out.println("b) Mars");
        
	System.out.println("c) Jupiter");
        
	System.out.println("d) Venus");
        
	System.out.print("Your answer: ");
        
	String answer2 = scanner.nextLine();
        
	if (answer2.equalsIgnoreCase("b")) {
        
	    System.out.println("Correct!");
        
	    score++;
        
	} else {
        
	    System.out.println("Wrong! The correct answer is b) Mars.");
        
	}
        
	System.out.println();

        
        System.out.println("Question 3: What is the largest ocean on Earth?");
        
	System.out.println("a) Atlantic Ocean");
        
	System.out.println("b) Indian Ocean");
        
	System.out.println("c) Arctic Ocean");
        
	System.out.println("d) Pacific Ocean");
        
	System.out.print("Your answer: ");
        
	String answer3 = scanner.nextLine();
        
	if (answer3.equalsIgnoreCase("d")) {
        
	    System.out.println("Correct!");
        
	    score++;
        
	} else {
        
	    System.out.println("Wrong! The correct answer is d) Pacific Ocean.");
        
	}
        
	System.out.println();

        System.out.println("Quiz finished! You got " + score + " out of 3 questions correct.");

        
    }
}