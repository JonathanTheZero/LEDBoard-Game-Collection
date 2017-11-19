package Snake;

import ledControl.BoardController;
import ledControl.gui.KeyBuffer;
import Snake.SnakeScreenTwo;

import java.awt.event.KeyEvent;
import java.util.Random;


public class ScreenTwo {

	static BoardController controller = BoardController.getBoardController();
	
	public ScreenTwo(){
		SnakeScreenTwo snake = new SnakeScreenTwo();
	}
}
