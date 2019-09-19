import java.util.Scanner;

public class polling {

	public static void main(String[] args) {
		int[][] poll = new int[5][10]; 
		int[] topics = new int[5]; 
		int i;
		
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
