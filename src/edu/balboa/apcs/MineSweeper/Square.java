package edu.balboa.apcs.MineSweeper;

public class Square {
	
	private boolean isMined;
	private boolean isFlagged;
	private boolean isRevealed;
	private int mines; 
	
	public Square() {
		isMined = false;
		isFlagged = false;
		isRevealed = false;
		System.out.print("+");
	}
	
	public boolean hasMine() {
		return isMined;
	}
	
	public boolean plantMine() {
		isMined = true;
		return isMined;
	}
	
	
}

	

