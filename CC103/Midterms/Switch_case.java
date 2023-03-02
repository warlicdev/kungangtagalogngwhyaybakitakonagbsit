package Midterms;
import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		int year = 0, numMonth = 0, date = 0;
		String month = "";
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Month: ");numMonth = scan.nextInt();
			System.out.print("Date: ");date = scan.nextInt();
			System.out.print("Year: ");year = scan.nextInt();
		}
		if (date < 31) {
			switch(numMonth) {
				case 1: {
					month = "January";
					break;
				}
				case 2: {
					month = "February";
					break;
				}
				case 3: {
					month = "March";
					break;
				}
				case 4: {
					month = "April";
					break;
				}
				case 5: {
					month = "May";
					break;
				}
				case 6: {
					month = "June";
					break;
				}
				case 7: {
					month = "July";
					break;
				}
				case 8: {
					month = "August";
					break;
				}
				case 9: {
					month = "September";
					break;
				}
				case 10: {
					month = "October";
					break;
				}
				case 11: {
					month = "November";
					break;
				}
				case 12: {
					month = "December";
					break;
				}
				default: {
					System.out.println("\nInvalid Month");
					System.exit(0);
				}
			}
			System.out.printf("\n%s %d, %d", month, date, year);
		} else {
			System.out.println("\nInvalid Date.");
		}
		
	}

}
