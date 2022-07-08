package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.TelaMenu;

public class ControleTelaMenu implements ActionListener
{
	private static TelaMenu tela;

	public ControleTelaMenu(TelaMenu tela)
	{
		ControleTelaMenu.tela = tela;

	}

	public static void mostrarTelaMenu()
	{
		tela.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == tela.getCmd_novo())
		{
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
