import java.util.LinkedList;

public class Competition {
	int numShootingRounds;
	LinkedList<Athlete> competitors;
	
	public Competition(int numShootingRounds, LinkedList<Athlete> competitors) {
		this.numShootingRounds = numShootingRounds;
		this.competitors = competitors;
	}
	
	public LinkedList<String> shootingDNF() {
		LinkedList<String> out = new LinkedList<String>();
		for (Athlete a : competitors) {
			if (a.result.shootingResult.rounds.size() < numShootingRounds) {
				out.add(a.name);
			}
		}
		return out;
	}
	
	public double finalScoreForAthlete(String aName) {
		for (Athlete a : competitors) {
			if (a.name == aName) {
				return a.result.finalScore();
			}
		}
		return -1;
	}
	
	public boolean anyImprovement(Competition other) {
		for (Athlete a : competitors) {
			if (this.finalScoreForAthlete(a.name) < other.finalScoreForAthlete(a.name)) {
				return true;
			}
		}
		return false;
	}
}
