package edu.balboa.apcs.MineSweeper;

import java.util.Scanner;

public class ControlPanel {

	private static int difficulty = 0;
	private int difficultyInput;
	private final int EASY = 8;
	private final int MEDIUM = 12;
	private final int HARD = 15;

	// Mutator for difficulty
	public void setDifficulty() {

		System.out.println("Welcome to APCS MineSweeper.\n");
		System.out.println("Choose your difficulty press '1' for easy");
		System.out.println("Choose your difficulty press '2' for medium");
		System.out.println("Choose your difficulty press '3' for difficult\n");

		while (difficulty == 0) {
			Scanner scanner1 = new Scanner(System.in);
			difficultyInput = new Integer(scanner1.nextLine());

			if (difficultyInput == 1) {
				System.out.println("Level: Easy\n");
				difficulty = EASY;

			} else if (difficultyInput == 2) {
				System.out.println("Level: Medium\n");
				difficulty = MEDIUM;
			} else if (difficultyInput == 3) {
				System.out.println("Level: Hard\n");
				difficulty = HARD;

			} else {
				System.out.println("Invalid Choice, try again");

			}
		}

	}

	// Accessor for difficulty
	public int getDifficulty() {
		return difficulty;
	}

}