
public class Athlete {
	FinalResult result;

	public Athlete(FinalResult result) {
		this.result = result;
	}
	
	public boolean betterSkiier(Athlete other) {
		return (this.result.skiingResult.pointsEarned() < other.result.skiingResult.pointsEarned());
	}
	
	public boolean betterShooter(Athlete other) {
		return (this.result.shootingResult.pointsEarned() > other.result.shootingResult.pointsEarned());
	}
	
	public boolean hasBeaten(Athlete other) {
		return (this.betterSkiier(other) || this.betterShooter(other));
	}
	
	
}
