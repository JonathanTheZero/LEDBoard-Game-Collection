package ledProjects;

import ledControl.BoardController;

public class MyFirstBoard {
	
	static BoardController controller = BoardController.getBoardController();

	public static void main(String[] args) {
		controller.setColor(5, 5, 127, 127, 127);
		controller.updateLedStripe();
	}

}
