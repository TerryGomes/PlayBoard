package View;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaDigitando extends TelaBase
{
	private static final long serialVersionUID = 1L;

	private JButton cmd_voltar;
	
	private JButton letra_a;
	private JButton letra_b;
	private JButton letra_c;
	private JButton letra_d;
	private JButton letra_e;
	private JButton letra_f;
	private JButton letra_g;
	private JButton letra_h;
	private JButton letra_i;
	private JButton letra_j;
	private JButton letra_k;
	private JButton letra_l;
	private JButton letra_m;
	private JButton letra_n;
	private JButton letra_o;
	private JButton letra_p;
	private JButton letra_q;
	private JButton letra_r;
	private JButton letra_s;
	private JButton letra_t;
	private JButton letra_u;
	private JButton letra_w;
	private JButton letra_x;
	private JButton letra_y;
	private JButton letra_z;

	
	
	

	public TelaDigitando()
	{
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		cmd_voltar = new JButton("Voltar");
		cmd_voltar.setBounds(880, 85, 100, 35);

		letra_a = new JButton("A");
		letra_a.setBounds(100, 550, 45, 45);
		
		letra_s = new JButton("S");
		letra_s.setBounds(155, 550, 45, 45);

		letra_d = new JButton("D");
		letra_d.setBounds(210, 550, 45, 45);

		letra_f = new JButton("F");
		letra_f.setBounds(265, 550, 45, 45);

		
		add(cmd_voltar);
		
		add(letra_a);
		add(letra_s);
		add(letra_d);
		add(letra_f);
		
	
	}

	public JButton getCmd_voltar()
	{
		return cmd_voltar;
	}

	public void setCmd_voltar(JButton cmd_voltar)
	{
		this.cmd_voltar = cmd_voltar;
	}
	
	

}
