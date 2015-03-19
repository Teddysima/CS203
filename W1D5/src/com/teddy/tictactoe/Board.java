package com.teddy.tictactoe;

public class Board {
	private int rows;
	private int cols;
	private char[][] board;
	private final char emptySymbol = '_';

	public Board(int rows, int cols) {
		super();
		this.rows = rows;
		this.cols = cols;
		this.init();
	}

	private void init() {
		board = new char[rows][cols];
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				board[r][c] = emptySymbol;
			}
		}
	}

	public boolean slotIsEmpty(Position pos) {
		if (board[pos.getRow()][pos.getCol()] == emptySymbol)
			return true;
		else
			return false;
	}

	public void markSlot(Position pos, char symbol) {
		board[pos.getRow()][pos.getCol()] = symbol;
	}

	public void print() {
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				System.out.print(board[r][c] + " ");
			}
			System.out.println();
		}
	}

	public boolean checkWin(Position pos) {
		// check if row is winning row
		int c = 0;
		for (c = 1; c < this.cols; c++) {
			if (board[pos.getRow()][c] != board[pos.getRow()][0]) {
				break;
			}
		}
		if (c == this.cols) {
			return true;
		}

		// check if col is winning column
		int r = 0;
		for (r = 1; r < this.cols; r++) {
			if (board[r][pos.getCol()] != board[0][pos.getCol()]) {
				break;
			}
		}
		if (r == this.rows) {
			return true;
		}

		// FIXME:
		// check if first left diag is winning diagonal
		int i = 0;
		for (i = 0; i < rows; i++) {
			if (board[0][0] != board[i][i] || board[i][i] == emptySymbol) {
				break;
			}
		}
		if (i == this.rows) {
			return true;
		}

		// check if second diag is winning diagonal
		c = cols - 1;
		for (i = 0; i < rows; i++) {
			if (board[i][c - i] != board[0][c] || board[i][c - i] == emptySymbol) {
				break;
			}
		}
		if (i == rows) {
			return true;
			
		}

		return false;
	}

	public boolean hasEmptySlot() {
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				if (board[r][c] == emptySymbol)
					return true;
			}
		}

		return false;
	}

	public boolean isWithInBounds(Position pos) {
		if (pos.getRow() >= 0 && pos.getRow() < this.rows && pos.getCol() >= 0
				&& pos.getCol() < this.cols)
			return true;

		return false;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}
}
