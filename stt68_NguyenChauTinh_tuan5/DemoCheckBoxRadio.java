package stt68_NguyenChauTinh_tuan5;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class DemoCheckBoxRadio extends JFrame implements ItemListener, ActionListener {
	
	private JCheckBox italic;
	private JRadioButton lRadio;
	private JRadioButton rRadio;
	private JLabel lblH;

	public DemoCheckBoxRadio() {
		setTitle("Demo");
		setSize(300,100);
		
		JPanel pTop = new JPanel();
		pTop.add(italic = new JCheckBox("Italic"));
		pTop.add(lRadio = new JRadioButton("Left",true));
		pTop.add(rRadio = new JRadioButton("Right"));
		ButtonGroup group = new ButtonGroup();
		group.add(lRadio);
		group.add(rRadio);
		
		add(pTop,BorderLayout.NORTH);
		add(lblH = new JLabel("Hello Word!"));
		
		italic.addItemListener(this);
		lRadio.addActionListener(this);
		rRadio.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}


	public static void main(String[] args) {
		new DemoCheckBoxRadio();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o.equals(lRadio))
			lblH.setHorizontalAlignment(SwingConstants.LEFT);
		else
			lblH.setHorizontalAlignment(SwingConstants.RIGHT	);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Font f = lblH.getFont();
		if(e.getStateChange()==ItemEvent.SELECTED)
			lblH.setFont(new Font(f.getName(), Font.ITALIC, f.getSize()));
		else
			lblH.setFont(new Font(f.getName(), Font.PLAIN, f.getSize()));	
	}
	
}
