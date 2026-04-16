
public class Game {
	int score;
	int scorePrecedent;
	Boolean lastIsSpare;
	int thereWasAStrike;
	int nombreLancerUtilise;
	
	public Game() {
		this.score =0;
		this.scorePrecedent = 0;
		this.lastIsSpare = false;
		this.thereWasAStrike = 0;
		this.nombreLancerUtilise = 0;
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
		
		if(nombre == 10 && nombreLancerUtilise%2 == 0) {
//			System.out.println("STRIKE!!!");
			thereWasAStrike += 2;
			nombreLancerUtilise ++;
		}else if((nombre + this.scorePrecedent) == 10 && nombreLancerUtilise%2 == 1) {
//			System.out.println("SPARE!!!");
			lastIsSpare = true;
		}
		
		this.score+=nombre;
		this.scorePrecedent = nombre;
		nombreLancerUtilise++;

//		System.out.println(this.score);
	}
	
	
	
	public int score() {
		return this.score;
	}
}
