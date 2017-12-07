package Snake;

import ledControl.BoardController;
import ledControl.gui.KeyBuffer;

public class SnakeSegments {
	
	
	static BoardController controller = BoardController.getBoardController();
	public int xPos;
	public int yPos;
	
	public SnakeSegments(){
		controller.setColor(xPos, yPos, 10, 100, 15);
	}
}
