package Midterms;
import java.util.Scanner;
public class Challenge_WhileLoops {

	public static void main(String[] args) {
		double a, b, c;
		int choice;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Choose one operation: \n1 : Addition\n2 : Subtraction\n3 : Multiplication\n4 : Division (Should not allow division by zero.)\n5 : Modulus (Determine if the given number is odd or even.)\n6 : Exit\n:: ");
			choice = scan.nextInt();
			System.out.println("\n\n==================================");
			while(choice != 6) {
				switch(choice) {
					case 1: {
						System.out.print("You chose \"Addition\" \n");
						System.out.print("Enter First Number: ");a = scan.nextFloat();
						System.out.print("Enter Second Number: ");b = scan.nextFloat();
						System.out.print("Enter Third Number: ");c = scan.nextFloat(); 
						System.out.printf("\nThe answer to %.0f + %.0f + %.0f is %.0f.", a, b, c, a + b + c);
						break;
					}
					case 2: {
						System.out.print("You chose \"Subtraction\" \n");
						System.out.print("Enter First Number: ");a = scan.nextFloat();
						System.out.print("Enter Second Number: ");b = scan.nextFloat();
						System.out.printf("\nThe answer to %.0f - %.0f is %.0f.", a, b, a - b);
						break;
					}
					case 3: {
						System.out.print("You chose \"Multiplication\" \n");
						System.out.print("Enter First Number: ");a = scan.nextFloat();
						System.out.print("Enter Second Number: ");b = scan.nextFloat();
						System.out.printf("\nThe answer to %.0f * %.0f is %.0f.", a, b, a * b);
						break;
					}
					case 4: {
						System.out.print("You chose \"Division\" \n");
						System.out.print("Enter First Number: ");a = scan.nextFloat();
						System.out.print("Enter Second Number: ");b = scan.nextFloat();
						if (b != 0) {
							System.out.printf("\nThe answer to %.0f * %.0f is %.1f.", a, b, a / b);
							break;
						} else {
							System.out.printf("\nOperation can't proceed.\nNote: Division by zero is not allowed.");
							break;
						}
					}
					case 5: {
						System.out.print("You chose \"Modulus\" \n");
						System.out.print("Enter a Number: ");a = scan.nextFloat();
						if (a % 2 == 0) {
							System.out.printf("\nNumber %.0f is an even number.", a);
							break;
						}else {
							System.out.printf("\nNumber %.0f is an odd number.", a);
							break;
						}
					}
					default: {
						System.out.print("Invalid selection. Please try again.");
						break;
					}
				}
				System.out.print("\n\nChoose one operation: \n1 : Addition\n2 : Subtraction\n3 : Multiplication\n4 : Division (Should not allow division by zero.)\n5 : Modulus (Determine if the given number is odd or even.)\n6 : Exit\n:: ");
				choice = scan.nextInt();
			}
			System.out.print("Thank you.");
		}
 	}
}
