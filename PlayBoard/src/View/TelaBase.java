package View;

import javax.swing.JFrame;

public class TelaBase extends JFrame
{
	private static final long serialVersionUID = 1L;

	public TelaBase()
	{
		setTitle("Menu");
		setSize(1024, 768);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setLayout(null);

	}

}
