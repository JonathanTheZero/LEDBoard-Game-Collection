package Snake;

import java.util.ArrayList;
import java.util.List;

import ledControl.BoardController;
import ledControl.gui.KeyBuffer;

import Snake.Snake;

public class SnakeSegments {
	
	
	static BoardController controller = BoardController.getBoardController();
	public int xPos;
	public int yPos;
	
	public SnakeSegments(){
	    List<int[]> positionen = new ArrayList<int[]>(); 
		positionen.add(new int[] {xPos, yPos});
		createBreakpoint(Snake.xPos, Snake.yPos);
	}
	
	public void createBreakpoint(int xPos, int yPos) {
		System.out.println(xPos + "..." + yPos);
	}
}
