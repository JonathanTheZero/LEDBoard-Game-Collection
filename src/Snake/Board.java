package Snake;

import ledControl.BoardController;
import ledControl.gui.KeyBuffer;

import Snake.ScreenOne;

import java.awt.event.KeyEvent;


public class Board {
	
	static BoardController controller = BoardController.getBoardController();
	public static KeyBuffer		buffer;
	public static boolean startScreen = true;
	
	public static void main(String[] args) {
		buffer = controller.getKeyBuffer();

			
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
		}
		controller.updateLedStripe();*/
		
		/*controller.resetColors();
		controller.sleep(1000);
		Snake snake = new Snake();
		Food food = new Food();
		controller.updateLedStripe();*/
		startScreen();
	}
	public static void startScreen(){
		mode();
		controller.updateLedStripe();
		while (startScreen = true){
			KeyEvent event = buffer.pop();
			if (event != null){
				if (event.getID() == java.awt.event.KeyEvent.KEY_PRESSED){
					switch (event.getKeyCode()){
						case java.awt.event.KeyEvent.VK_1:
							controller.resetColors();
							controller.updateLedStripe();
							controller.sleep(500);
							screenOne();
							controller.updateLedStripe();
							startScreen = false;
							break;
						default:
					}
				}
			}
		}
	}
	public static void screenOne(){
		ScreenOne screenOne = new ScreenOne();
	}
	
	public static void mode(){
		//Write the word mode
		
		//M
		controller.setColor(0, 5, 0, 127, 0);
		controller.setColor(0, 4, 0, 127, 0);
		controller.setColor(0, 3, 0, 127, 0);
		controller.setColor(0, 2, 0, 127, 0);
		controller.setColor(0, 1, 0, 127, 0);
		controller.setColor(1, 1, 0, 127, 0);
		controller.setColor(2, 1, 0, 127, 0);
		controller.setColor(2, 2, 0, 127, 0);
		controller.setColor(2, 3, 0, 127, 0);
		controller.setColor(2, 4, 0, 127, 0);
		controller.setColor(2, 5, 0, 127, 0);
		controller.setColor(3, 1, 0, 127, 0);
		controller.setColor(4, 1, 0, 127, 0);
		controller.setColor(4, 2, 0, 127, 0);
		controller.setColor(4, 3, 0, 127, 0);
		controller.setColor(4, 4, 0, 127, 0);
		controller.setColor(4, 5, 0, 127, 0);
		
		//O
		controller.setColor(7, 1, 0, 127, 0);
		controller.setColor(8, 1, 0, 127, 0);
		controller.setColor(6, 1, 0, 127, 0);
		controller.setColor(6, 2, 0, 127, 0);
		controller.setColor(6, 3, 0, 127, 0);
		controller.setColor(6, 4, 0, 127, 0);
		controller.setColor(6, 5, 0, 127, 0);
		controller.setColor(7, 5, 0, 127, 0);
		controller.setColor(9, 1, 0, 127, 0);
		controller.setColor(9, 2, 0, 127, 0);
		controller.setColor(9, 3, 0, 127, 0);
		controller.setColor(9, 4, 0, 127, 0);
		controller.setColor(9, 5, 0, 127, 0);
		controller.setColor(8, 5, 0, 127, 0);
		
		//D
		controller.setColor(1, 7, 0, 127, 0);
		controller.setColor(2, 7, 0, 127, 0);
		controller.setColor(0, 7, 0, 127, 0);
		controller.setColor(0, 8, 0, 127, 0);
		controller.setColor(0, 9, 0, 127, 0);
		controller.setColor(0, 10, 0, 127, 0);
		controller.setColor(0, 11, 0, 127, 0);
		controller.setColor(1, 11, 0, 127, 0);
		controller.setColor(3, 8, 0, 127, 0);
		controller.setColor(3, 9, 0, 127, 0);
		controller.setColor(3, 10, 0, 127, 0);
		controller.setColor(2, 11, 0, 127, 0);
		
		//E
		controller.setColor(6, 7, 0, 127, 0);
		controller.setColor(7, 7, 0, 127, 0);
		controller.setColor(8, 7, 0, 127, 0);
		controller.setColor(6, 8, 0, 127, 0);
		controller.setColor(6, 9, 0, 127, 0);
		controller.setColor(7, 9, 0, 127, 0);
		controller.setColor(8, 9, 0, 127, 0);
		controller.setColor(6, 10, 0, 127, 0);
		controller.setColor(6, 11, 0, 127, 0);
		controller.setColor(7, 11, 0, 127, 0);
		controller.setColor(8, 11, 0, 127, 0);
	}

}
