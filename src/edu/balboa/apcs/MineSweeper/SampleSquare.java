package edu.balboa.apcs.MineSweeper;

/**
 * This class is provided to help students understand the 
 * tester setup for this application and should not be used
 * as part of the final MineSweeper application.
 * 
 * @author mferraro
 */
public class SampleSquare {
	
	private boolean minePresent;
	private boolean isFlipped=false;

	public SampleSquare() {
		minePresent = false; //default square has no mine
		//System.out.print("o");
		
	}
	
	
	public boolean hasMine() {
		return minePresent;
	}
	
	public void plantMine() {
		minePresent = true; //INTENTIONALLY BROKEN!
	}
	
	public boolean getFlipped() {
		return isFlipped;
	}
	
	public void setFlipped(boolean a) {
		isFlipped= a;
	}
	
	public String toString() {
		
		if (isFlipped == false) 
			return "0";
		
		else {
			
			return "x";
			
		}
		
	}
	
//	public String toString(int j) {
//		
//			return "X";
//
//	}	

}
