package edu.balboa.apcs.MineSweeper;

<<<<<<< HEAD:src/edu/balboa/apcs/MineSweeper/minefield.java
import java.util.ArrayList;

public class MineField {
=======
public class minefieldTest {

	private int size = 8;

	public String toString() {
		String p = "";
		for (int columns = 0; columns <= size* 2; columns++) {
			if (columns % 2 == 0) {
				for (int rows = 0; rows <= size - 1; rows++) {
					p += "+---";
				}
				p += "+";
			} else {
				for (int rows = 0; rows <= size - 1; rows++) {
					p += "|   ";
					// add this later
					// p += "| ";
				}
				p += "|";
			}
			p+= "\n";
		}
>>>>>>> fae8562ea62782cff1f9bc5178754e225db148ca:src/edu/balboa/apcs/MineSweeper/minefieldTest.java

	private char[][] field;
	
	//Alphabets on top
	String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	//Specify the size of board
	public MineField(int k) {
		field = new char[k][k];
		initializeBoard(k);
		printField(k);
	}


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
