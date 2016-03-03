package edu.balboa.apcs.MineSweeper;

/**
 * This class is the driver for the APCS MineSweeper app.
 * 
 * @author team X
 */

public class MineSweeper {

	public MineSweeper() {

		ControlPanel ControlPanel1 = new ControlPanel();

		ControlPanel1.setDifficulty();

		MineField MineField1 = new MineField(ControlPanel1.getDifficulty());

	}

	public static void main(String[] args) {

		MineSweeper game1 = new MineSweeper();

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
