import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	Game game;
	
	@BeforeEach
	public void init() {
		this.game = new Game();
	}
	
	public void rollNombre(int nbrRoll, int ValeurRoll) {
		for(int i=0; i<nbrRoll;i++)game.roll(ValeurRoll);
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
	void dixRollUnDixRollDeux(){
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
	
	

}
