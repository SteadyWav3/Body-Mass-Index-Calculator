public class Bmi {

	// 
	public void index( double weightInKilograms, double heightInMeters ) {
		System.out.println("WELCOME TO THE BODY MASS INDEX CALACULATOR!!" );
		double bodyMassIndex =  weightInKilograms / (heightInMeters * heightInMeters);

		System.out.printf("Your Body Mass Index is: %f ", bodyMassIndex);
		System.out.println("AND \n.\n.");

		if (bodyMassIndex < 18.5) {
			System.out.println("You are UNDERWEIGHT!! Since Your body Mass is Less than 18.5 BMI\n");
		} else if( (bodyMassIndex >= 18.5) || (bodyMassIndex <= 24.9) ) {
			System.out.println("You are NORMAL WEIGHT!! is between 18.5 and 24.9 BMI \n");
		} else if ((bodyMassIndex >= 25.0) || (bodyMassIndex <= 29.9)) {
			System.out.println("You are OVER WEIGHT!! Since Your body Mass Index is between 25.0 and 29.9 BMI\n");
		} else if (bodyMassIndex >= 30.0) {
			System.out.println("You are OBESE!! Since Your body Mass Index is Above 30 BMI\n");
		} 
	}
}