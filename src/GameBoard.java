import java.util.ArrayList;
import java.util.Arrays;

public class GameBoard {
	private int board[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	public void reset() {
		int i;
		for(i = 0;i < 9; i++) {
			this.board[i] = 0;
		}
		return; 
	}
	
	public int occupySpace(GamePlayer player, int space) {
		if (player == null) {
			return -1;
		}
		if (space < 0 | space > 8) {
			return -1;
		}
		if (this.board[space] != 0) {
			return -1;
		}
		this.board[space] = player.getID();
		return space;
	}

	public String boardToString(ArrayList<GamePlayer> players) {
		int i;
		char charBoard[] = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		if (players == null) {
			return null;
		}
		for (GamePlayer player : players) {
			for (i = 0; i < 9; i++) {
				if (this.board[i] == player.getID()) {
					charBoard[i] = player.getSymbol();
				}
			}
		}
		return String.format("\n\t%c\t%c\t%c\n\t%c\t%c\t%c\n\t%c\t%c\t%c\n", charBoard[0], charBoard[1], charBoard[2],
				charBoard[3], charBoard[4], charBoard[5], charBoard[6], charBoard[7], charBoard[8]);
	}

	public int checkForDraw() {
		int i;
		for(i = 0;i < 9; i++) {
			if(this.board[i] == 0) {
				return -1;
			}
		}
		return 1;
	}
	
	public int checkForWinner(ArrayList<GamePlayer> players) {
		if (players == null) {
			return -1;
		}
		for (GamePlayer player : players) {
			if (this.board[0] == player.getID() & this.board[1] == player.getID() & this.board[2] == player.getID()) {
				return player.getID();
			} else if (this.board[3] == player.getID() & this.board[4] == player.getID()
					& this.board[5] == player.getID()) {
				return player.getID();
			} else if (this.board[6] == player.getID() & this.board[7] == player.getID()
					& this.board[8] == player.getID()) {
				return player.getID();
			} else if (this.board[0] == player.getID() & this.board[3] == player.getID()
					& this.board[6] == player.getID()) {
				return player.getID();
			} else if (this.board[1] == player.getID() & this.board[4] == player.getID()
					& this.board[7] == player.getID()) {
				return player.getID();
			} else if (this.board[2] == player.getID() & this.board[5] == player.getID()
					& this.board[8] == player.getID()) {
				return player.getID();
			} else if (this.board[0] == player.getID() & this.board[4] == player.getID()
					& this.board[8] == player.getID()) {
				return player.getID();
			} else if (this.board[2] == player.getID() & this.board[4] == player.getID()
					& this.board[6] == player.getID()) {
				return player.getID();
			}
		}
		return -1;
	}

	public int[] getBoard() {
		return Arrays.copyOf(board, board.length);
	}
}
