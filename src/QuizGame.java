import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {

        // Create Scanner object to get user input
        Scanner input = new Scanner(System.in);

        int score = 0;          // Stores number of correct answers
        String answer;         // Stores user's answer

        // ---------------- Question 1 ----------------
        System.out.println("1. What is the capital of France?");
        System.out.println("A. Berlin");
        System.out.println("B. Madrid");
        System.out.println("C. Paris");
        System.out.println("D. Rome");
        System.out.print("Enter your answer: ");

        // Read input and convert to uppercase
        answer = input.nextLine().toUpperCase();

        // Check answer using if statement
        if (answer.equals("C")) {
            score++;
        }

        // ---------------- Question 2 ----------------
        System.out.println("\n2. Which language is used for Android development?");
        System.out.println("A. Python");
        System.out.println("B. Java");
        System.out.println("C. C++");
        System.out.println("D. Ruby");
        System.out.print("Enter your answer: ");

        answer = input.nextLine().toUpperCase();

        // Check answer using switch statement
        switch (answer) {
            case "B":
                score++;
                break;
            default:
                break;
        }

        // ---------------- Question 3 ----------------
        System.out.println("\n3. What does CPU stand for?");
        System.out.println("A. Central Processing Unit");
        System.out.println("B. Computer Personal Unit");
        System.out.println("C. Central Program Utility");
        System.out.println("D. Control Processing Unit");
        System.out.print("Enter your answer: ");

        answer = input.nextLine().toUpperCase();

        if (answer.equals("A")) {
            score++;
        }

        // ---------------- Question 4 ----------------
        System.out.println("\n4. Which symbol is used for comments in Java?");
        System.out.println("A. #");
        System.out.println("B. //");
        System.out.println("C. /* */");
        System.out.println("D. Both B and C");
        System.out.print("Enter your answer: ");

        answer = input.nextLine().toUpperCase();

        switch (answer) {
            case "D":
                score++;
                break;
            default:
                break;
        }

        // ---------------- Question 5 ----------------
        System.out.println("\n5. Which company developed Java?");
        System.out.println("A. Microsoft");
        System.out.println("B. Apple");
        System.out.println("C. Sun Microsystems");
        System.out.println("D. Google");
        System.out.print("Enter your answer: ");

        answer = input.nextLine().toUpperCase();

        if (answer.equals("C")) {
            score++;
        }

        // ---------------- Calculate Percentage ----------------
        double percentage = (score / 5.0) * 100;

        // ---------------- Display Result ----------------
        System.out.println("\nQuiz Completed!");
        System.out.println("Correct Answers: " + score + "/5");
        System.out.println("Score: " + percentage + "%");

        // Close scanner
        input.close();
    }
}