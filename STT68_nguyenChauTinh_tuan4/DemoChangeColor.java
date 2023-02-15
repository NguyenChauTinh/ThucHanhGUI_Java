package STT68_nguyenChauTinh_tuan4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DemoChangeColor extends JFrame implements ActionListener, MouseListener {
	
	private JButton btn1,btn2;
	private JPanel p;
	
	public DemoChangeColor() {

		setTitle("Change Color");
		setSize(250,250);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.setBackground(Color.BLACK);
		
		btn1 = new JButton("RED");
		btn2 = new JButton("YELLOW");
		btn1.setBackground(Color.red);
		btn2.setBackground(Color.yellow);
		
		p.add(btn1);
		p.add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		add(p);
	}
	
	public static void main(String[] args) {
		new DemoChangeColor().setVisible(true);;
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(btn1)) {
			p.setBackground(Color.red);
		} else {
			p.setBackground(Color.yellow);
		}
			
		
	}
	
	
}
