package edu.balboa.apcs.MineSweeper;

import java.util.ArrayList;

public class MineField {

	private char[][] field;
	
	//Alphabets on top
	String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	// Fix numbers
	String Numbers = "1234567891011121214151617181920";

	// Designate the size of board
	public MineField(int k) {
		field = new char[k][k];
		initializeBoard(k);
		printField(k);
	}

	// public MineField() {
	// field = new char[3][3];
	// initializeBoard();
	// }

	public void initializeBoard(int k) {
		// Loop through rows
		for (int i = 0; i < k; i++) {
			// Loop through columns

			for (int j = 0; j < k; j++) {
				field[i][j] = '-';
			}
		}
	}

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
}
