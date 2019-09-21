import java.util.Scanner; 

public class BMIcalculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in); 

		double bmi = 0; 
		int choice; 
		double weight; 
		double height;
		
		// ask user if they want to use kg & cm or lbs & in 
		System.out.println("BMI (Body Mass Index) Calculator"); 
		System.out.println("What measuring system would you like to use?\n (1) Meteric\n (2) US standard"); 
		choice = scnr.nextInt(); 
		 
		// ask user to input height and weight using measurement they chose
		if (choice == 1) {
			System.out.println("Please enter your weight in kilograms: ");
			weight = scnr.nextDouble();
			System.out.println("Please enter your height in centimeters: ");
			height = scnr.nextDouble();
			// calculate bmi with meteric system
			bmi = weight / Math.pow(height, 2);
		}

		if (choice == 2) {
			System.out.println("Please enter your weight in pounds: ");
			weight = scnr.nextDouble();
			System.out.println("Please enter your height in inches: ");
			height = scnr.nextDouble();
			// calculate bmi with US standard system
			bmi = 703 * weight / Math.pow(height, 2);
		}
		
		// displays bmi and categorizes user based on bmi
		System.out.printf("Your BMI is: %.2f\n", bmi);		 
		
		if (bmi < 18.5) {
			System.out.println("Underweight");
		}
		else if (bmi <24.9) {
			System.out.println("Normal weight");
		}
		else if (bmi < 29.9) { 
			System.out.println("Overweight"); 
		}
		else { 
			System.out.println("Obesity");
		}
		
		scnr.close();

	}

}
