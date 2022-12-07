package dayTwo;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
	

public class ChallengeTwo {
	
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
					
					if (opponent == 'A') {
						totalScore += 3;
					} else if (opponent == 'B') {
						totalScore += 1;
					} else if (opponent == 'C') {
						totalScore += 2;
					}
				} else if (player == 'Y') {
					totalScore += 3;
					
					if (opponent == 'A') {
						totalScore += 1;
					} else if (opponent == 'B') {
						totalScore += 2;
					} else if (opponent == 'C') {
						totalScore += 3;
					}
				} else if (player == 'Z') {
					totalScore += 6;
					
					if (opponent == 'A') {
						totalScore += 2;
					} else if (opponent == 'B') {
						totalScore += 3;
					} else if (opponent == 'C') {
						totalScore += 1;
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
