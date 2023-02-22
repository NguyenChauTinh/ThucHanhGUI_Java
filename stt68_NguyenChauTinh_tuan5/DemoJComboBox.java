package stt68_NguyenChauTinh_tuan5;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class DemoJComboBox extends JFrame implements ActionListener {
	private JLabel label;
	private JComboBox faceCombo;
	public DemoJComboBox() {
		setTitle("JComboBox Demo"); 
		setResizable(false);
		label = new JLabel("The quick brown fox jumps over the lazy dog.");
		label.setFont(new Font("Serif", Font.PLAIN, 12));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		add(label, BorderLayout.CENTER);
		// make a combo box
		String word[] = {"Serif","SansSerif","Monospaced"};
		faceCombo = new JComboBox(word); 
//		faceCombo.addItem("Serif");
//		faceCombo.addItem("SansSerif");
//		faceCombo.addItem("Monospaced");
		add(faceCombo, BorderLayout.SOUTH); 
		faceCombo.addActionListener(this);
		setSize(250, 150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new DemoJComboBox();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String fontName = (String)faceCombo.getSelectedItem();
		label.setFont (new Font(fontName, label.getFont().getStyle(), label.getFont().getSize()));
		
	}
}
