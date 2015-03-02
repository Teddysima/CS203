package com.teddy.tictactoe;

public class TicTacToe {
	private Board board;
	private Player[] players;
	private char[] symbols = { 'o', 'x' };
	
	private int currentPlayer;
	
	public TicTacToe(int rows, int cols, String[] names){
		this.board = new Board(rows, cols);
		this.players = new Player[names.length];
		
		for(int i = 0; i < names.length; i++){
			this.players[i] = new Player(names[i]);
		}
		
		currentPlayer = 0;
	}
	
	public void play(){
		Position pos;
		
		// game engine
		while(true){
			
			while(true) {
				pos = this.players[ currentPlayer ].choosePosition();
				
				if ( !board.isWithInBounds(pos) ){
					System.out.println("Slot out of bounds. Please enter valid position.");
				} else if ( !board.slotIsEmpty(pos) ){
					System.out.println("Slot is already filled. Please enter a vacant slot.");
				} else {
					break;
				}
			}
			
			board.markSlot(pos, symbols[currentPlayer] );
			
			board.print();
			
			if ( board.checkWin(pos) ){
				System.out.println ("Viva " + this.players[ currentPlayer ].getName() );
				break;
			} else if ( ! board.hasEmptySlot() ){
				System.out.println ("This game sucks! It is a draw!");
				break;
			}
			
			// other planyer's turn
			currentPlayer = 1 - currentPlayer;
		}
	}
}
