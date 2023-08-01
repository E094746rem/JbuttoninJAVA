package JBOTTON;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button;
	JLabel label;

	MyFrame() {
		ImageIcon image = new ImageIcon("../JBOTTON/src/fun.png");
		ImageIcon Image2 = new ImageIcon("../JBOTTON/src/JBOTTON/IMG_20230318_190015.png");

		label = new JLabel();
		label.setIcon(Image2);
		label.setBounds(150, 250, 150, 200);
		label.setVisible(false);
		label.setText("HERE IS THE IMAGE OF THE LABEL");

		button = new JButton();
		button.setBounds(100, 100, 250, 100);
		button.addActionListener(this);// e -> System.out.println("fun")this is called lamda expration we can put this
										// instade of this and we delete the override
		button.setText("i'm button");
		button.setBackground(new Color(123, 146, 189));
		button.setFocusable(false);
		button.setIcon(image);
		button.setHorizontalTextPosition(JButton.CENTER);
//		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic sans", Font.BOLD, 25));
		button.setIconTextGap(-10);
		button.setForeground(Color.CYAN);
//		button.setBackground(Color.LIGHT_GRAY);
		button.setBorder(BorderFactory.createEtchedBorder());
//		to set the button to be disabled use button.setEnabeled(false);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("make your good day");
		this.setLayout(null);
		this.setSize(700, 700);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			// System.out.println("fun hu");
//			button.setEnabled(false);// to only activate it once and to deactivate it we should put it to hear
			label.setVisible(true);
		}

	}
}
