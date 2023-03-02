package Midterms;
import java.util.*;
import java.lang.Math;

public class Lab_Exercise_5 {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
        char choice;
        boolean r = true;
        
        do {
        	System.out.println("::: OPERATION :::");
        	System.out.println();
            System.out.println("Select an operation:");
            System.out.println("A. Sum of Square");
            System.out.println("B. Square of Sum");
            System.out.println("C. Exit");
            System.out.print("Choice: ");
            choice = c.next().charAt(0);
            if (choice == 'A' || choice == 'a') {
                int n, sum = 0, i = 1;
                System.out.println("You chose Sum of Square");
                System.out.println("==========================");
                System.out.print("Enter integer limit: ");
                n = c.nextInt();
                
                while (i <= n) {
                    sum += Math.pow(i, 2);
                    i++;
                }
                
                System.out.println("The sum of square of integer limit " + n + " is " + sum + ".");
                
            } else if (choice == 'B' || choice == 'b') {
                int m, sum = 0, j = 1;
                System.out.println("You chose Square of Sum");
                System.out.println("==========================");
                System.out.print("Enter integer limit: ");
                m = c.nextInt();
                
                while (j <= m) {
                    sum += j;
                    j++;
                }
                
                int squareOfSum = (int) Math.pow(sum, 2);
                
                System.out.println("The square of sum of integer limit " + m + " is " + squareOfSum + ".");
                
            } else if (choice == 'C') {
                System.out.println("Exiting program...");
                
            } else {
                System.out.println("Invalid choice. Please select again.");
            }
            
            System.out.println();
            
        } while (choice != 'C');
    }
}
