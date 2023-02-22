package stt68_NguyenChauTinh_tuan5;

import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DemoJTextField extends JFrame implements ActionListener {
	private JLabel lblResult;
	private JTextField mmText;
	DemoJTextField() {
		setTitle("Chuyen doi don vi");
		setLayout(new GridLayout(2,2));
		add(new Label("Nhap vao so milimet"));
		add(mmText = new JTextField(10));
		add(new Label("So centimet tuong ung"));
		add(lblResult = new JLabel("---"));
		
		
		mmText.addActionListener(this);
		setSize(300, 90);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new DemoJTextField();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		double cm,mm;
		mm = Double.parseDouble(mmText.getText());
		cm=mm/10;
		lblResult.setText(Double.toString(cm));
		
	}
}
