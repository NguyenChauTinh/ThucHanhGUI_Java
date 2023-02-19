package stt68_NguyenChauTinh_tuan4;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.TitledBorder;

public class DemoBorder extends JFrame{
	
	
	public DemoBorder() {
		setTitle("Demo Border");
		setSize(420,420);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(4, 2));
//		for(int i = 0; i < 8; i++) {
//			this.add(new JButton("Button "+i));
//		}
		JButton btn = new JButton("BTN1");
		JButton btn1 = new JButton("BTN2");
		JButton btn2 = new JButton("BTN3");
		JButton btn3 = new JButton("BTN4");
		JButton btn4 = new JButton("BTN5");
		JButton btn5 = new JButton("BTN6");
		JButton btn6 = new JButton("BTN7");
		JButton btn7 = new JButton("BTN8");
		
		btn.setBorder(BorderFactory.createLineBorder(Color.red,2));
		btn1.setBorder(BorderFactory.createEtchedBorder(Color.yellow, Color.green));
		btn2.setBorder(BorderFactory.createRaisedBevelBorder());
		btn3.setBorder(BorderFactory.createLoweredBevelBorder());
		btn4.setBorder(BorderFactory.createTitledBorder("Title"));
		btn5.setBorder(BorderFactory.createTitledBorder(null, "Title", TitledBorder.RIGHT, TitledBorder.TOP));
		btn6.setBorder(BorderFactory.createCompoundBorder());
		btn7.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLUE));
		
//		btn.setFocusable(false);
		add(btn);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
	
	}
	public static void main(String[] args) {
		new DemoBorder().setVisible(true);
	}

}
