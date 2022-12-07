package dayOne;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
	
	
public class ChallengeOne {
	
	public static void main(String[] args) {
		
	    File file = new File("input.txt");
		
	    try {
	    	
	    	Scanner scanner = new Scanner(file);
			String calories;
			int totalCalories = 0;
			int highestCalories = 0;	
		
			while (scanner.hasNext()) {
				calories = scanner.nextLine();
				
				if (calories.isEmpty() || calories.trim().equals("") || calories.trim().equals("\n")) {
					if (totalCalories > highestCalories) {
						highestCalories = totalCalories;
					}
					
					totalCalories = 0;
					
				} else {
					totalCalories += Integer.parseInt(calories);
					}
			}
			
			scanner.close();
			
			System.out.print(highestCalories);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
