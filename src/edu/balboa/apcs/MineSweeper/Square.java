package edu.balboa.apcs.MineSweeper;

public class Square {
	
	private boolean minePresent;
	private boolean flagPresent;
	
	
	public Square() {
		minePresent = false;
		System.out.print("+");
	}
	
	public boolean hasMine() {
		return minePresent;
	}
	
	public boolean plantMind() {
		minePresent = true;
		return minePresent;
	}
	
	public boolean hasFlag() {
		flagPresent = true;
		return flagPresent;
	}
	
	public boolean unFlag() {
		flagPresent = false;
		return flagPresent;
	}
	
	
}

	

