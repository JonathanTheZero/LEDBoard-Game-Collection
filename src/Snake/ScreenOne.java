package Snake;

import ledControl.BoardController;
import ledControl.gui.KeyBuffer;

import java.awt.event.KeyEvent;
import java.util.Random;

public class ScreenOne {
	
	static BoardController controller = BoardController.getBoardController();
	private static KeyBuffer buffer;
	static int xPosA;
	static int yPosA;
	private Snake snake;
	
	public ScreenOne(){
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
		
		drawScreen();
		controller.updateLedStripe();
	}
	
	public void createApple(){
		int min = 1;
		int max = 10;
		Random ranFood = new Random();
		
		xPosA = min + ranFood.nextInt(max);
		yPosA = min + ranFood.nextInt(max);
	}
	public void drawApple() {
		controller.setColor(xPosA, yPosA, 0, 0, 127);
	}
	public void drawScreen() {
		createApple();
		while(true) {
			controller.resetColors();
			checkInput();
			snake.move();
			drawApple();
			snake.draw();
			controller.sleep(150);
			controller.updateLedStripe();
			
		}
	}
	
	public void checkInput() {
			KeyEvent event = buffer.pop();
			if (event != null){
				if (event.getID() == java.awt.event.KeyEvent.KEY_PRESSED){
					switch(event.getKeyCode()) {
					case KeyEvent.VK_UP:
						snake.setDirection('U');
						//System.out.println("ABCDEFGHIJKLMNOP");
						break;
					case KeyEvent.VK_DOWN:
						snake.setDirection('D');
						break;
					case KeyEvent.VK_LEFT:
						snake.setDirection('L');
						break;
					case KeyEvent.VK_RIGHT:
						snake.setDirection('R');
						break;
					}
					
				}
				//System.out.println(event.getKeyCode());
			}
			buffer.clear();
	}
}
