
public class Athlete {
	FinalResult result;
	String name;

	public Athlete(FinalResult result, String name) {
		this.result = result;
		this.name = name;
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
