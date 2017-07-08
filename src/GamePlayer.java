
public class GamePlayer {
	private static int playerCount = 1;
	private int id;
	private char symbol;
	public GamePlayer(char symbol) {
		this.id = playerCount;;
		this.symbol = symbol;
		playerCount++;
	}
	public int getID() {
		return this.id;
	}
	public char getSymbol() {
		return this.symbol;
	}
}
