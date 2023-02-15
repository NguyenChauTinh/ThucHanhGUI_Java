package STT68_nguyenChauTinh_tuan4;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class STT68_NguyenChauTinhDemoBoxLayout extends JFrame {
	
	public STT68_NguyenChauTinhDemoBoxLayout() {
		setTitle("Demo layout"); setSize(400,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Box b = Box.createVerticalBox();
		Box p1 = Box.createHorizontalBox();
		Box p2 = Box.createHorizontalBox();
		p1.add(new JLabel("User Name:"));
		p1.add(new JTextField(20));
		p2.add(new JLabel("Password:"));
		p2.add(new JPasswordField(20));
		b.add(Box.createRigidArea(new Dimension(10,10)));
		b.add(p1);
		b.add(Box.createRigidArea(new Dimension(10,10)));
		b.add(p2);
		this.add(b,BorderLayout.NORTH);
		
		
		}
	
	public static void main(String[] args) {
		new STT68_NguyenChauTinhDemoBoxLayout().setVisible(true);
	}
	
}
