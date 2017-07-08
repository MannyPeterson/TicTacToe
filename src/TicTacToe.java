import java.util.ArrayList;

public class TicTacToe {

	public static void main(String[] args) {
		GameBoard board = new GameBoard();
		ArrayList<GamePlayer> players = new ArrayList<GamePlayer>();

		HumanPlayer p1 = new HumanPlayer('X');
		HumanPlayer p2 = new HumanPlayer('O');

		players.add(p1);
		players.add(p2);

		while (true) {
			for (GamePlayer player : players) {
				System.out.println(board.boardToString(players));
				player.move(board);
				if (board.checkForWinner(players) > 0) {
					System.out.println(board.boardToString(players));
					System.out.println(player.getSymbol() + " WINS!!");
					System.exit(0);
				}
			}
		}
	}
}
