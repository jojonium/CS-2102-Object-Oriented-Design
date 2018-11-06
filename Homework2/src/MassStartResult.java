
public class MassStartResult extends EventOnSkis {
	int startingPosition;
	
	public MassStartResult(int startingPosition, int position, double lapTime1,
			double lapTime2, double lapTime3, double lapTime4, int numPenalties) {
		super(position, lapTime1, lapTime2, lapTime3, lapTime4, numPenalties);
		this.startingPosition = startingPosition;
	}
}
