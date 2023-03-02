package javaPrelim;
import java.util.Scanner;

public class Lab_Exercise_1 {
	public static void main(String[] args) {
		// Variable Declarations
		String firstName, middleName, lastName, course, subject;
		int studentNumber;
		float prelims, midterms, preFinals, finals, average;
		
		// Inputs
		try(Scanner scan = new Scanner(System.in)) {
			// Student Number
			System.out.print("Student number: "); studentNumber = scan.nextInt();
			scan.nextLine();
			
			// Full Name
			System.out.print("First Name: "); firstName = scan.nextLine();
			System.out.print("Middle Name: "); middleName = scan.nextLine();
			System.out.print("Last Name: "); lastName = scan.nextLine();
			
			// Course
			System.out.print("Course: "); course = scan.nextLine();
			
			// Subject
			System.out.print("Subject: "); subject = scan.nextLine();
			
			// Grades
			System.out.println("\nGRADES: "); 
			System.out.print("Prelims: "); prelims = scan.nextFloat();
			System.out.print("Midterms: "); midterms = scan.nextFloat();
			System.out.print("Pre-Finals: "); preFinals = scan.nextFloat();
			System.out.print("Finals: "); finals = scan.nextFloat();
			average = (prelims + midterms + preFinals + finals) / 4;
		}
		
		// Output
		System.out.printf("\nStudent Number: " + studentNumber + "\nName: " + firstName + " " 
		+ middleName + " " + lastName + "\nCourse: " + course + "\nSubject: " + subject 
		+ "\nFinal Grade: %.2f", average);
	}
}
