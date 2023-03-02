package Midterms;
import java.util.Random;
import java.util.Scanner;


public class Lab_Exercise_4 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
		Random rand = new Random();
		String choice = "";
		int num1 = rand.nextInt(100), num2 = rand.nextInt(100) + 1, answer = 0; // num2 has + 1 on it on random number generation for it to not generate number 0 for the sake of not having it as a denominator
		int operator = 0, score = 0, mistakes = 0;
		char symbol = ' ';
		boolean playAgain = true, isCorrect = true;

		System.out.println("Welcome to KIDS MATH Game!");
		while (playAgain) {
		  isCorrect = true;
		  System.out.println("\nThe two random numbers are: " + num1 + " and " + num2 + "\n");
		  System.out.print("====OPERATIONS====\n1: Addition\n2: Subtraction\n3: Multiplication\n4: Division\n5: Modulus\nPlease choose an operation:: ");
		  operator = input.nextInt();
		  while (operator > 5 || operator < 1) {
		    System.out.print("Invalid operator.\nPlease choose valid operator: ");
		    operator = input.nextInt();
		  }
		  if (operator != 5) {
		    if (operator == 1) {
		      symbol = '+';
		    } else if (operator == 2) {
		      symbol = '-';
		    } else if (operator == 3) {
		      symbol = '*';
		    } else if (operator == 4) {
		      symbol = '/';
		      System.out.println("Note: Round off to the nearest whole number.\n");
		    }
		    System.out.printf("What is the answer for %d %c %d?\nYour answer: ", num1, symbol, num2);
		    answer = input.nextInt();
		  } else if (operator == 5) {
		    System.out.print("Is " + num1 + " " + "even or odd?: ");
		    choice = input.next().toUpperCase();
		  }
		  switch (operator) {
		  case 1: {
		    if (answer == num1 + num2) {
		      System.out.println("Your answer is correct!");
		    } else {
		      System.out.println("The answer is wrong.");
		      isCorrect = false;
		    }
		    break;
		  }
		  case 2: {
		    if (answer == num1 - num2) {
		      System.out.println("Your answer is correct!");
		    } else {
		      System.out.println("The answer is wrong.");
		      isCorrect = false;
		    }
		    break;
		  }
		  case 3: {
		    if (answer == num1 * num2) {
		      System.out.println("Your answer is correct!");
		    } else {
		      System.out.println("The answer is wrong.");
		      isCorrect = false;
		    }
		    break;
		  }
		  case 4: {
		    if (answer == num1 / num2) {
		      System.out.println("Your answer is correct!");
		    } else {
		      System.out.println("The answer is wrong.");
		      isCorrect = false;
		    }
		    break;
		  }
		  case 5: {
		    choice.toUpperCase();
		    if (num1 % 2 == 0) {
		      if (choice.equals("EVEN")) {
		        System.out.println("Your answer is correct!");
		      } else {
		        System.out.println("Your answer is wrong.");
		        isCorrect = false;
		      }
		    } else if (num1 % 2 == 1) {
		      if (choice.equals("ODD")) {
		        System.out.println("Your answer is correct!");
		      } else {
		        System.out.println("Your answer is wrong.");
		        isCorrect = false;
		      }
		    } else {
		      System.out.println("Your answer is wrong.");
		      isCorrect = false;
		      break;
		    }
		    break;
		  }
		  default: {
		    System.out.println("Invalid operator.");
		    break;
		  }
		  }
		  if(isCorrect) {
			  score++;
		  } else {
			  mistakes++;
		  }
		  System.out.printf("Correct: %d\nWrong: %d\n", score, mistakes);
		  System.out.print("Do you want to play again? (Yes or No): ");
		  String playAgainStr = input.next().toUpperCase();
		  if (!playAgainStr.equals("YES")) {
		    playAgain = false;
		  } else {
		    num1 = rand.nextInt(100);
		    num2 = rand.nextInt(100);
		  }
		}
		System.out.printf("\nYour final score is [Mistakes Deducted]: %d\nThanks for playing the KIDS MATH Game!", score-mistakes);
	}
  }
}