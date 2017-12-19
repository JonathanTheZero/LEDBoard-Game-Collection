package Snake;

import ledControl.BoardController;
import ledControl.gui.KeyBuffer;

import java.awt.event.KeyEvent;
import java.util.Random;

import Snake.Board;

public class Screen {
	
	static BoardController controller = BoardController.getBoardController();
	private static KeyBuffer buffer;
	static int xPos;
	static int yPos;
	private Snake snake;
	
	public Screen(){
		buffer = controller.getKeyBuffer();
		snake = new Snake();
		
		drawStartAnimation();
		
		drawScreen();
		controller.updateLedStripe();
	}
	
	public void drawStartAnimation() {
		//Screen start animation
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
		
	}
	
	public static void createApple(){
		int min = 1;
		int max = 10;
		Random ranFood = new Random();
		
		xPos = min + ranFood.nextInt(max);
		yPos = min + ranFood.nextInt(max);
	}
	public void drawApple() {
		controller.setColor(xPos, yPos, 0, 0, 127);
	}
	public void drawScreen() {
		createApple();
		while(true) {
			controller.resetColors();
			checkInput();
			snake.move();
			drawApple();
			snake.draw();
			controller.sleep(170);
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
	
	
	
	public static void end(){
		controller.resetColors();
		writeEnd();
	}
	
	public static void writeEnd(){
		writeE();
	}
	
	public static void writeE(){
		controller.setColor(0, 1, 0, 127, 0);
		controller.setColor(1, 1, 0, 127, 0);
		controller.setColor(2, 1, 0, 127, 0);
		controller.setColor(0, 2, 0, 127, 0);
		controller.setColor(0, 3, 0, 127, 0);
		controller.setColor(1, 3, 0, 127, 0);
		controller.setColor(2, 3, 0, 127, 0);
		controller.setColor(0, 4, 0, 127, 0);
		controller.setColor(0, 5, 0, 127, 0);
		controller.setColor(1, 5, 0, 127, 0);
		controller.setColor(2, 5, 0, 127, 0);
	}
}
