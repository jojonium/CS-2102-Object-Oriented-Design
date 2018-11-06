import java.util.LinkedList;

public abstract class EventOnSkis implements IEvent {
	int position;
	LinkedList<Double> lapTimes;
	int numPenalties;
	
	public EventOnSkis(int position, double lapTime1, double lapTime2, double lapTime3, double lapTime4,
			int numPenalties) {
		lapTimes = new LinkedList<Double>();
		this.position = position;
		lapTimes.add(lapTime1);
		lapTimes.add(lapTime2);
		lapTimes.add(lapTime3);
		lapTimes.add(lapTime4);
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
		double out = 0;
		for (Double t : lapTimes) {
			out += t;
		}
		return out;
	}
	
	@Override
	public double getPenalties() {
		return 5 * numPenalties;
	}
}
