import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	Game game;

	@BeforeEach
	public void setup() {
		System.out.println("Debut test\n");
		this.game = new Game();
	}

	public void rollNombre(int nbrRoll, int ValeurRoll) {
		for (int i = 0; i < nbrRoll; i++)
			game.roll(ValeurRoll);
	}

	public void rollTableau(int[] val) {
		for (int i = 0; i < val.length; i++) {
			game.roll(val[i]);
		}
	}

	@Test
	void entréeVide() {
		assertEquals(game.score(), 0);
	}

	@Test
	void vingtRollZero() {
		rollNombre(20, 0);
		assertEquals(game.score(), 0);
	}

	@Test
	void vingtRollUn() {
		rollNombre(20, 1);
		assertEquals(game.score(), 20);
	}

	@Test
	void dixRollUnDixRollDeux() {
		rollNombre(10, 1);
		rollNombre(10, 2);

		assertEquals(game.score(), 30);
	}

	@Test
	void testSpare() {
		game.roll(7);
		game.roll(3);
		game.roll(4);
		rollNombre(17, 0);
		assertEquals(game.score(), 18);
	}

	@Test
	void testStrike() {
		game.roll(10);
		game.roll(3);
		game.roll(4);
		rollNombre(16, 0);

		assertEquals(game.score(), 24);
	}

	@Test
	void casGenerale() {
		int[] val = { 1, 2, 10, 0, 10, 4, 2, 0, 10, 6, 2, 0, 10, 6, 4, 8, 2, 2, 7 };
		rollTableau(val);

		assertEquals(game.score(), 122);
	}

	@Test
	void extension() {
		int[] val = { 1, 2, 10, 0, 10, 4, 2, 0, 10, 6, 2, 0, 10, 6, 4, 8, 2, 2, 8, 8 };
		rollTableau(val);

		assertEquals(game.score(), 131);
	}

}
