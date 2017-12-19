package Snake;

import java.awt.event.KeyEvent;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

import ledControl.BoardController;
import ledControl.gui.KeyBuffer;

import Snake.Screen;
import Snake.SnakeSegments;

public class Snake {
	private static BoardController	controller;
	private static KeyBuffer		buffer;
	public static int xPos = 5;
	public static int yPos = 5;
	public int count = 1;
	int snakeLength = 0;
	private char direction;
	
	public Snake(){
		controller = BoardController.getBoardController();
		buffer = controller.getKeyBuffer();
		direction = 'R';
		xPos = 5;
		yPos = 5;
	}
	
	
	//for the different screens	
	public void draw() {		
		controller.setColor(xPos, yPos, 10, 100, 15);
		//drawSnakeSegments(snakeLength);
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
		eatAppleOne();
	}

	public void setDirection(char direction) {
		this.direction = direction;
		System.out.println(direction);
	}
	
	//create new apples
	public void createNewApple() {
		Screen.createApple();
	}
	
	
	public void eatAppleOne(){
		if(xPos == Screen.xPos && yPos == Screen.yPos){
			snakeLength++;
			//SnakeSegments seg1 = new SnakeSegments(Snake.xPos -1, Snake.yPos);
			//seg1.xPos = Snake.xPos - 1;
			//seg1.yPos = Snake.yPos;
			controller.resetColors();
			createNewApple();
		}
		else {
			
		}
	}
	
	public void createTail(){
		/*if(direction == 'R') {
			controller.setColor(xPos - 1, yPos, 10, 100, 15);
		}
		else if(direction == 'L') {
			controller.setColor(xPos + 1, yPos, 10, 100, 15);
		}
		else if(direction == 'U') {
			controller.setColor(xPos, yPos - 1, 10, 100, 15);
		}
		else if(direction == 'D') {
			controller.setColor(xPos, yPos + 1, 10, 100, 15);
		}*/
	}
	
	public void drawSnakeSegments(int segmentCount){

	}
	
	public void segmentLocation(){
	    /*System.out.println(positionen.get(0));
	    positionen.add(0, new int[] {2,3});
	    positionen.get(0)[0] = 42;
	    positionen.remove(0);*/
	}
	
	public void end() {
		if(xPos == 12) {
			
		}
	}

}
