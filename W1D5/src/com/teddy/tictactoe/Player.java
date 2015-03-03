package com.teddy.tictactoe;

import java.util.Scanner;

public class Player {
	private String name;

	public Player(String name) {
		super();
		this.name = name;
	}
	
	public Position choosePosition(){
		Scanner scanner = new Scanner(System.in);
		int r, c;
		
		System.out.print("Player " + name + " enter position: ");
		r = scanner.nextInt() - 1;
		c = scanner.nextInt() - 1;
		
		Position pos = new Position(r, c);
		
		return pos;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
