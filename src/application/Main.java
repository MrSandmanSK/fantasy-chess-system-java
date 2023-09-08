package application;

import game.FantasyMatch;

public class Main {

	public static void main(String[] args) {
		
		FantasyMatch fantasyMatch = new FantasyMatch();
		UI.printBoard(fantasyMatch.getPieces());

	}

}
