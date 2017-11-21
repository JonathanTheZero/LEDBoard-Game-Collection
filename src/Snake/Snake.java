package Snake;

import java.awt.event.KeyEvent;
import java.util.Random;

import ledControl.BoardController;
import ledControl.gui.KeyBuffer;

import Snake.ScreenOne;

public class Snake {
	private static BoardController	controller;
	private static KeyBuffer		buffer;
	private static int xPos, yPos;
	int snakeLength = 1;
	private char direction;
	
	
	public Snake(){
		direction = 'R';
		xPos = 5;
		yPos = 5;
	}
	
	
	//for the different screens	
	public void draw() {
		controller = BoardController.getBoardController();
		buffer = controller.getKeyBuffer();
		
		controller.setColor(xPos, yPos, 10, 100, 15);
	}
	public void move() {
		switch(direction) {
		case 'L':
			xPos--;
			if (xPos < 0) {
				xPos = 11;
			}
			break;
		case 'R':
			xPos++;
			if(xPos > 11) {
				xPos = 0;
			}
			break;
		case 'U':
			yPos--;
			if (yPos < 0) {
				yPos = 11;
			}
			break;
		case 'D':
			yPos++;
			if(yPos > 11) {
				yPos = 0;
			}
			break;
		}
	}
	
	public void setDirection(char direction) {
		this.direction = direction;
		System.out.println(direction);
	}
	//create new apples
	public void createNewAppleOne() {
	}
	

}
