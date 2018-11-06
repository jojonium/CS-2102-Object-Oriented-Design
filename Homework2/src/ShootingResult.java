import java.util.LinkedList;

public class ShootingResult implements IEvent {
	LinkedList<ShootingRound> rounds;

	public ShootingResult(LinkedList<ShootingRound> rounds) {
		this.rounds = rounds;
	}

	@Override
	public double pointsEarned() {
		double out = 0;
		for (ShootingRound s : rounds) {
			out += s.targetsHit;
		}
		return out;
	}
	
	@Override
	public double getPenalties() {
		return 60 * (20 - this.pointsEarned());
	}

	public ShootingRound bestRoundByType(boolean standing) {
		ShootingRound out = null;
		for (ShootingRound r : rounds) {
			if (r.isStanding == standing && 
					(out == null || r.targetsHit > out.targetsHit)) {
				out = r;
			}
		}
		
		return out;
	}
}
