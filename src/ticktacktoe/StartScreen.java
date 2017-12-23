package ticktacktoe;

import ledControl.BoardController;
import ledControl.LedConfiguration;
import ledControl.gui.KeyBuffer;

import java.awt.event.KeyEvent;


public class StartScreen {
	
	static BoardController controller = BoardController.getBoardController();
	public static KeyBuffer buffer;
	
	public StartScreen(){
		drawStart();
		controller.updateLedStripe();
	}
	
	public void drawStart(){
		drawS();
		drawT(4, 0);
		drawA(0, 6);
		drawR(4, 6);
		drawT(7, 6);
		controller.updateLedStripe();
	}
	
	public void drawS(){
		controller.setColor(0, 0, 105, 10, 15);
		controller.setColor(1, 0, 105, 10, 15);
		controller.setColor(2, 0, 105, 10, 15);
		controller.setColor(0, 1, 105, 10, 15);
		controller.setColor(0, 2, 105, 10, 15);
		controller.setColor(1, 2, 105, 10, 15);
		controller.setColor(2, 2, 105, 10, 15);
		controller.setColor(2, 3, 105, 10, 15);
		controller.setColor(2, 4, 105, 10, 15);
		controller.setColor(1, 4, 105, 10, 15);
		controller.setColor(0, 4, 105, 10, 15);
		controller.updateLedStripe();
	}
	
	public void drawT(int x, int y){
		controller.setColor(x, y, 105, 10, 15);
		controller.setColor(x + 1, y, 105, 10, 15);
		controller.setColor(x + 2, y, 105, 10, 15);
		controller.setColor(x + 3, y, 105, 10, 15);
		controller.setColor(x + 4, y, 105, 10, 15);
		controller.setColor(x + 2, y + 1, 105, 10, 15);
		controller.setColor(x + 2, y + 2, 105, 10, 15);
		controller.setColor(x + 2, y + 3, 105, 10, 15);
		controller.setColor(x + 2, y + 4, 105, 10, 15);
	}
	
	public void drawA(int x, int y){
		controller.setColor(x, y + 1, 105, 10, 15);
		controller.setColor(x + 1, y, 105, 10, 15);
		controller.setColor(x + 2, y + 1, 105, 10, 15);
		controller.setColor(x, y + 2, 105, 10, 15);
		controller.setColor(x + 1, y + 2, 105, 10, 15);
		controller.setColor(x + 2, y + 2, 105, 10, 15);
		controller.setColor(x, y + 3, 105, 10, 15);
		controller.setColor(x, y + 4, 105, 10, 15);
		controller.setColor(x + 2, y + 3, 105, 10, 15);
		controller.setColor(x + 2, y + 4, 105, 10, 15);
	}
	
	public void drawR(int x, int y){
		controller.setColor(x, y, 105, 10, 15);
		controller.setColor(x, y + 1, 105, 10, 15);
		controller.setColor(x + 1, y, 105, 10, 15);
		controller.setColor(x + 2, y + 1, 105, 10, 15);
		controller.setColor(x, y + 2, 105, 10, 15);
		controller.setColor(x + 1, y + 2, 105, 10, 15);
		controller.setColor(x + 2, y + 2, 105, 10, 15);
		controller.setColor(x, y + 3, 105, 10, 15);
		controller.setColor(x, y + 4, 105, 10, 15);
		controller.setColor(x + 2, y + 3, 105, 10, 15);
		controller.setColor(x + 2, y + 4, 105, 10, 15);
	}
}
