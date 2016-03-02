package edu.balboa.apcs.MineSweeper;

/**
 * This class is the driver for the APCS MineSweeper app.
 * 
 * @author team X
 */
public class MineSweeper {
	
	private static int difficulty=1;

	public static void main(String[] args) {
		System.out.println("Welcome to APCS MineSweeper.");
		System.out.println("");
		System.out.println("Choose your difficulty press '1' for easy");
		System.out.println("Choose your difficulty press '2' for medium");
		System.out.println("Choose your difficulty press '3' for difficult");
		System.out.println("");
		ControlPanel ControlPanel1 = new ControlPanel();
		
		if (ControlPanel1.firstInt == 1) {
			System.out.println("You chose level easy");
			difficulty= 8;
		}
		
		else if (ControlPanel1.firstInt == 2) {
			System.out.println("You chose level medium");
			difficulty= 12;
		}	
		else if (ControlPanel1.firstInt == 3) {
			System.out.println("You chose level hard");
			difficulty= 15;
		}
				
		// uncomment if your team decides to use the provided
		// console-like UI class instead of running MineSweeper
		// at the command line (in a terminal shell):
		//
		// MineSweeperConsole.main(null);

		// Up to 15
		// **********Somebody add scanner to take in number for this part
		// ********
		MineField MineSweeper1 = new MineField(difficulty);

		// MineSweeper1.printField();

	}

}
