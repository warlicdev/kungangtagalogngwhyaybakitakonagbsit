package Midterms;
import java.util.Scanner;

public class average_grade_program {

	public static void main(String[] args) {
		double g1 = 0, g2 = 0, g3 = 0, g4 = 0, totalGrade = 0;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter grade for 1st Quarter: ");g1 = scan.nextFloat();
			System.out.print("Enter grade for 2nd Quarter: ");g2 = scan.nextFloat();
			System.out.print("Enter grade for 3rd Quarter: ");g3 = scan.nextFloat();
			System.out.print("Enter grade for 4th Quarter: ");g4 = scan.nextFloat();
		}
		totalGrade = g1 + g2 + g3 + g4;
		System.out.printf("Average Grade: %.2f\nRating: ", totalGrade/4);
		if((totalGrade / 4) > 100) {
			System.out.println("Invalid Grade");
		} else if((totalGrade / 4) >= 98) {
			System.out.println("With Highest Honors");
		} else if((totalGrade / 4) >= 95) {
			System.out.println("With High Honors");
		} else if((totalGrade / 4) >= 90) {
			System.out.println("With Honors");
		} else if((totalGrade / 4) >= 75) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
	}
}
