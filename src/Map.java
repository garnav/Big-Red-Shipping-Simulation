
public class Map {

	/* Could either use an adjancency matrix to represent the nodes(ie locations).
	 * The issue that arises is representing the information (ie: time, distance etc.) 
	 * of how to go from one place to the next.
	 */
	
	public static int getCost(Dorm a, Dorm b){
		return Cost();
	}
	
	public class Cost{
		Dorm a;
		Dorm b;
		int time;
		int distance;
		int fuel;
	}
	
	public enum Dorm {
		CLARA_DICKSON,
		LOW_RISE_6,
		LOW_RISE_7,
		UJAMAA,
		HILC,
		JAM,
		HIGH_RISE_5,
		AKWEKON,
		TOWNHOUSE,
		MEWS,
		MARY_DONLAN,
		BALCH,
		COURT_KAY_BAUER,
		HIGH_RISE_5,
		JAMESON,
		ECOLOGY_HOUSE,
		LLC,
		RISLEY
	}
}
