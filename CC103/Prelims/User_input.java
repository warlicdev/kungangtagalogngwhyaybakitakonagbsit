package javaPrelim;
import java.util.Scanner;

public class User_input {
	public static void main(String[] args) {
		String firstName, middleName ,lastName, town, province;
		int age;
		float height, weight;
		
		try (Scanner getValue = new Scanner(System.in)) {
			//Name
			System.out.print("What is your first name? :: "); firstName = getValue.nextLine();
			System.out.print("What is your middle name? :: "); middleName = getValue.nextLine();
			System.out.print("What is your last name? :: "); lastName = getValue.nextLine();
			System.out.print("How old are you? :: "); age = getValue.nextInt();
			
			//Address
			System.out.println("Where do you live?\n");
			System.out.print("Town :: "); town = getValue.nextLine();
			System.out.print("Province :: "); province = getValue.nextLine();
			
			//Body Composition
			System.out.print("Height :: "); height = getValue.nextFloat();
			System.out.print("Weight :: "); weight = getValue.nextFloat();
		}
		
		//Print
		System.out.print("My name is " + firstName + " " + middleName + " " + lastName + ". I am " + age + " years old. I live in " + town + ", \n" + province + ". My height and weight are " + height + " cm and " + weight + " lbs. respectively.");
		System.out.println(town);
		
	}
}
