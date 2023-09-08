package game;

import board.Board;
import board.Piece;

public class FantasyPiece extends Piece {
	
	private Color color;

	public FantasyPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	

}
