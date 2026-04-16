import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	Game game;
	
	@BeforeEach
	public void init() {
		this.game = new Game();
	}
	
	@Test
	void entréeVide() {
		assertEquals(game.score(), 0);
	}
	
	@Test
	void vingtRollZero() {
		for(int i=0; i<20;i++)game.roll(0);
		
		assertEquals(game.score(), 0);
	}
	
	@Test
	void vingtRollUn() {
		for(int i=0; i<20;i++)game.roll(1);
		
		assertEquals(game.score(), 20);
	}
	
	@Test
	void dixRollUnDixRollDeux(){
		for(int i=0; i<10;i++)game.roll(1);
		for(int i=0; i<10;i++)game.roll(2);
		
		assertEquals(game.score(), 30);
	}

}
