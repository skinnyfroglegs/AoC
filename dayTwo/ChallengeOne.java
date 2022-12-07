package dayTwo;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
	

public class ChallengeOne {
	
	public static void main(String[] args) {

		File file = new File("inputRockPaperScissors.txt");
		
	    try {
			Scanner scanner = new Scanner(file);
			
			int totalScore = 0;
			String currentGame;
			char opponent, player;	
		
			while (scanner.hasNext()) {
				currentGame = scanner.nextLine();
				
				opponent = currentGame.charAt(0);
				player = currentGame.charAt(2);
				
				if (player == 'X') {
					totalScore += 1;
					
					if (opponent == 'A') {
						totalScore += 3;
					} else if (opponent == 'C') {
						totalScore += 6;
					}
				} else if (player == 'Y') {
					totalScore += 2;
					
					if (opponent == 'B') {
						totalScore += 3;
					} else if (opponent == 'A') {
						totalScore += 6;
					}
				} else if (player == 'Z') {
					totalScore += 3;
					
					if (opponent == 'C') {
						totalScore += 3;
					} else if (opponent == 'B') {
						totalScore += 6;
					}
				}
				
			}
			
			scanner.close();
			
			System.out.print(totalScore);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
