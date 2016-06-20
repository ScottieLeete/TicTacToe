package com.scottco.ttt;

public class HumanPlayer extends Player {

	public HumanPlayer(String playername, String sym) {
		this.name = playername;
		this.symbol = sym;
	}

	@Override
	public void move(Board board) {
		int squareno = -1;
		
		do {
			String square = Helper.readln("What square, 1 to 9?");
			squareno = Integer.parseInt(square) - 1;
		} while (!board.allowedMove(squareno));
		
		pickSquare(squareno, board);
	}
}
