package com.scottco.ttt;

public class Board {

	Square[][] squares;
	int n;
	
	public Board(int n) {
		this.n = n;
		
		squares = new Square [n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				squares[i][j] = new Square();
			}
		}
	}

	public void set(String symbol, int x, int y) {
		squares [y][x].setSymbol(symbol);
	}
	
	public void print() {
		for (int i = 0; i < n; i++) {
			if (i > 0) {
				System.out.println("-----------");
			}
			
			for (int j = 0; j < n; j++) {
				if (j > 0) {
					System.out.print("|");
				}
				System.out.print(" " + squares[i][j].getSymbol() + " ");
			}
			
			System.out.println();
		}
		
		System.out.println();
	}

	public boolean allowedMove(int squareno) {
		if (squareno < 0 || squareno > (n * n - 1)) {
			return false;
		}
		
		int x = squareno % 3;
		int y = squareno / 3;
		
		return squares[y][x].getSymbol().equals(" ");
	}

	public boolean full() {
		for (int i = 0; i < n * n; i++) {
			if (allowedMove(n)) {
				return false;
			}
		}
		
		return true;
	}

	public boolean wins(Player player) {
		String sym = player.getSymbol();
		
		if (threeAcross(sym) || threeDown(sym) || threeDiagonal(sym)) {
			return true;
		} else {
			return false;
		}
	}

	private boolean threeAcross(String sym) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean threeDown(String sym) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean threeDiagonal(String sym) {
		// TODO Auto-generated method stub
		return false;
	}
}
