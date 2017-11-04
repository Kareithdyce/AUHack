import java.util.Timer;
import java.util.TimerTask;

public class StudyBreakTimer {
	Timer timer;

	public StudyBreakTimer(int seconds) {
		timer = new Timer();
		timer.schedule(new TimeReminder(), seconds * 1000);
	}
	class TimeReminder extends TimerTask {
		public void run() {
			System.out.println("Study Break Over!!!");
			timer.cancel(); // Terminate the timer thread
		}
	}

	public static void main(String args[]) {
		new StudyBreakTimer(900);
		System.out.println("Relax, get a snack, take a power nap, regain energy to finish study session! STUDY BREAK ENDS IN 15 MINUTES!!!");
	}
}