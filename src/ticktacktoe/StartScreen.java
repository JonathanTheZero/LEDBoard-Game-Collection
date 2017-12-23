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
		controller.sleep(1870);
		controller.resetColors();
		drawField();
		controller.updateLedStripe();
	}
	
	public void drawField(){
		controller.setColor(3, 1, 100, 100, 100);
		controller.setColor(3, 2, 100, 100, 100);
		controller.setColor(3, 3, 100, 100, 100);
		controller.setColor(3, 4, 100, 100, 100);
		controller.setColor(3, 5, 100, 100, 100);
		controller.setColor(3, 6, 100, 100, 100);
		controller.setColor(3, 7, 100, 100, 100);
		controller.setColor(3, 8, 100, 100, 100);
		
		
		
	}
	
	
	
	//draw Letters and Messages
	public void drawStart(){
		drawS(0, 0);
		drawT(4, 0);
		drawA(0, 6);
		drawR(4, 6);
		drawT(7, 6);
	}
	
	public void drawS(int x, int y){
		controller.setColor(x, y, 105, 10, 15);
		controller.setColor(x + 1, y, 105, 10, 15);
		controller.setColor(x + 2, y, 105, 10, 15);
		controller.setColor(x, y + 1, 105, 10, 15);
		controller.setColor(x, y + 2, 105, 10, 15);
		controller.setColor(x + 1, y + 2, 105, 10, 15);
		controller.setColor(x + 2, y + 2, 105, 10, 15);
		controller.setColor(x + 2, y + 3, 105, 10, 15);
		controller.setColor(x + 2, y + 4, 105, 10, 15);
		controller.setColor(x + 1, y + 4, 105, 10, 15);
		controller.setColor(x, y + 4, 105, 10, 15);
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
