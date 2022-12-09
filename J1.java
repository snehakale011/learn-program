import javax.swing.JFrame;
 
public class J1
 {
	public static void main(String args[])
    {
		JFrame frame = new grid();
		frame.setTitle("Notepad");
		frame.setVisible(true);
		frame.setSize(1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
	}
}