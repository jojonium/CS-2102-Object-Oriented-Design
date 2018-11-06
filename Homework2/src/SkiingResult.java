import java.util.LinkedList;

public class SkiingResult extends EventOnSkis {
	int position;
	LinkedList<Double> lapTimes;
	int numPenalties;
	
	public SkiingResult(int position, double lapTime1, double lapTime2,
			double lapTime3, double lapTime4, int numPenalties) {
		super(position, lapTime1, lapTime2, lapTime3, lapTime4, numPenalties);
	}	
}
