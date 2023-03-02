package javaPrelim;
import java.util.*;

public class arithmetic_operators {

	public static void main(String[] args) {
		 int num1, num2, sum;
	     try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter First Number: ");
			 num1 = scanner.nextInt();
			 System.out.print("Enter Second Number: ");
			 num2 = scanner.nextInt();
		}
	     sum = num1 + num2;
	     System.out.println("Sum of " + num1 + " and " + num2 + " = " + sum);
	}
}