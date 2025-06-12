package com.kodewalaDependence;

public class Game {
	private String favrateGame;
	private String normalGame;
	private String iLikeGame;
	private String thisGame;

	public Game(String favrateGame, String normalGame, String iLikeGame, String thisGame) {
		super();
		this.favrateGame = favrateGame;
		this.normalGame = normalGame;
		this.iLikeGame = iLikeGame;
		this.thisGame = thisGame;
	}

	public String getFavrateGame() {
		return favrateGame;
	}

	public String getNormalGame() {
		return normalGame;
	}

	public String getiLikeGame() {
		return iLikeGame;
	}

	public String getThisGame() {
		return thisGame;
	}

	public String toString() {
		return "FAVRATE GAME " + favrateGame + ", normalGame : " + normalGame + ", iLikeGame : " + iLikeGame
				+ ", thisGame : " + thisGame;
	}
}
