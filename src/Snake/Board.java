package Snake;

import ledControl.BoardController;
import Snake.Snake;

public class Board {
	
	static BoardController controller = BoardController.getBoardController();

	public static void main(String[] args) {
			
		int i = 0;
		while (i <= 11) {
			controller.setColor(1, i, 127, 0, 0);
			i++;
		}
		//controller.updateLedStripe();
		//controller.sleep(1000);
		i = 2;
		while (i <= 10) {
			controller.setColor(i, 0, 127, 0, 0);
			i++;
		}
		//controller.updateLedStripe();
		//controller.sleep(1000);
		i = 0;
		while (i <= 11) {
			controller.setColor(11, i, 127, 0, 0);
			i++;
		}
		//controller.updateLedStripe();
		//controller.sleep(1000);
		i = 2;
		while (i <= 10) {
			controller.setColor(i, 11, 127, 0, 0);
			i++;
		}
		controller.updateLedStripe();
		controller.sleep(2000);
		Snake snake = new Snake();
		controller.updateLedStripe();
	}

}
