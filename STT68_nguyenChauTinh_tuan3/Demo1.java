package stt68_NguyenChauTinh_tuan3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Demo1 extends JFrame implements ActionListener{

	private JButton btnExit,btnHienThi;
	private JLabel lblTen;
	public Demo1() {
		//1. frame
		this.setTitle("Demo Hello world");
		setSize(300, 100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setResizable(false);
		
		//2. định nghĩa các thành phần đồ họa sẽ thêm vào frame
		 lblTen = new JLabel("Hello World .....");
		 btnExit = new JButton("Exit");
		 btnHienThi = new JButton("Hiển thị ");
		
		//3. Thêm đối tượng đồ họa (component) vào JFrame (container)
		add(lblTen);		
		add(btnHienThi);		
		add(btnExit);
		
		//4. đăng ký lắng nghe sự kiện
		btnExit.addActionListener(this);
		btnHienThi.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		
		new Demo1().setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		if (obj.equals(btnExit))
			System.exit(0);
		if (obj.equals(btnHienThi))
			lblTen.setText("Happy new year class!!!!");
			
	}

}
