package stt68_NguyenChauTinh_tuan5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class DemoJPasswordField extends JFrame implements ActionListener {
	private JPasswordField txtPassword;
	private JButton btnOk;
	private JButton btnCancel;

	DemoJPasswordField() {
		setTitle("Password");

		JPanel pLeft = new JPanel();
		JPanel pRight = new JPanel(new GridLayout(0,1));

		txtPassword = new JPasswordField(12);
		txtPassword.addActionListener(this);

		pLeft.add(new Label("Password"));
		pLeft.add(txtPassword);
		pRight.add(btnOk = new JButton("OK"));
		pRight.add(btnCancel = new JButton("Cancel"));

		add(pLeft,BorderLayout.WEST);
		add(pRight,BorderLayout.CENTER);

		btnOk.addActionListener(this);
		btnCancel.addActionListener(this);

		btnOk.setFocusable(false);
		//		btnOK.setBackground(Color.white);
		btnCancel.setFocusable(false);

		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DemoJPasswordField();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o == btnOk || o == txtPassword) {
			char chPassword[] = txtPassword.getPassword();
			String strPassword = new String(chPassword);
			if(strPassword.trim().equals("pass")) {
				JOptionPane.showMessageDialog(this,"Correct Password");
				System.exit(0);
			}
			else {
				JOptionPane.showMessageDialog(this,"Incorrect Password","Error Message", JOptionPane.ERROR_MESSAGE);
				txtPassword.selectAll();
				txtPassword.requestFocus();
			}
		}
		else {
			System.exit(0);
		}

	}
}
