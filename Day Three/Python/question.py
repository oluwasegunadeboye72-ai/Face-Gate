def run_quiz():
    score = 0

   
    question = "What is the capital of France?"
    choices = ["A) Berlin", "B) Madrid", "C) Paris", "D) Rome"]
    correct_answer = "C"

    print(question)
    for choice in choices:
        print(choice)

    user_answer = input("Enter your choice (A, B, C, or D): ").upper()

    if user_answer == correct_answer:
        print("Correct!")
        score += 1
    else:
        print(f"Wrong. The correct answer was {correct_answer}.")

    print(f"You got {score} question(s) correct.")