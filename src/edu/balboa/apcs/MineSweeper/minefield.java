package edu.balboa.apcs.MineSweeper;

public class minefield {

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

		return p;
	}

	public static void main(String[] args) {
		minefield mf = new minefield();
		System.out.println(mf);
	}

}
