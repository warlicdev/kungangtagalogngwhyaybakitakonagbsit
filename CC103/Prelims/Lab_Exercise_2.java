package javaPrelim;
import java.util.Scanner;

public class Lab_Exercise_2 {
	public static void main(String[] args) {
		double radius, height, constantPi = 6.28318531 , area;
		try(Scanner scan = new Scanner(System.in)) {
			System.out.print("Input radius: "); radius = scan.nextFloat();
			System.out.print("Input height: ");height = scan.nextFloat();
			area = (constantPi * radius * height) + (constantPi * Math.pow(radius, 2));
		}
		System.out.printf("The total surface are of the cylinder is: %.5f", area);
	}
}
