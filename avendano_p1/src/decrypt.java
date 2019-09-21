import java.util.Scanner; 
public class decrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int first; 
		int second; 
		int third; 
		int fourth; 
		int finalVal;
		int userNum;
		
		System.out.println("Enter 4 digit number to decrypt: ");
		userNum = scnr.nextInt();
		 
		// gets all four single digits 
		first = (userNum / 1000) % 10;
		second = (userNum / 100) % 10; 
		third = (userNum / 10) % 10; 
		fourth = userNum % 10; 
		//System.out.println("first " + first + " second " + second + " third " + third + " fourth " + fourth); 

		// decrypts first level of encryption 
		first = first - 7 + ((first <= 6) ? 10 : 0); 
		second = second - 7 + ((second <= 6) ? 10 : 0); 
		third = third - 7 + ((third <= 6) ? 10 : 0); 
		fourth = fourth - 7 + ((fourth <= 6) ? 10 : 0); 

		// computes last second level round of encryption 
		// switches first with third and fourth with second 
		finalVal = third * 1000 + fourth * 100 + first * 10 + second; 
		System.out.println("Decrypted number: " + finalVal);
		
		scnr.close();

	}

}
