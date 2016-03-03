package edu.balboa.apcs.MineSweeper;

/**
 * This class is the driver for the APCS MineSweeper app.
 * 
 * @author team X
 */

public class MineSweeper {
	

	public static void main(String[] args) {
		System.out.println("Welcome to APCS MineSweeper.");
		System.out.println("");
		System.out.println("Choose your difficulty press '1' for easy");
		System.out.println("Choose your difficulty press '2' for medium");
		System.out.println("Choose your difficulty press '3' for difficult");
		System.out.println("");
		
		ControlPanel ControlPanel1 = new ControlPanel();
		
		ControlPanel1.diff();
		
		MineField MineField1 = new MineField(ControlPanel1.getDiff());

		
		
		

				
		// uncomment if your team decides to use the provided
		// console-like UI class instead of running MineSweeper
		// at the command line (in a terminal shell):
		//
		// MineSweeperConsole.main(null);

		// Up to 15
		// **********Somebody add scanner to take in number for this part
		// ********

		// MineSweeper1.printField();

	}

}