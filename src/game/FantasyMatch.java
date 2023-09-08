package game;

import board.Board;

public class FantasyMatch {
	
	private Board board;
	
	public FantasyMatch() {
		board = new Board(9, 9);
	}
	
	public FantasyPiece[][] getPieces() {
		FantasyPiece[][] mat = new FantasyPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (FantasyPiece) board.piece(i, j);
			}
		}
		
		return mat;
	}

}
