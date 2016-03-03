package edu.balboa.apcs.MineSweeper;

import java.util.Scanner;

public class ControlPanel {
	
	int firstInt;

	public ControlPanel() {
		Scanner sc = new Scanner(System.in);
		
		firstInt = new Integer(sc.nextLine());
	
	}
	 
	public void difficulty(int i) {
		if (i == 1) {
			System.out.println("You chose level easy");
			MineSweeper.setDifficulty(8);
		}
		
		else if (i == 2) {
			System.out.println("You chose level medium");
			difficulty= 12;
		}	
		else if (i == 3) {
			System.out.println("You chose level hard");
			difficulty= 15;
		}else if(i > 3) {
			System.out.println("Invalid choice.Please try again");
			
		}else if(i < 1) {
			System.out.println("Invalid choice.Please try again");
		}
	}
	
}