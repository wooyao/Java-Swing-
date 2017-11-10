import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JLabel;

public class Clock extends Thread{
	private JLabel jl;
	public Clock(JLabel jl) {
		this.jl=jl;
	}
	public void run(){
		while(true) {
			jl.setText(this.getTime());
			try {
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public String getTime() {
		Calendar c=new GregorianCalendar();
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MARCH)+1;
		int day=c.get(Calendar.DATE);
		int h=c.get(Calendar.HOUR_OF_DAY);
		int m=c.get(Calendar.MINUTE);
		int s=c.get(Calendar.SECOND);
		String pmo=month<10?"0":"";
		String pd=day<10?"0":"";
		String ph=h<10?"0":"";
		String pm=m<10?"0":"";
		String ps=s<10?"0":"";
		return year+"-"+pmo+month+"-"+pd+day+" "+ph+h+":"+pm+m+":"+ps+s;
		
		
	}
}
