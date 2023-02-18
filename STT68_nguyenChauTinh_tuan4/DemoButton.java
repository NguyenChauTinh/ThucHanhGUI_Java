package stt68_nguyenChauTinh_tuan4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DemoButton extends JFrame implements ActionListener, MouseListener {
	
	private static final long serialVersionUID = 1L;
	private JTextField txtUserName;
	private JTextField txtPassword;
	private JButton btnLogin;
	private JButton btnExit;
	
	public DemoButton() {
		setTitle("demo mau");
		setSize(350,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		// setResizable(false);
		
		// giao dien
		JLabel label = new JLabel();
		label.setText("User Name:");
		label.setText("Password: ");
		JLabel lblUser = new JLabel("User Name:");
		JLabel lblPassword = new JLabel("Password: ");
		txtUserName = new JTextField(15);
		txtPassword = new JTextField(15);
		btnLogin = new JButton("Login");
		btnExit = new JButton("Exit");
		JPanel p = new JPanel();
		p.setBorder(BorderFactory.createTitledBorder("username:"));
		add(p);
		
		lblPassword.setPreferredSize(lblUser.getPreferredSize());
		p.add(lblUser);
		p.add(txtUserName);
		p.add(lblPassword);
		p.add(txtPassword);
		p.add(btnLogin);
		p.add(btnExit);
		
		//dang ki su kien
		btnExit.addActionListener(this);
		btnLogin.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new DemoButton().setVisible(true);
	}
		

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(btnLogin)) {
			if(txtPassword.getText().equals("123"))
				JOptionPane.showMessageDialog(this, "password chinh xac");
			else
			{
				JOptionPane.showMessageDialog(this, "password sai");
				//txtPassword.selectAll();
				//txtPassword.requestFocus();
			}
		}
		else
			System.exit(0);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


}
