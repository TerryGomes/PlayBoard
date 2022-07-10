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
	private JButton letra_v;
	private JButton letra_w;
	private JButton letra_x;
	private JButton letra_y;
	private JButton letra_z;
	
	private JButton letra_ç;

	
	
	

	public TelaDigitando()
	{
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		cmd_voltar = new JButton("Voltar");
		cmd_voltar.setBounds(880, 85, 100, 35);
		
		
		//régua de cima
		letra_q = new JButton("Q");
		letra_q.setBounds(80, 495, 45, 45);

		letra_w = new JButton(" W");
		letra_w.setBounds(138, 495, 45, 45);

		letra_e = new JButton("E");
		letra_e.setBounds(195, 495, 45, 45);

		letra_r = new JButton("R");
		letra_r.setBounds(255, 495, 45, 45);

		letra_t = new JButton("T");
		letra_t.setBounds(315, 495, 45, 45);

		letra_y = new JButton("Y");
		letra_y.setBounds(375, 495, 45, 45);

		letra_u = new JButton("U");
		letra_u.setBounds(435, 495, 45, 45);

		letra_i = new JButton("I");
		letra_i.setBounds(495, 495, 45, 45);

		letra_o = new JButton("O");
		letra_o.setBounds(555, 495, 45, 45);

		letra_p = new JButton("P");
		letra_p.setBounds(590, 495, 45, 45);

		
		// régua do meio
		letra_a = new JButton("A");
		letra_a.setBounds(105, 550, 45, 45);
		
		letra_s = new JButton("S");
		letra_s.setBounds(165, 550, 45, 45);

		letra_d = new JButton("D");
		letra_d.setBounds(225, 550, 45, 45);

		letra_f = new JButton("F");
		letra_f.setBounds(285, 550, 45, 45);

		letra_g = new JButton("G");
		letra_g.setBounds(345, 550, 45, 45);

		letra_h = new JButton("H");
		letra_h.setBounds(405, 550, 45, 45);

		letra_j = new JButton("J");
		letra_j.setBounds(465, 550, 45, 45);

		letra_k = new JButton("K");
		letra_k.setBounds(525, 550, 45, 45);

		letra_l = new JButton("L");
		letra_l.setBounds(585, 550, 45, 45);

		letra_ç = new JButton("Ç");
		letra_ç.setBounds(645, 550, 45, 45);

		
		// régua de baixo
		letra_z = new JButton("Z");
		letra_z.setBounds(135, 605, 45, 45);
	
		letra_x = new JButton("X");
		letra_x.setBounds(195, 605, 45, 45);
		
		letra_c = new JButton("C");
		letra_c.setBounds(255, 605, 45, 45);

		letra_v = new JButton("V");
		letra_v.setBounds(315, 605, 45, 45);
		
		letra_b = new JButton("B");
		letra_b.setBounds(375, 605, 45, 45);

		letra_n = new JButton("N");
		letra_n.setBounds(435, 605, 45, 45);

		letra_m = new JButton("M");
		letra_m.setBounds(495, 605, 45, 45);

		
		add(cmd_voltar);
		
		// régua de cima
		add(letra_q);
		add(letra_w);
		add(letra_e);
		add(letra_r);
		add(letra_t);
		add(letra_y);
		add(letra_u);
		add(letra_i);
		add(letra_o);
		
		
		//régua do meio
		add(letra_a);
		add(letra_s);
		add(letra_d);
		add(letra_f);
		add(letra_g);
		add(letra_h);
		add(letra_j);
		add(letra_k);
		add(letra_l);
		add(letra_ç);
		
		//régua de baixo
		add(letra_z);
		add(letra_x);
		add(letra_c);
		add(letra_v);
		add(letra_b);
		add(letra_n);
		add(letra_m);
		
	
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
