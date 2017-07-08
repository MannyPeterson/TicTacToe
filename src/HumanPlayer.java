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
