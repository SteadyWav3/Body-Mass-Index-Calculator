
import java.util.Scanner;

public class BmiTest {

	// main method
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		Bmi bm = new Bmi();

		// unit that collect the user course name
		System.out.println("Enter your Weight in Kilogram: ");
		Double weightKg = input.nextDouble();

		System.out.println("Enter your Height in Meters: ");
		Double heightMeters = input.nextDouble();
		System.out.println(); // print a clean line


		bm.index(weightKg, heightMeters);  
	}
}