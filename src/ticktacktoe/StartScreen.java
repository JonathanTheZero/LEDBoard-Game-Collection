package ticktacktoe;

import ledControl.BoardController;
import ledControl.LedConfiguration;
import ledControl.gui.KeyBuffer;

import java.awt.event.KeyEvent;


public class StartScreen {
	
	static BoardController controller = BoardController.getBoardController();
	private static KeyBuffer buffer = controller.getKeyBuffer();
	int[] field = new int[9];
	
	public StartScreen(){
		drawStart();
		controller.updateLedStripe();
		controller.sleep(1870);
		controller.resetColors();
		drawField();
		resetFields();
		controller.updateLedStripe();
		controller.sleep(200);
		while(true){
			setColors();
		}
		
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
		
		controller.setColor(6, 1, 100, 100, 100);
		controller.setColor(6, 2, 100, 100, 100);
		controller.setColor(6, 3, 100, 100, 100);
		controller.setColor(6, 4, 100, 100, 100);
		controller.setColor(6, 5, 100, 100, 100);
		controller.setColor(6, 6, 100, 100, 100);
		controller.setColor(6, 7, 100, 100, 100);
		controller.setColor(6, 8, 100, 100, 100);
		
		controller.setColor(1, 3, 100, 100, 100);
		controller.setColor(2, 3, 100, 100, 100);
		controller.setColor(4, 3, 100, 100, 100);
		controller.setColor(5, 3, 100, 100, 100);
		controller.setColor(7, 3, 100, 100, 100);
		controller.setColor(8, 3, 100, 100, 100);
		
		controller.setColor(1, 6, 100, 100, 100);
		controller.setColor(2, 6, 100, 100, 100);
		controller.setColor(4, 6, 100, 100, 100);
		controller.setColor(5, 6, 100, 100, 100);
		controller.setColor(7, 6, 100, 100, 100);
		controller.setColor(8, 6, 100, 100, 100);	
	}
	
	
	public void resetFields(){
		field[0] = 0;
		field[1] = 0;
		field[2] = 0;
		field[3] = 0;
		field[4] = 0;
		field[5] = 0;
		field[6] = 0;
		field[7] = 0;
		field[8] = 0;
	}
	
	public void setColors(){
		KeyEvent event = buffer.pop();
		if (event != null){
			if (event.getID() == java.awt.event.KeyEvent.KEY_PRESSED){
				switch(event.getKeyCode()) {
				case KeyEvent.VK_1:
					field1();
					break;
				case KeyEvent.VK_2:
					break;
				case KeyEvent.VK_3:
					break;
				case KeyEvent.VK_4:
					break;
				}
				
			}
		}
		buffer.clear();
	}
	
	public void field1(){
		/*if(field[0] != 0){
			if(field[0] == 1){
				controller.setColor(1, 1, 120, 12, 13);
				controller.setColor(1, 2, 120, 12, 13);
				controller.setColor(2, 1, 120, 12, 13);
				controller.setColor(2, 2, 120, 12, 13);
			}
			else if(field[0] == 2){
				controller.setColor(1, 1, 13, 12, 120);
				controller.setColor(1, 2, 13, 12, 120);
				controller.setColor(2, 1, 13, 12, 120);
				controller.setColor(2, 2, 13, 12, 120);
			}
		}
		else{*/
			controller.setColor(1, 1, 120, 12, 13);
			controller.setColor(1, 2, 120, 12, 13);
			controller.setColor(2, 1, 120, 12, 13);
			controller.setColor(2, 2, 120, 12, 13);
		//}
		controller.updateLedStripe();
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
