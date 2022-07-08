package View;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaDigitando extends TelaBase
{
	private static final long serialVersionUID = 1L;

	private JButton cmd_voltar;

	
	
	
	public TelaDigitando()
	{
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		
		
		
		cmd_voltar = new JButton("Voltar");
		cmd_voltar.setBounds(650, 25, 130, 35);
	
		
		
		
		add(cmd_voltar);
		
		
		
		
	}
	
	
	
	

}
