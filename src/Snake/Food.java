package Snake;

import java.util.Random;

import ledControl.BoardController;

public class Food {
	
	static BoardController controller = BoardController.getBoardController();

	
	public Food(){
		Random generator = new Random(); 
		
		int xPos = generator.nextInt(11) + 1;
		int yPos = generator.nextInt(11) + 1;
		
		controller.setColor(xPos, yPos, 127, 0, 0);
	}
}
