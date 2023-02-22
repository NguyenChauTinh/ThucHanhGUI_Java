package stt68_NguyenChauTinh_tuan5;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class DemoJCheckBox extends JFrame implements ItemListener {
	private JTextField field;
	private JCheckBox bold;
	private JCheckBox italic;
	public DemoJCheckBox() {
		setTitle("Demo");
		setLayout(new GridLayout(2, 1));
		setResizable(false);
		JPanel p1 = new JPanel();
		p1.add(field = new JTextField("Watch the font style change",20));
		field.setFont(new Font("Serif", Font.PLAIN, 16));
		add(p1);

		JPanel p2 = new JPanel();
		p2.add( bold = new JCheckBox("Bold"));
		p2.add( italic = new JCheckBox("Italic"));
		add(p2);



		bold.addItemListener(this);
		italic.addItemListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new DemoJCheckBox();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		Font f= field.getFont();
		// process bold checkbox events
		if (e.getItem() == bold)
			field.setFont(new Font(f.getName(), f.getStyle() ^ Font.BOLD, f.getSize()));
		// process italic checkbox events
		if (e.getItem() == italic)
			field.setFont(new Font(f.getName(), f.getStyle() ^ Font.ITALIC, f.getSize()));
		
	}


}
