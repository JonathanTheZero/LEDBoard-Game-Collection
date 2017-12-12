package Snake;

import ledControl.BoardController;
import ledControl.LedConfiguration;
import ledControl.gui.KeyBuffer;

import Snake.ScreenOne;

import java.awt.event.KeyEvent;


public class Board {
	
	static BoardController controller = BoardController.getBoardController();
	public static KeyBuffer		buffer;
	public static boolean startScreen = true;
	public static int screen = 0;
	
	public static void main(String[] args) {
		buffer = controller.getKeyBuffer();
		startScreen();
	}
	
	
	
	public static void startScreen(){
		//controller.addNetworkHost(ip:"132.252.250.93");
		writeMode();
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
							screen = 1;
							break;
						case java.awt.event.KeyEvent.VK_2:
							controller.resetColors();
							controller.updateLedStripe();
							controller.sleep(500);
							screenTwo();
							controller.updateLedStripe();
							startScreen = false;
							screen = 2;
							break;
						default:
					}
				}
			}
		}
	}
	
	
	
	
	//different Screens
	public static void screenOne(){
		ScreenOne screenOne = new ScreenOne();
	}
	
	public static void screenTwo(){
		ScreenTwo screenTwo = new ScreenTwo();
	}
	
	
	
	public static void writeMode(){
		//Write the word mode
		writeM();
		writeO();
		writeD();
		writeE();
	}
	
	public static void writeM() {
		
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
	}
	
	public static void writeO() {
		
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
	}
	
	public static void writeD() {
		
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
	}
	
	public static void writeE() {
		
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
