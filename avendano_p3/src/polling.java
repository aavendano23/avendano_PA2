import java.util.Scanner;

public class polling {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[][] poll = new int[5][10]; 
		String[] topics = {"Gender Equality", "Quality Education", "Zero Hunger", "Clean Water", "Climate Action"}; 
		int i, userRate;
		final int NUM_TOPICS = 5;
		int counter = 0;
		
		System.out.println("Please rate the 5 topics 1 through 10. 1 being the least important and 10 being the most important");
		
		while(true) {
			
			if (counter == 3) {
				break;
			}
			
			for (i = 0; i < NUM_TOPICS; i++) {
				System.out.printf("Please rate the %s 1 through 10. 1 being the least important and 10 being the most important\n", topics[i] );
				userRate = scnr.nextInt();
				while (userRate > 10) {
					System.out.println("Your rating is out of bounds. Please enter a rating between 1 - 10.");
					userRate = scnr.nextInt();
				}
				poll[i][userRate - 1]++;
			}
			
			System.out.println();
			
			counter++;			
		}
		
		
		// display table 
		System.out.printf("%-15s%s\n", "Topics", "Ratings"); 
		System.out.printf("%-15s%d %-8s %-8d%-8d%-8d%-8d%-8d%-8d%-8d%-8d%-8s\n", "", 1, "- Least Important", 2, 3, 4, 5, 6, 7, 8, 9, "10 - Most Important"); 
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------"); 

		 
		/*for (i = 0; i < 5; i++) {
			System.out.printf("%s%-15s", topic, "");
			for (j = 0; j <= i; i++) {
				System.out.printf("%d%-8s", poll[i][j], "");
			}
		}*/



	

	}

}
