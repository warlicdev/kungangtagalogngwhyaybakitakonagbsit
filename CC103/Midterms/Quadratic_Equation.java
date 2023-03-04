package Midterms;
import java.util.Scanner;

public class Quadratic_Equation {
  public static void main(String[] Strings) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the value of a: ");
    double a = scan.nextDouble();
    System.out.print("Enter the value of b: ");
    double b = scan.nextDouble();
    System.out.print("Enter the value of c: ");
    double c = scan.nextDouble();
    double d = b * b - 4.0 * a * c;
    if (d > 0.0) {
      double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
      double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
      System.out.printf("The roots are %.1f and %.1f", r1, r2);
    } else if (d == 0.0) {
      double r1 = -b / (2.0 * a);
      System.out.printf("The root is %.1f", r1);
    } else {
      System.out.println("Roots are not real.");
    }
  }
}