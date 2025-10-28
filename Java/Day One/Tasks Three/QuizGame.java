import java.util.Scanner;
public class QuizGame{
    public static void main(String[] args){
        
	Scanner scanner = new Scanner(System.in);

        
        String[] questions ={
            "1. What is 5 + 3?",
            
	    "2. What is the capital of France?",
            
	    "3. Solve for x: 2x + 4 = 10",
            
	    "4. What is the square root of 49?",
            
	    "5. Who wrote 'Romeo and Juliet'?",
            
	    "6. What is 12 / 3?",
            
	    "7. What color do you get by mixing red and blue?",
            
	    "8. What planet is known as the Red Planet?",
          
	    "9. How many continents are there?",
            
	   "10. What is the largest mammal?"
        };

        String[] answers = {
            
	    "8",                
            "Paris",            
            "3",                
            "7",                
            "Shakespeare",      
            "4",               
            "Purple",           
            "Mars",             
            "7",                
            "Blue whale"        
        };

        int score = 0;

        
        for (int i = 0; i < questions.length; i++) {
            
	    System.out.println(questions[i]);
            
	    boolean correct = false;

           
            for (int attempt = 1; attempt <= 2; attempt++) {
                
		System.out.print("Your answer (Attempt " + attempt + "): ");
                
		String userAnswer = scanner.nextLine().trim();

               
                if (userAnswer.equalsIgnoreCase(answers[i])) {
                    
		    System.out.println("Correct!\n");
                    
	            score++;
                    
	            correct = true;
                    
                } else if (attempt < 2) {
                    
		    System.out.println("Incorrect. Try again.\n");
                
		} else {
                    
		    System.out.println("Incorrect. The correct answer was: " + answers[i] + "\n");
                }
            }
        }

        System.out.println("Quiz complete!");
        
	System.out.println("Your final score: " + score + " out of " + questions.length);
        
    }
}