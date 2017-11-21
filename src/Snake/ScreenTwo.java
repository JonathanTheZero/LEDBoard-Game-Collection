package Snake;

import ledControl.BoardController;
import ledControl.gui.KeyBuffer;
import Snake.Snake;

import java.awt.event.KeyEvent;
import java.util.Random;


public class ScreenTwo {

	static BoardController controller = BoardController.getBoardController();
	private static KeyBuffer buffer;
	private Snake snake;
	
	public ScreenTwo(){
		buffer = controller.getKeyBuffer();
		snake = new Snake();
		
		
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
		
		controller.updateLedStripe();
	
	}
	
	public void drawBorders() {
		int i = 0;
		while (i <= 11) {
			controller.setColor(0, i, 127, 0, 0);
			i++;
		}
		i = 0;
		while (i <= 10) {
			controller.setColor(i, 0, 127, 0, 0);
			i++;
		}
		i = 0;
		while (i <= 11) {
			controller.setColor(11, i, 127, 0, 0);
			i++;
		}
		i = 0;
		while (i <= 10) {
			controller.setColor(i, 11, 127, 0, 0);
			i++;
		}
	}
}
