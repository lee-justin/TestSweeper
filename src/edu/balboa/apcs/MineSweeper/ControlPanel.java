package edu.balboa.apcs.MineSweeper;

import java.util.Scanner;

public class ControlPanel {

	private static int difficulty = 0;
	int firstInt;

	public void diff() {

		while (difficulty == 0) {
			Scanner sc = new Scanner(System.in);
			firstInt = new Integer(sc.nextLine());

			if (firstInt == 1) {
				System.out.println("You chose level easy");
				difficulty = 8;
				
			}

			else if (firstInt == 2) {
				System.out.println("You chose level medium");
				difficulty = 12;
			} else if (firstInt == 3) {
				System.out.println("You chose level hard");
				difficulty = 15;

			} else {
				System.out.println("Invalid Choice, try again");

			}
		}

	}
	
	public int getDiff() {
		return difficulty;
	}

}