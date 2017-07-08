import java.util.ArrayList;
import java.util.Arrays;

public class TicTacToe {

	public static void main(String[] args) {
		GameBoard board = new GameBoard();
		ArrayList<GamePlayer> players = new ArrayList<GamePlayer>();

		GamePlayer p1 = new GamePlayer('X');
		GamePlayer p2 = new GamePlayer('O');
		GamePlayer p3 = new GamePlayer('W');

		players.add(p1);
		players.add(p2);
		players.add(p3);

		board.occupySpace(p3, 6);
		board.occupySpace(p1, 2);
		board.occupySpace(p2, 3);
		board.occupySpace(p2, 2);
		board.occupySpace(p2, 4);
		board.occupySpace(p2, 5);
		board.occupySpace(p1, 8);

		System.out.println(board.boardToString(players));
		System.out.println(board.checkForWinner(players));
		System.out.println(Arrays.toString(board.getBoard()));
	}

}
