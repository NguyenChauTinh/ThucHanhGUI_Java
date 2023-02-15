package STT68_nguyenChauTinh_tuan4;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;	

public class DemoFrame extends JFrame {
	
	private JTextField textFN, textLN;
	
	DemoFrame () {
//		setTitle("Input Data");
//		JPanel jp = new JPanel();
//		jp.add(new JLabel("First Name"));
//		jp.add(textFN = new JTextField(10));
//		jp.add(new JLabel("Last Name"));
//		jp.add(textLN = new JTextField(10));
//		add(jp);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setSize(250, 100);
		
		JFrame frame = new JFrame();
		frame.setTitle(getTitle());
		JPanel jp = new JPanel();
		jp.add(new JLabel("First Name"));
		jp.add(textFN = new JTextField(10));
		jp.add(new JLabel("Last Name"));
		jp.add(textLN = new JTextField(10));
		frame.add(jp);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(250, 100);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
//		new Demo().setVisible(true);
		new DemoFrame();
	}
 	
}
