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
	
	public Snake(){

	}
	
	
	//for the different screens
	public void screenOne(){
		controller = BoardController.getBoardController();
		buffer = controller.getKeyBuffer();
		xPos = 5;
		yPos = 5;
		while (true){
			KeyEvent event = buffer.pop();
			if (event != null){
				if (event.getID() == java.awt.event.KeyEvent.KEY_PRESSED){
					switch (event.getKeyCode()){
					case java.awt.event.KeyEvent.VK_UP:
						if (yPos > 1){
							yPos--;
						}
						else if (yPos <= 1){
							yPos = 5;
							xPos = 5;
						}
						break;
					case java.awt.event.KeyEvent.VK_DOWN:
						if (yPos < 10){
							yPos++;
						}
						else if (yPos >= 10){
							yPos = 5;
							xPos = 5;
						}
						break;
					case java.awt.event.KeyEvent.VK_LEFT:
						if (xPos > 1){
							xPos--;
						}
						else if (xPos <= 1){
							yPos = 5;
							xPos = 5;
						}
						break;
					case java.awt.event.KeyEvent.VK_RIGHT:
						if (xPos < 10){
							xPos++;
						}
						else if (xPos >= 10){
							yPos = 5;
							xPos = 5;
						}
						break;
					default:
					}
				}
			}
			this.resetSnakeOne();
			controller.setColor(xPos, yPos, 0, 127, 0);
			controller.updateLedStripe();
		}
	}
	
	public void screenTwo(){
		controller = BoardController.getBoardController();
		buffer = controller.getKeyBuffer();
		xPos = 5;
		yPos = 5;
		while (true){
			KeyEvent event = buffer.pop();
			if (event != null){
				if (event.getID() == java.awt.event.KeyEvent.KEY_PRESSED){
					switch (event.getKeyCode()){
					case java.awt.event.KeyEvent.VK_UP:
						if (yPos > 0){
							yPos--;
						}
						else if (yPos <= 0){
							yPos = 11;
						}
						break;
					case java.awt.event.KeyEvent.VK_DOWN:
						if (yPos < 11){
							yPos++;
						}
						else if (yPos >= 11){
							yPos = 0;
						}
						break;
					case java.awt.event.KeyEvent.VK_LEFT:
						if (xPos > 0){
							xPos--;
						}
						else if (xPos <= 0){
							xPos = 11;
						}
						break;
					case java.awt.event.KeyEvent.VK_RIGHT:
						if (xPos < 11){
							xPos++;
						}
						else if (xPos >= 11){
							xPos = 0;
						}
						break;
					default:
					}
				}
			}
			this.resetSnakeTwo();
			controller.setColor(xPos, yPos, 0, 127, 0);
			controller.updateLedStripe();
		}
	}

	
	//resets
	public void resetSnakeOne() {
		controller.resetColors();
		snakeLength = 1;
		int i = 0;
		while (i <= 11) {
			controller.setColor(0, i, 127, 0, 0);
			i++;
		}
		i = 0;
		while (i <= 10) {
			controller.setColor(i, 0, 127, 0, 0);
			i++;
		}
		i = 0;
		while (i <= 11) {
			controller.setColor(11, i, 127, 0, 0);
			i++;
		}
		i = 0;
		while (i <= 10) {
			controller.setColor(i, 11, 127, 0, 0);
			i++;
		}
		ScreenOne.foodOne(); //solve problem of infinity food spawning
	}
	
	public void resetSnakeTwo() {
		controller.resetColors();
		snakeLength = 1;
	}

}
