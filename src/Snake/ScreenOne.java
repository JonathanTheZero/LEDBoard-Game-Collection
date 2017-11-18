package Snake;

import ledControl.BoardController;
import ledControl.gui.KeyBuffer;
import Snake.SnakeScreenOne;
import Snake.Food;

import java.awt.event.KeyEvent;
import java.util.Random;

public class ScreenOne {
	
	static BoardController controller = BoardController.getBoardController();
	
	public ScreenOne(){
		//Screen border
		int i = 0;
		while (i <= 11) {
			controller.setColor(0, i, 127, 0, 0);
			i++;
		}
		controller.updateLedStripe();
		controller.sleep(500);
		i = 0;
		while (i <= 10) {
			controller.setColor(i, 0, 127, 0, 0);
			i++;
		}
		controller.updateLedStripe();
		controller.sleep(500);
		i = 0;
		while (i <= 11) {
			controller.setColor(11, i, 127, 0, 0);
			i++;
		}
		controller.updateLedStripe();
		controller.sleep(500);
		i = 0;
		while (i <= 10) {
			controller.setColor(i, 11, 127, 0, 0);
			i++;
		}
		
		
		//Food food = new Food();
		SnakeScreenOne snake = new SnakeScreenOne();
		
		Random generator = new Random(); 
		
		int xPos = generator.nextInt(11) + 1;
		int yPos = generator.nextInt(11) + 1;
		
		controller.setColor(xPos, yPos, 0, 0, 127);
	}
}
