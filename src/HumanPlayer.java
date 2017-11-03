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
import java.util.Scanner;

public class HumanPlayer extends GamePlayer {

	public HumanPlayer(char symbol) {
		super(symbol);
	}

	@SuppressWarnings("resource")
	@Override
	public void move(GameBoard board) {
		System.out.print(this.getSymbol() + " >");
		board.occupySpace(this, Integer.parseInt(new Scanner(System.in).nextLine()) - 1);
		return;
	}
}
