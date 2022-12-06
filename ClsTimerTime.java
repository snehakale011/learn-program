/**
* Used to get the system runing time and display it in a JLabel
*/
import java.util.Date;
import java.util.Timer;
import java.util.Calendar;
import javax.swing.JLabel;
import java.util.TimerTask;
import java.text.DateFormat;

public class ClsTimerTime
 {
//-------------------------------------------- TimerTime Constructor
	public void ClsTimerTime(JLabel label, int seconds) 
    {
		timer = new Timer();
		timer.scheduleAtFixedRate(new ClsTime(label), 0, seconds * 1000);
	}

//-------------------------------------------- TimerTime inner class
	public class ClsTime extends TimerTask {
		private JLabel label    = new JLabel();
		private boolean visible = false;

		public ClsTime(JLabel label) { this.label = label; }
		public void run() {
			cal  = Calendar.getInstance();
			date = cal.getTime();
			dateFormatter = DateFormat.getTimeInstance();
			label.setText(dateFormatter.format(date) + " ");
		}
	}

	//<!-- DECLARE_VARIABLES
	private Date date;
	private Timer timer;
	private Calendar cal;
	private DateFormat dateFormatter;
	//-->
}
