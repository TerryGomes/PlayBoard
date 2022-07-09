package View;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import Control.ControleTelaMenu;

public class TelaMenu extends TelaBase
{
	private static final long serialVersionUID = 1L;

	private JButton cmd_novo;
	private JButton cmd_cadsatro;
	private JButton cmd_intrucao;
	private JButton cmd_sair;

	private ControleTelaMenu controle;

	public TelaMenu()
	{
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		cmd_novo = new JButton("Tentar de Novo");
		cmd_novo.setBounds(45, 25, 130, 35);

		cmd_cadsatro = new JButton("Cadastro");
		cmd_cadsatro.setBounds(45, 85, 130, 35);

		cmd_intrucao = new JButton("Intrução");
		cmd_intrucao.setBounds(45, 145, 130, 35);

		cmd_sair = new JButton("Sair");
		cmd_sair.setBounds(45, 650, 130, 35);

		add(cmd_novo);
		add(cmd_cadsatro);
		add(cmd_intrucao);
		add(cmd_sair);

		controle = new ControleTelaMenu(this);
		cmd_novo.addActionListener(controle);
		cmd_cadsatro.addActionListener(controle);
		cmd_intrucao.addActionListener(controle);
		cmd_sair.addActionListener(controle);
		
	}

	public JButton getCmd_novo()
	{
		return cmd_novo;
	}

	public void setCmd_novo(JButton cmd_novo)
	{
		this.cmd_novo = cmd_novo;
	}

	public JButton getCmd_cadsatro()
	{
		return cmd_cadsatro;
	}

	public void setCmd_cadsatro(JButton cmd_cadsatro)
	{
		this.cmd_cadsatro = cmd_cadsatro;
	}

	public JButton getCmd_intrucao()
	{
		return cmd_intrucao;
	}

	public void setCmd_intrucao(JButton cmd_intrucao)
	{
		this.cmd_intrucao = cmd_intrucao;
	}

	public JButton getCmd_sair()
	{
		return cmd_sair;
	}

	public void setCmd_sair(JButton cmd_sair)
	{
		this.cmd_sair = cmd_sair;
	}

}
