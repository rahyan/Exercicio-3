package time;

public class time {
	private int hour;
	private int minute;
	
	time() {};
	
	public static void main(String arg[]){
		time t = new time();
		t.hour = 3;
		t.minute = 25;
		System.out.println("The time now is " + t.hour + ":" + t.minute);
	}
}
