package Snake;

import java.util.Random;

import ledControl.BoardController;

import Snake.Board;

public class Food {
	
	static BoardController controller = BoardController.getBoardController();
	int min = 0;
	int max = 1;
	
	public Food(){
		//for the random generator
		if (Board.screen == 1){
			max = 10;
			min = 1;
		}
		else if (Board.screen == 2){
			max = 11;
			min = 0;
		}
		Random ranFood = new Random();
		
		int xPos = min + ranFood.nextInt(max);
		int yPos = min + ranFood.nextInt(max);
		
		controller.setColor(xPos, yPos, 127, 0, 0);
	}
}
