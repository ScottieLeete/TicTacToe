package com.scottco.ttt;

public class CPUPlayer extends Player {

	public CPUPlayer(String sym) {
		this.name = "Computer";
		this.symbol = sym;
	}
	
	@Override
	public void move(Board board) {
		int squareno = (int) Math.random() * 9;
		
		System.out.println("I pick square " + (squareno + 1) + "!");
		
		pickSquare(squareno, board); 
	}
}
