package stt68_NguyenChauTinh_tuan5;

import java.awt.*;

import javax.sound.sampled.LineListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class DemoJList extends JFrame implements ListSelectionListener {
	private JTextField txtEn;
	private JList lstEntry;
	public DemoJList() {
		setTitle("Demo");
		
		String[] entries = { 
				"Entry 1", "Entry 2", "Entry 3",
				"Entry 4", "Entry 5", "Entry 6" 
				};
		lstEntry = new JList(entries);
		lstEntry.setVisibleRowCount(4);
		JScrollPane listPane = new JScrollPane(lstEntry);
		JPanel pCen = new JPanel();
		pCen.setBorder(BorderFactory.createTitledBorder("Simple JList"));
		pCen.add(listPane);
		add(pCen, BorderLayout.CENTER);
		lstEntry.addListSelectionListener(this);
		
		JPanel pSou = new JPanel();
		pSou.setBorder(BorderFactory.createTitledBorder("List Selection"));
		JLabel lblLast = new JLabel("Last selection");
		txtEn = new JTextField(10);
		txtEn.setEditable(false);
		pSou.add(lblLast);
		pSou.add(txtEn);
		add(pSou, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(250,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new DemoJList();
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		txtEn.setText(lstEntry.getSelectedValue().toString());
		
	}
}
