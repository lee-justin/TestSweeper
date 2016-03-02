package edu.balboa.apcs.MineSweeper;

import java.util.ArrayList;

public class MineField {

	private char[][] field;

	// Alphabets on top
	String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	// Specify the size of the board
	public MineField(int k) {
		field = new char[k][k];
		initializeField(k);
		printField(k);
	}

	public void initializeField(int k) {
		// Loop through rows
		for (int i = 0; i < k; i++) {

			// Loop through columns ****Fix this, add object **** (char) null =
			// object ?
			for (int j = 0; j < k; j++) {
				field[i][j] = '-';
			}
		}
	}

	public void printField(int k) {

		// Print the letters on top border of the field
		System.out.print(" ");
		for (int g = 0; g < k; g++) {
			System.out.print("   " + Alphabet.charAt(g));
		}

		System.out.println("");

		// Print top border of field
		System.out.print("  ");
		for (int h = 0; h < k; h++) {
			System.out.print("+---");
		}
		System.out.print("+");
		System.out.println("");

		// Print numbers on Y axis
		for (int i = 0; i < k; i++) {
			System.out.printf("%2s", i + 1);
			System.out.print("| ");

			// Print Columns
			for (int j = 0; j < k; j++) {
				System.out.print(field[i][j] + " | ");
			}

			System.out.println();

			// Print Rows
			System.out.print("  ");
			for (int f = 0; f < k; f++) {
				System.out.print("+---");
			}
			System.out.println("+");

		}

	}
}