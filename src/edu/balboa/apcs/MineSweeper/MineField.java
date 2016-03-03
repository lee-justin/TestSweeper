package edu.balboa.apcs.MineSweeper;

import java.util.ArrayList;

public class MineField {

	private final double PERCENT_OF_MINES = 0.16;
	private String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private int[] Numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
	private SampleSquare[][] field;
	// private SampleSquare[][] test;

	// Specify the size of board
	public MineField(int k) {
		field = new SampleSquare[k][k];
		initializeBoard(k);
		printField(k);
		locationPicker("flag",'E', 4);
		printField(k);
	}

	public void initializeBoard(int k) {
		// Loop through rows
		for (int i = 0; i < k; i++) {
			// Loop through columns
			//
			for (int j = 0; j < k; j++) {
				field[i][j] = new SampleSquare();
			}
		}
	}

	// public void refresh() {
	// SampleSquare[][]f = field;
	//
	// System.out.print(field);
	// }

	public void printField(int k) {

		// print letters
		System.out.print(" ");
		for (int g = 0; g < k; g++) {

			System.out.print("   " + Alphabet.charAt(g));

		}

		System.out.println("");

		System.out.print("  ");
		for (int h = 0; h < k; h++) {
			System.out.print("+---");
		}
		System.out.print("+");
		System.out.println("");

		for (int i = 0; i < k; i++) {
			System.out.printf("%2s", i + 1);
			System.out.print("| ");

			for (int j = 0; j < k; j++) {

				System.out.print(field[i][j] + " | ");

			}

			System.out.println();

			System.out.print("  ");
			for (int f = 0; f < k; f++) {
				System.out.print("+---");
			}
			System.out.println("+");

		}

	}

	// to lower case before feeding CHAR in locationPicker
	public SampleSquare[][] locationPicker(String h, char i, int j) {
		// public int[][] locationPicker(String h, char i, int j) {

		int place = Alphabet.indexOf(i);
		int col = Numbers[place];
		int row = j;
		System.out.print("\n\n\n");
		System.out.println("Row is:" + row + "     Column is:" + col);

		// SampleSquare[][] replace = new SampleSquare[0][0];
		// testSquare testing = new testSquare();
		if ("flag" == h) {

			// replace specified square with testSquare()

			// field[0][0] = new testSquare();
			// field[row][col] = new testSquare();
			// field[1][2].getSquare();
			System.out.println("You have flagged\n\n");
			// Convert character into a number(col)

			// System.out.print("*************");

			// System.out.print(Numbers[place]);
			// System.out.print("*************");
			//
			// location[row][col] = 4;
			//
			// return location;
			// }
			// return location;
			//
			// }
			field[0][0].setFlipped(true);
			// **************field[0][0] = field[0][0];********

			System.out.println("testing    \""+ field[0][0] + "\"   **********\n");
			//printField(8);
			System.out.println();

		}
		return field;
	}

}
