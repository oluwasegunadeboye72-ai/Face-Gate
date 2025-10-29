import java.util.Scanner;
public class QuizGame {
    public static void main(String []args){

	Scanner scanner = new Scanner(System.in);

	System.out.println("1. Paris");

	System.out.println("2. London");

	System.out.println("3. Berlin");

	System.out.println("4. Rome");

	System.out.print("Enter the choice (1 + 4):");

	int choice = scanner.nextInt();

	switch (choice){

	    case 1 -> System.out.println("Correct The Capital of France is Paris.");

	    case 2 -> System.out.println("Invalid The Capital of France is London.");

	    case 3 -> System.out.println("Invalid The Capital of France is not Berlin.");

	    case 4 -> System.out.println("Invalid The Capital of France is not Rome.");

	    default -> System.out.println("Invalid choice: Please select a number between 1 and 4.");

        }

   }

}
