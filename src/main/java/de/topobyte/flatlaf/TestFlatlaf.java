package de.topobyte.flatlaf;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.formdev.flatlaf.FlatLightLaf;

public class TestFlatlaf extends JPanel
{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args)
	{
		FlatLightLaf.setup();

		JFrame frame = new JFrame();

		frame.add(new TestFlatlaf());

		frame.setTitle("Test FlatLaf");
		frame.setMinimumSize(new Dimension(800, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public TestFlatlaf()
	{
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(4, 4, 4, 4);
		c.anchor = GridBagConstraints.NORTH;
		c.fill = GridBagConstraints.HORIZONTAL;

		JLabel title = new JLabel("Test FlatLaf");
		Font font = title.getFont();
		title.setFont(font.deriveFont(font.getSize() * 2f));
		c.gridwidth = 2;
		add(title, c);

		JLabel labelNormal = new JLabel("normal input:");
		JLabel labelPassword = new JLabel("password input:");

		JTextField normal = new JTextField();
		JPasswordField password = new JPasswordField();

		c.weighty = 0.0;
		c.gridwidth = 1;

		c.gridy = 1;

		c.gridx = 0;
		c.weightx = 0.0;
		add(labelNormal, c);
		c.gridx = 1;
		c.weightx = 1.0;
		add(normal, c);

		c.gridy = 2;

		c.gridx = 0;
		c.weightx = 0.0;
		add(labelPassword, c);
		c.gridx = 1;
		c.weightx = 1.0;
		add(password, c);

		c.weightx = 1.0;
		c.weighty = 1.0;
		c.fill = GridBagConstraints.BOTH;
		add(new JPanel(), c);
	}

}
