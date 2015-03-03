package com.teddy.tictactoe;

import java.util.Scanner;

public class TicTacToeLauncher {

	public static void main(String[] args) {
		
		TicTacToe game;
		String[] names = new String[2];
		Scanner scanner = new Scanner(System.in);
		final int rows = 3;
		final int cols = 3;
		
		System.out.print("Enter player #1 name: ");
		names[0] = scanner.next();

		System.out.print("Enter player #2 name: ");
		names[1] = scanner.next();
		
		game = new TicTacToe(rows, cols, names);
		
		game.play();
	}

}
