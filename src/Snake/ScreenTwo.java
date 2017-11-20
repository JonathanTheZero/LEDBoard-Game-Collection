package Snake;

import ledControl.BoardController;
import ledControl.gui.KeyBuffer;
import Snake.Snake;

import java.awt.event.KeyEvent;
import java.util.Random;


public class ScreenTwo {

	static BoardController controller = BoardController.getBoardController();
	
	public ScreenTwo(){
		Snake snake = new Snake();
		snake.screenTwo();
	}
}
