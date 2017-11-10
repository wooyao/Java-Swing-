import javax.swing.JFrame;
import javax.swing.JLabel;

public class SleepTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame("Êý×ÖÊ±ÖÓ");
		JLabel jl=new JLabel("clock");
		jl.setHorizontalAlignment(JLabel.CENTER);
		jf.add(jl);
		jf.setBounds(500,300,150,100);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		Clock clock=new Clock(jl);
		clock.start();		
	}

}
