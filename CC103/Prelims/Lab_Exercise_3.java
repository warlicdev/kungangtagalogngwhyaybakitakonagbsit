package javaPrelim;
import java.util.Scanner;

public class Lab_Exercise_3 {

	public static void main(String[] args) {
		float aSide, bSide, h, area;
		try(Scanner scan = new Scanner(System.in)) {
			System.out.print("Input the first parallel side (a): "); aSide = scan.nextInt();
			System.out.print("Input the second parallel side (b): "); bSide = scan.nextInt();
			System.out.print("Input the distance between two parallel sides (h): "); h = scan.nextInt();
			
			area = ((aSide + bSide)/2) * h;
		}
		System.out.printf("The area of the trapezoid is: %.0f", area);
	}
}
