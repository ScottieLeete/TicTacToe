package com.scottco.ttt;

import java.io.Console;

public class Game {

	Board board;
	Player p1, p2;
	
	Player currentPlayer;
	
	
	public void play() {
		System.out.println("We're playing!");
		
		while (!gameOver()) {
			pickPlayer();
			nextTurn();
			board.print();
		}
	}
	
	private boolean gameOver() {
		if (board.full() || board.wins(p1) || board.wins(p2))
			return true;
		else
			return false;
	}

	private void pickPlayer() {
		if (currentPlayer == null || currentPlayer == p2) {
			currentPlayer = p1;
		} else {
			currentPlayer = p2;
		}
	}

	private void nextTurn() {
		currentPlayer.move(board);
	}

	public static void main(String[] args) {
		Console con = System.console();
		String playername = Helper.readln("This shall be a tic-tac-toe between me and:");
//		String playername = "Scott";
		System.out.println("Hi, " + playername);
		
		Game game = new Game();
		game.p1 = new HumanPlayer(playername, "X");
		game.p2 = new CPUPlayer("O");
		game.board = new Board(3);
		
		game.play();
	}
}
