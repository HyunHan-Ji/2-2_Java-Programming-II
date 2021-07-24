package week09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame {
	private JButton button1, button2;
	private JPanel panel;

	public MyFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		panel = new JPanel();
		button1 = new JButton("�����");
		button1.addActionListener(e -> {panel.setBackground(Color.YELLOW);});
		panel.add(button1);
		button2 = new JButton("��ũ��");
		button2.addActionListener(e -> {panel.setBackground(Color.PINK);});
		panel.add(button2);
		this.add(panel);
		this.setVisible(true);
	}

	ActionListener MyListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) {
				panel.setBackground(Color.YELLOW);
			} else if (e.getSource() == button2) {
				panel.setBackground(Color.PINK);
			}
		}
	};
}

public class ChangeBackground {
	public static void main(String[] args) {
		MyFrame t = new MyFrame();
	}
}
