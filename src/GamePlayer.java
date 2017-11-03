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
public class GamePlayer {
	private static int playerCount = 1;
	private int id;
	private char symbol;

	public GamePlayer(char symbol) {
		this.id = playerCount;
		this.symbol = symbol;
		playerCount++;
	}

	public int getID() {
		return this.id;
	}

	public char getSymbol() {
		return this.symbol;
	}
	
	public void move(GameBoard board) {
		return;
	}
}
