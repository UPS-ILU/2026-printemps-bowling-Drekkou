
public class Game {
	int score;
	int scorePrecedent;
	Boolean lastIsSpare;
	
	public Game() {
		this.score =0;
		this.scorePrecedent = 0;
		this.lastIsSpare = false;
	}

	public void roll(int nombre) {
		if(Boolean.TRUE.equals(lastIsSpare)) {
			lastIsSpare =false;
			this.score+=nombre;
		}
		
		if((nombre + this.scorePrecedent) == 10) {
			lastIsSpare = true;
		}
		
		this.score+=nombre;
		this.scorePrecedent = nombre;
	}
	
	public int score() {
		return this.score;
	}
}
