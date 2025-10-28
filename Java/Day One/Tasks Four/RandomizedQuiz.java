import java.util.*;
public class RandomizedQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        String[] questions = {
            "What is 5 + 3?",
            "What is the capital of France?",
            "Solve for x: 2x + 4 = 10",
            "What is the square root of 49?",
            "Who wrote 'Romeo and Juliet'?",
            "What is 12 / 3?",
            "What color do you get by mixing red and blue?",
            "What planet is known as the Red Planet?",
            "How many continents are there?",
            "What is the largest mammal?",
            "What gas do plants absorb from the atmosphere?",
            "Which element has the chemical symbol 'O'?",
            "What is 9 x 9?",
            "What is the fastest land animal?",
            "Who painted the Mona Lisa?"
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
            "Blue whale",
            "Carbon dioxide",
            "Oxygen",
            "81",
            "Cheetah",
            "Leonardo da Vinci"
        };

        
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < questions.length; i++){
            indices.add(i);
        }
        Collections.shuffle(indices); 

        int score = 0;
        int numQuestions = 10; 
        System.out.println("===== Welcome to the Randomized Quiz! =====");
        System.out.println("You will be asked " + numQuestions + " random questions.");
        System.out.println("You get 2 attempts per question.\n");

       
        for (int i = 0; i < numQuestions; i++) {
            int qIndex = indices.get(i); 
            boolean correct = false;

            System.out.println("Question " + (i + 1) + ": " + questions[qIndex]);

            
            for (int attempt = 1; attempt <= 2; attempt++) {
                System.out.print("Your answer (Attempt " + attempt + "): ");
                String userAnswer = scanner.nextLine().trim();

                if (userAnswer.equalsIgnoreCase(answers[qIndex])) {
                    
		    System.out.println("Correct!\n");
                    
		    score++;
                    
	            correct = true;
                    
                
		} else if (attempt < 2) {
                    
		    System.out.println("Incorrect. Try again.\n");
                
		} else {
                 
		    System.out.println("Incorrect. The correct answer was: " + answers[qIndex] + "\n");
                }
            }
        }

        
        System.out.println("===== Quiz Complete! =====");
        
	System.out.println("Your final score: " + score + " out of " + numQuestions);
        
	double percent = ((double) score / numQuestions) * 100;
        
	System.out.printf("You scored %.1f%%\n", percent);

        if (percent >= 80) {
            
	    System.out.println("Excellent work!");
        
	} else if (percent >= 50) {
            
	    System.out.println("Good job, but you can improve!");
        
	} else {
            
	    System.out.println("Keep practicing!");
        }

        
    }
}