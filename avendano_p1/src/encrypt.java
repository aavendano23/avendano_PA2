
import java.util.Scanner; 
public class encrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in); 

		int first; 
		int second; 
		int third; 
		int fourth; 
		int finalNum;
		int userNum;
		
		System.out.println("Enter a 4-digit number: "); 
		userNum = scnr.nextInt();

		// gets all four single digits 
		first = (userNum / 1000) % 10; 
		second = (userNum / 100) % 10; 
		third = (userNum / 10) % 10; 
		fourth = userNum % 10;
		//System.out.println("first " + first + " second " + second + " third " + third + " fourth " + fourth); 
		 
		// computes first level of encryption 
		first = (first + 7) % 10; 
		second = (second + 7) % 10; 
		third = (third + 7) % 10;
		fourth = (fourth + 7) % 10; 
		 

		// computes last second level round of encryption 
		// switches first with third and fourth with second 
		finalNum = third * 1000 + fourth * 100 + first * 10 + second;
		System.out.println("Encrypted number: " + finalNum);
		
		scnr.close();
	}

}
