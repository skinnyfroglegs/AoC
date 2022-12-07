package dayOne;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class ChallengeTwo {

		public static void main(String[] args) {
			
		    File file = new File("input.txt");
			
		    try {
		    	
		    	Scanner scanner = new Scanner(file);
				String calories;
				int totalCalories = 0;
				int topThree = 0;
				ArrayList<Integer> calorieList = new ArrayList<Integer>();
				
			
				while (scanner.hasNext()) {
					calories = scanner.nextLine();
					
					if (calories.isEmpty() || calories.trim().equals("") || calories.trim().equals("\n")) {
						calorieList.add(totalCalories);
						totalCalories = 0;
						
					} else {
						totalCalories += Integer.parseInt(calories);
						}
				}
				
				scanner.close();
				
				Collections.sort(calorieList);
				Collections.reverse(calorieList);
				
			    for (int i = 0; i < 3; i++) {
			      topThree += calorieList.get(i);
			    }
								
				System.out.print(topThree);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}