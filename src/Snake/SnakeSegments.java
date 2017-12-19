package Snake;

import java.util.ArrayList;
import java.util.List;

import ledControl.BoardController;
import ledControl.gui.KeyBuffer;

import Snake.Snake;

public class SnakeSegments {
	
	
	static BoardController controller = BoardController.getBoardController();
	public int count;
	private int x;
	private int y;
	
	public SnakeSegments(int x, int y){
		
		List<int[]> positionen = new ArrayList<int[]>(); 
		positionen.add(count, new int[] {xPos, yPos});
		
		positionen.add(count, new int[] {x, y});
		
		controller.setColor(positionen.get(count)[0], positionen.get(count)[1], 10, 100, 15);
	}
}

