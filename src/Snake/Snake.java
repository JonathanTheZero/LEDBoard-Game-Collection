package Snake;

import java.awt.event.KeyEvent;
import ledControl.BoardController;
import ledControl.gui.KeyBuffer;


public class Snake {
	private static BoardController	controller;
	private static KeyBuffer		buffer;
	private static int xPos, yPos;
	int snakeLength = 1;
	
	public Snake(){
		controller = BoardController.getBoardController();
		buffer = controller.getKeyBuffer();
		xPos = 5;
		yPos = 5;
		while (true){
			KeyEvent event = buffer.pop();
			if (event != null){
				if (event.getID() == java.awt.event.KeyEvent.KEY_PRESSED){
					switch (event.getKeyCode()){
					case java.awt.event.KeyEvent.VK_UP:
						if (yPos > 0){
							yPos--;
						}
						else if (yPos <= 0){
							yPos = 5;
							xPos = 5;
						}
						break;
					case java.awt.event.KeyEvent.VK_DOWN:
						if (yPos < 11){
							yPos++;
						}
						else if (yPos >= 11){
							yPos = 5;
							xPos = 5;
						}
						break;
					case java.awt.event.KeyEvent.VK_LEFT:
						if (xPos > 0){
							xPos--;
						}
						else if (xPos <= 0){
							yPos = 5;
							xPos = 5;
						}
						break;
					case java.awt.event.KeyEvent.VK_RIGHT:
						if (xPos < 11){
							xPos++;
						}
						else if (xPos >= 11){
							yPos = 5;
							xPos = 5;
						}
						break;
					default:
					}
				}
			}
			resetSnake();
			controller.setColor(xPos, yPos, 0, 127, 0);
			controller.updateLedStripe();
		}
	}
	public void resetSnake() {
		controller.resetColors();
		snakeLength = 1;
		/*int i = 0;
		while (i <= 11) {
			controller.setColor(1, i, 127, 0, 0);
			i++;
		}
		//controller.updateLedStripe();
		//controller.sleep(1000);
		i = 2;
		while (i <= 10) {
			controller.setColor(i, 0, 127, 0, 0);
			i++;
		}
		//controller.updateLedStripe();
		//controller.sleep(1000);
		i = 0;
		while (i <= 11) {
			controller.setColor(11, i, 127, 0, 0);
			i++;
		}
		//controller.updateLedStripe();
		//controller.sleep(1000);
		i = 2;
		while (i <= 10) {
			controller.setColor(i, 11, 127, 0, 0);
			i++;
		}*/
	}

}
