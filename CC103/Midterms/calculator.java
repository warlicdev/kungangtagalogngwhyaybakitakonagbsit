package Midterms;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		double a, b, c, choice;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Choose one operation: \n1 : Addition\n2 : Subtraction\n3 : Multiplication\n4 : Division (Should not allow division by zero.)\n5 : Modulus (Determine if the given number is odd or even.)\n:: ");
			choice = scan.nextInt();
			System.out.println("\n\n==================================");
			if (choice == 1) {
				// ADDITION
				System.out.print("You chose \"Addition\" \n");
				
				// Input
				System.out.print("Enter First Number: ");a = scan.nextFloat();
				System.out.print("Enter Second Number: ");b = scan.nextFloat();
				System.out.print("Enter Third Number: ");c = scan.nextFloat();
				
				// Print
				System.out.printf("\nThe answer to %.0f + %.0f + %.0f is %.0f.", a, b, c, a + b + c);
			} else if(choice == 2) {
				// SUBTRACTION
				System.out.print("You chose \"Subtraction\" \n");
							
				// Input
				System.out.print("Enter First Number: ");a = scan.nextFloat();
				System.out.print("Enter Second Number: ");b = scan.nextFloat();
				
				// Print
				System.out.printf("\nThe answer to %.0f - %.0f is %.0f.", a, b, a - b);
			} else if(choice == 3) {
				// MULTIPLICATION
				System.out.print("You chose \"Multiplication\" \n");
							
				// Input
				System.out.print("Enter First Number: ");a = scan.nextFloat();
				System.out.print("Enter Second Number: ");b = scan.nextFloat();
				
				// Print
				System.out.printf("\nThe answer to %.0f * %.0f is %.0f.", a, b, a * b);
			} else if(choice == 4) {
				// DIVISION
				System.out.print("You chose \"Division\" \n");
							
				// Input
				System.out.print("Enter First Number: ");a = scan.nextFloat();
				System.out.print("Enter Second Number: ");b = scan.nextFloat();
				
				// Print
				if (b != 0) {
					System.out.printf("\nThe answer to %.0f * %.0f is %.1f.", a, b, a / b);
				}else {
					System.out.printf("\nOperation can't proceed.\nNote: Division by zero is not allowed.");
				}
			} else if(choice == 5) {
				// MODULUS
				System.out.print("You chose \"Modulus\" \n");
										
				// Input
				System.out.print("Enter a Number: ");a = scan.nextFloat();

				// Print
				if (a % 2 == 0) {
					System.out.printf("\nNumber %.0f is an even number.", a);
				}else {
					System.out.printf("\nNumber %.0f is an odd number.", a);
				}
			} else {
				System.out.println("Operation not found. Please rerun program and try again.");
			}
		}
 	}

}
