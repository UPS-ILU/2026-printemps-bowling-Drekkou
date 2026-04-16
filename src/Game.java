
public class Game {
	int score;
	
	
	
	public Game() {
		this.score =0;
	}

	public void roll(int nombre) {
		this.score+=nombre;
	}
	
	public int score() {
		return this.score;
	}
}
