
public class Game {
	int score;
	int scorePrecedent;
	Boolean lastIsSpare;
	int thereWasAStrike;
	
	public Game() {
		this.score =0;
		this.scorePrecedent = 0;
		this.lastIsSpare = false;
		this.thereWasAStrike = 0;
	}

	public void roll(int nombre) {
		if(Boolean.TRUE.equals(lastIsSpare)) {
			lastIsSpare =false;
			this.score+=nombre;
		}
		if(thereWasAStrike !=0) {
			thereWasAStrike --;
			this.score+=nombre;
		}
		
		if(nombre == 10) {
			thereWasAStrike = 2;
		}else if((nombre + this.scorePrecedent) == 10) {
			lastIsSpare = true;
		}
		
		this.score+=nombre;
		this.scorePrecedent = nombre;
	}
	
	
	
	public int score() {
		return this.score;
	}
}
