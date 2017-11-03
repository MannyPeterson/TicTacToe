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

public class MannyPlayer extends GamePlayer {

	public MannyPlayer(char symbol) {
		super(symbol);
	}

	@Override
	public void move(GameBoard board) {
		int[] boardArray = board.getBoard();
		ArrayList<Integer> moves;

		moves = new ArrayList<Integer>();

		moves.addAll(this.getOffensiveMoves(boardArray));
		moves.addAll(this.getDefensiveMoves(boardArray));
		moves.addAll(this.getBestGuessMoves(boardArray));
		for (Integer move : moves) {
			if (board.occupySpace(this, move.intValue()) != -1) {
				System.out.println(this.getSymbol() + " >" + (move.intValue() + 1));
				return;
			}
		}
		System.out.println("I am out of moves.");
		return;
	}

	public ArrayList<Integer> getDefensiveMoves(int[] boardArray) {
		ArrayList<Integer> moves;
		ArrayList<Integer> opponentIDs;
		moves = new ArrayList<Integer>();
		opponentIDs = this.getOpponentIDs(boardArray);
		for (Integer opponentID : opponentIDs) {
			moves.addAll(this.findWinningMove(this.getOpponentBoard(boardArray, opponentID)));
		}
		return moves;
	}

	public ArrayList<Integer> getOffensiveMoves(int[] boardArray) {
		ArrayList<Integer> moves;
		moves = new ArrayList<Integer>();
		moves.addAll(this.findWinningMove(this.getMyBoard(boardArray)));
		return moves;
	}

	public ArrayList<Integer> getBestGuessMoves(int[] boardArray) {
		ArrayList<Integer> moves;
		moves = new ArrayList<Integer>();
		moves.add(4);
		moves.add(0);
		moves.add(6);
		moves.add(2);
		moves.add(8);
		moves.add(1);
		moves.add(3);
		moves.add(5);
		moves.add(7);
		return moves;
	}

	public ArrayList<Integer> getOpponentIDs(int[] boardArray) {
		int i;
		ArrayList<Integer> opponentIDs = new ArrayList<Integer>();

		for (i = 0; i < 9; i++) {
			if (boardArray[i] > 0 & boardArray[i] != this.getID()) {
				if (!opponentIDs.contains(new Integer(boardArray[i]))) {
					opponentIDs.add(new Integer(boardArray[i]));
				}
			}
		}
		return opponentIDs;
	}

	public int[] getMyBoard(int[] boardArray) {
		int i;
		int[] opponentBoard = new int[9];

		for (i = 0; i < 9; i++) {
			if (boardArray[i] == this.getID()) {
				opponentBoard[i] = 1;
			}
		}
		return opponentBoard;
	}

	public int[] getOpponentBoard(int[] boardArray, int opponentID) {
		int i;
		int[] opponentBoard = new int[9];

		for (i = 0; i < 9; i++) {
			if (boardArray[i] == opponentID) {
				opponentBoard[i] = 1;
			}
		}
		return opponentBoard;
	}
	
	public ArrayList<Integer> findWinningMove(int[] boardArray) {
		ArrayList<Integer> winningMoves = new ArrayList<Integer>();
		if (boardArray[0] + boardArray[1] + boardArray[2] == 2) {
			if (boardArray[0] == 0) {
				winningMoves.add(0);
			} else if (boardArray[1] == 0) {
				winningMoves.add(1);
			} else if (boardArray[2] == 0) {
				winningMoves.add(2);
			}
		}
		if (boardArray[3] + boardArray[4] + boardArray[5] == 2) {
			if (boardArray[3] == 0) {
				winningMoves.add(3);
			} else if (boardArray[4] == 0) {
				winningMoves.add(4);
			} else if (boardArray[5] == 0) {
				winningMoves.add(5);
			}
		}
		if (boardArray[6] + boardArray[7] + boardArray[8] == 2) {
			if (boardArray[6] == 0) {
				winningMoves.add(6);
			} else if (boardArray[7] == 0) {
				winningMoves.add(7);
			} else if (boardArray[8] == 0) {
				winningMoves.add(8);
			}
		}
		if (boardArray[0] + boardArray[3] + boardArray[6] == 2) {
			if (boardArray[0] == 0) {
				winningMoves.add(0);
			} else if (boardArray[3] == 0) {
				winningMoves.add(3);
			} else if (boardArray[6] == 0) {
				winningMoves.add(6);
			}
		}
		if (boardArray[1] + boardArray[4] + boardArray[7] == 2) {
			if (boardArray[1] == 0) {
				winningMoves.add(1);
			} else if (boardArray[4] == 0) {
				winningMoves.add(4);
			} else if (boardArray[7] == 0) {
				winningMoves.add(7);
			}
		}
		if (boardArray[2] + boardArray[5] + boardArray[8] == 2) {
			if (boardArray[2] == 0) {
				winningMoves.add(2);
			} else if (boardArray[5] == 0) {
				winningMoves.add(5);
			} else if (boardArray[8] == 0) {
				winningMoves.add(8);
			}
		}
		if (boardArray[0] + boardArray[4] + boardArray[8] == 2) {
			if (boardArray[0] == 0) {
				winningMoves.add(0);
			} else if (boardArray[4] == 0) {
				winningMoves.add(4);
			} else if (boardArray[8] == 0) {
				winningMoves.add(8);
			}
		}
		if (boardArray[2] + boardArray[4] + boardArray[6] == 2) {
			if (boardArray[2] == 0) {
				winningMoves.add(2);
			} else if (boardArray[4] == 0) {
				winningMoves.add(4);
			} else if (boardArray[6] == 0) {
				winningMoves.add(6);
			}
		}
		return winningMoves;
	}
}
