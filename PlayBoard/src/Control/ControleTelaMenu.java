package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.TelaDigitando;
import View.TelaMenu;

public class ControleTelaMenu implements ActionListener
{
	private static TelaMenu tela;

	public ControleTelaMenu(TelaMenu tela)
	{
		ControleTelaMenu.tela = tela;

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == tela.getCmd_novo())
		{
			new TelaDigitando();
			tela.setVisible(false);
		}
		else if (e.getSource() == tela.getCmd_cadsatro())
		{
		}
		if (e.getSource() == tela.getCmd_intrucao())
		{
		}
		if (e.getSource() == tela.getCmd_sair())
		{
			System.exit(0);
		}

	}

}
