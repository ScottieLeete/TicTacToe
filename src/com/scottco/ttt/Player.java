package com.scottco.ttt;

public abstract class Player {

	String name;
	String symbol;
	
	
	public abstract void move(Board board);
	
	public void pickSquare(int squareno, Board board) {
		int x = squareno % 3;
		int y = squareno / 3;
		
		board.set(symbol, x, y);
	}

	public String getSymbol() {
		return symbol;
	}
}
