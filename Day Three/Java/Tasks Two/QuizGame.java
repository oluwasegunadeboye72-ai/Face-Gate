import java.util.Scanner;
public class QuizGame {
    public static void main(String []args){

	Scanner scanner = new Scanner(System.in);

	int score = 0;

	System.out.println("What is Capital of France:");

	System.out.println("A) Paris");

	System.out.println("B) London");

	System.out.println("C) Berlin");

	System.out.println("D) Rome");

	System.out.print("Enter your choice (A, B, C, or D): ");

	String answer1 = scanner.nextLine().toUperCase();

	if (answer1.equals("C")){

	    System.out.println("Correct!");

	    score++;

	} else{

	    System.out.println("Wrong! The correct answer is C) Paris.");

	} 

	System.out.println();

	System.out.println("Quiz Finished!");

	System.out.println("Your final score is: " + score + " out of 1");

     }

}
   





     



     

 



