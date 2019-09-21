import java.util.Scanner;

public class polling {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[][] responses = new int[5][10]; 
		String[] topics = {"Gender Equality  ", "Quality Education", "Zero Hunger      ", "Clean Water      ", "Climate Action   "}; 
		int i, userRate, j;
		final int NUM_TOPICS = 5;
		int counter = 0;
		int maxIndex = 0, minIndex = 0, min = 0, max = 0, sum = 0;
		double avg;
		
		System.out.println("Please rate the 5 topics 1 through 10. 1 being the least important and 10 being the most important\n");
		
		// ask user to rate the five topics
		while(true) {
			counter++;	
			for (i = 0; i < NUM_TOPICS; i++) {
				System.out.printf("Please rate %s 1(least important) - 10(most important)\n", topics[i] );
				userRate = scnr.nextInt();
				// makes sure user inputs rating from 1-10
				while (userRate > 10) {
					System.out.println("Your rating is out of bounds. Please enter a rating between 1 - 10.");
					userRate = scnr.nextInt();
				}
				// records responses for each topic
				responses[i][userRate - 1]++;
			}
			// ask user if they want to do a new survey
			System.out.println("Enter 1 to Continue. Enter 2 to Exit");
			if (scnr.nextInt() == 2) {
				break;
			}
			System.out.println();		
		}
		
		
		// display table topics, rating, and average
		System.out.printf("%-25s%-90s%s\n", "Topics", "Ratings", "Avg"); 
		System.out.printf("%-25s%-9d%-9d%-9d%-9d%-9d%-9d%-9d%-9d%-9d%-9d\n", "", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10); 
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------"); 

		
		for (i = 0; i < 5; i++) {
			System.out.printf("%s", topics[i]);
			sum = 0;
			for (j = 0; j < 10 ; j++) {
				//System.out.print("j " + j);
				System.out.printf("%9d", responses[i][j]);
				// calculate amount of responses rating * # of responses
				sum += ((j + 1) * responses[i][j]);
			}
			if (i == 0) {
				min = sum;
			}
			// records highest points and topic index with the highest point
			if (sum > max) {
				max = sum;
				maxIndex = i;
			}
			// records lowest points and topic index with the lowest point
			if (sum < min) {
				min = sum;
				minIndex = i;
			}
			// calculate average
			avg = (double)sum / counter;
			System.out.printf("%12.2f", avg);
			System.out.println("\n");
		}
		
		// display topic with the highest and lowest points
		System.out.println("\nIssue with the highest point\nTopic: " + topics[maxIndex] + "\nPoints: " + max);
		System.out.println("\nIssue with the lowest point\nTopic: " + topics[minIndex] + "\nPoints: " + min);
		
		scnr.close();		
	}
}
