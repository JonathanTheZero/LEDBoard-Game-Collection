package Snake;

import java.util.ArrayList;
import java.util.List;

import ledControl.BoardController;
import ledControl.gui.KeyBuffer;

import Snake.Snake;

public class SnakeSegment {
	
	
	static BoardController controller = BoardController.getBoardController();
	public int count;
	private int x;
	private int y;
	
	public SnakeSegment(int x, int y){
		controller.setColor(x, y, 10, 100, 15);
	}
}

