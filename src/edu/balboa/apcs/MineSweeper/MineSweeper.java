package edu.balboa.apcs.MineSweeper;

/**
 * This class is the driver for the APCS MineSweeper app.
 * @author team X
 */
public class MineSweeper {

	public static void main(String[] args) {
		System.out.println("Welcome to APCS MineSweeper.");
		System.out.println("");
		System.out.println("This is an 8 * 8 board");
		System.out.println("");
		// uncomment if your team decides to use the provided 
		// console-like UI class instead of running MineSweeper 
		// at the command line (in a terminal shell):
		//
		//MineSweeperConsole.main(null);
		
		MineField MineSweeper1 = new MineField(16);
		
		//MineSweeper1.printField();
		
	}

}
