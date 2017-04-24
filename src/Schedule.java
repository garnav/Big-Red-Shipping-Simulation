import java.util.LinkedList;
import java.time.LocalTime;;

public class Schedule {
	
	private LinkedList<Order> remSchedule;
	private LinkedList<Order> comSchedule;
	
	public Schedule(String input_file){
		remSchedule = generateSchedule(input_file);
		comSchedule = new LinkedList<Order>();
	}
	
	public static LinkedList<Order> generateSchedule(String input_file){
		return null;
	}
	
	public Order viewNext(){
		return remSchedule.peek();
	}
	
	public void completedCurrent(){
		Order next = remSchedule.poll();
		comSchedule.add(next);
	}
	
	public void reschedule(){
		
	}
	
	
	public class Order{
		
		private int smallBoxes;
		private int medBoxes;
		private int largeBoxes;
		
		private String location;
		private boolean isPickup;
		
		private LocalTime time;
	}
	
}
