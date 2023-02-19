package stt68_NguyenChauTinh_tuan5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoListEdit extends JFrame implements ActionListener {
	
	JButton btnAdd;
	JButton btnRemove;
	JTextField txtName;
	DefaultListModel listmodelName;
	JList listName;

	public DemoListEdit() {

		super("List Edit Demo");
		// list
		listmodelName = new DefaultListModel();
		listName = new JList(listmodelName);
		add(new JScrollPane(listName), BorderLayout.CENTER);

		JPanel pRight;
		JPanel pTop, pBottom;
		pTop = new JPanel();
		pTop.add(new JLabel("Input Name"));
		pTop.add(txtName = new JTextField(15));
		pBottom = new JPanel();
		pBottom.add(btnAdd = new JButton("Add Item"));
		pBottom.add(btnRemove = new JButton("Remove Item"));
		pRight = new JPanel(new BorderLayout());
		pRight.add(pTop, BorderLayout.NORTH );
		pRight.add(pBottom, BorderLayout.CENTER);
		add(pRight, BorderLayout.EAST);

		txtName.addActionListener(this);
		btnAdd.addActionListener(this);
		btnRemove.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 320);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DemoListEdit();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if ( o==btnAdd ) {
			String name = txtName.getText().trim();
			if ( name.length() <= 0 ) 
				JOptionPane.showMessageDialog(this, "Please input name!");
			else {
				listmodelName.addElement(name);
				txtName.setText( "" );
			} 
		}
		else if (o.equals(btnRemove))
			listmodelName.removeElement(listName.getSelectedValue());

	}

}
