
public class SkiingResult implements IEvent {
	int position;
	double lapTime1;
	double lapTime2;
	double lapTime3;
	double lapTime4;
	int numPenalties;
	
	public SkiingResult(int position, double lapTime1, double lapTime2, double lapTime3, double lapTime4,
			int numPenalties) {
		this.position = position;
		this.lapTime1 = lapTime1;
		this.lapTime2 = lapTime2;
		this.lapTime3 = lapTime3;
		this.lapTime4 = lapTime4;
		this.numPenalties = numPenalties;
	}

	public double getPositionPoints() {
		if (position == 1)
			return -10;
		else if (position == 2)
			return -7;
		else if (position == 3)
			return -3;
		else if (position == 4)
			return -1;
		else
			return 0;
	}
	
	@Override
	public double pointsEarned() {
		return lapTime1 + lapTime2 + lapTime3 + lapTime4;
	}
	
	@Override
	public double getPenalties() {
		return 5 * numPenalties;
	}
	
	
}
