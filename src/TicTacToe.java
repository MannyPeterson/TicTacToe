/*
 * 
 *  Tic-Tac-Toe
 *  Copyright (C) 2017 Manny Peterson <me@mannypeterson.com>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 */
import java.util.ArrayList;

public class TicTacToe {

	public static void main(String[] args) {
		GameBoard board = new GameBoard();
		ArrayList<GamePlayer> players = new ArrayList<GamePlayer>();

		HumanPlayer p1 = new HumanPlayer('X');
		MannyPlayer p2 = new MannyPlayer('O');

		players.add(p1);
		players.add(p2);

		while (true) {
			for (GamePlayer player : players) {
				System.out.println(board.boardToString(players));
				player.move(board);
				if (board.checkForWinner(players) > 0) {
					System.out.println(board.boardToString(players));
					System.out.println(player.getSymbol() + " WINS!!");
					board.reset();
				} else if (board.checkForDraw() > 0) {
					System.out.println(board.boardToString(players));
					System.out.println("DRAW!!");
					board.reset();
				}
			}
		}
	}
}
