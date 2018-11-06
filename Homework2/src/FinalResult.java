
public class FinalResult {
	ShootingResult shootingResult;
	SkiingResult skiingResult;
	
	public FinalResult(ShootingResult shootingResult, SkiingResult skiingResult) {
		this.shootingResult = shootingResult;
		this.skiingResult = skiingResult;
	}
	
	public double finalScore() {
		return skiingResult.pointsEarned() + skiingResult.getPenalties() + 
				skiingResult.getPositionPoints() + shootingResult.getPenalties();
	}
}
