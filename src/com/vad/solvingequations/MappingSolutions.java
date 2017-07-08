package com.vad.solvingequations;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MappingSolutions {
	private Font font = new Font("SERIF", Font.BOLD, 20);
	EquationsTrigeometry equationsTrigeometry = new EquationsTrigeometry();

	public void DisplayForSum(double int_a, double b, double x) {
		JFrame frame = new JFrame();
		JTextArea mainTxt = new JTextArea();

		mainTxt.setBackground(Color.green.darker().darker().darker());

		mainTxt.setForeground(Color.WHITE);

		mainTxt.setFont(font);

		mainTxt.append("solving: ");

		mainTxt.append("\n");

		mainTxt.append(String.valueOf(int_a) + "+ x = " + String.valueOf(b) + ";");

		mainTxt.append("\n");

		mainTxt.append("x = " + String.valueOf(b) + " "
				+ String.valueOf(int_a * -1) + ";");

		mainTxt.append("\n");

		mainTxt.append("x = " + String.valueOf(x) + ";");

		frame.add(mainTxt);

		frame.setSize(200, 200);
		frame.setLocation(400, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public void DisplayForR(double a, double b, double c) {

		double d = b * b - 4 * a * c;
		double phase_1 = -b + Math.sqrt(d);
		double phase_1X2 = -b - Math.sqrt(d);
		double phase_2 = phase_1 / 2 * a;
		double phase_2X2 = phase_1X2 / 2 * a;

		JFrame frame = new JFrame();
		JTextArea mainTxt = new JTextArea();

		mainTxt.setBackground(Color.green.darker().darker().darker());

		mainTxt.setForeground(Color.WHITE);

		mainTxt.setFont(font);

		mainTxt.append("solving: ");

		mainTxt.append("\n");

		mainTxt.append("x^2*" + String.valueOf(a) + "+ x*" + String.valueOf(b)
				+ " +" + String.valueOf(c) + " = 0;");

		mainTxt.append("\n");

		mainTxt.append("D = " + String.valueOf(b * b) + " -4 *"
				+ String.valueOf(a) + "*" + String.valueOf(c) + "="
				+ String.valueOf(d) + ";");

		if (d < 0) {
			mainTxt.append("\n");
			mainTxt.append("D<0 not solving");
		} else {

			mainTxt.append("\n");

			mainTxt.append("x1 = " + String.valueOf(b * -1) + "+ sqrt("
					+ String.valueOf(d) + ");");

			mainTxt.append("\n");

			mainTxt.append("x1 = " + String.valueOf(phase_2) + ";");

			mainTxt.append("\n");

			mainTxt.append("x2 = " + String.valueOf(b * -1) + "- sqrt("
					+ String.valueOf(d) + ");");

			mainTxt.append("\n");

			mainTxt.append("x2 =" + String.valueOf(phase_2X2) + ";");
		}

		frame.add(mainTxt);

		frame.setSize(200, 200);
		frame.setLocation(400, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public void DisplayForFra3(double a, double b, double c) {

		double phase_1 = c * -1;
		double phase_2 = phase_1 * b;
		double phase_3 = a + phase_2;
		double phase_4 = phase_3 * -1;

		JFrame frame = new JFrame();
		JTextArea mainTxt = new JTextArea();

		mainTxt.setBackground(Color.green.darker().darker().darker());

		mainTxt.setForeground(Color.WHITE);

		mainTxt.setFont(font);

		mainTxt.append("solving: ");

		mainTxt.append("\n");

		// a+x/b = c

		mainTxt.append(String.valueOf(a) + "+ x / " + String.valueOf(b) + "="
				+ String.valueOf(c) + ";");

		mainTxt.append("\n");

		mainTxt.append(String.valueOf(a) + "+ x / " + String.valueOf(b)
				+ String.valueOf(c * -1) + "= 0;");

		mainTxt.append("\n");

		mainTxt.append(String.valueOf(a) + "+ x / " + String.valueOf(b) + ""
				+ String.valueOf(-c) + "*" + String.valueOf(b) + "= 0;");

		mainTxt.append("\n");

		mainTxt.append(String.valueOf(a) + "+ x / " + String.valueOf(b) + ""
				+ String.valueOf(phase_2) + "= 0;");

		mainTxt.append("\n");

		mainTxt.append("x " + String.valueOf(a) + "+" + String.valueOf(phase_2)
				+ "/ " + String.valueOf(b) + "= 0;");

		mainTxt.append("\n");

		mainTxt.append("x " + phase_3 + "/ " + String.valueOf(b) + "= 0;");

		mainTxt.append("\n");

		mainTxt.append("x =" + phase_4 + ";");

		frame.add(mainTxt);

		frame.setSize(200, 200);
		frame.setLocation(400, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public void DisplaysolvMul(double a, double b, double x) {

		x = b / a;

		JFrame frame = new JFrame();
		JTextArea mainTxt = new JTextArea();

		mainTxt.setBackground(Color.green.darker().darker().darker());

		mainTxt.setForeground(Color.WHITE);

		mainTxt.setFont(font);

		mainTxt.append("solving: ");

		mainTxt.append("\n");

		mainTxt.append(String.valueOf(a) + "* x = " + String.valueOf(b) + ";");

		mainTxt.append("\n");

		mainTxt.append("x = " + String.valueOf(b) + " / " + String.valueOf(a)
				+ ";");

		mainTxt.append("\n");

		mainTxt.append("x = " + String.valueOf(x) + ";");

		frame.add(mainTxt);

		frame.setSize(200, 200);
		frame.setLocation(400, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void DisplaysolvSqrt_2(double a, double b, double x) {

		JFrame frame = new JFrame();
		JTextArea mainTxt = new JTextArea();

		mainTxt.setBackground(Color.green.darker().darker().darker());

		mainTxt.setForeground(Color.WHITE);

		mainTxt.setFont(font);

		mainTxt.append("solving: ");

		mainTxt.append("\n");

		mainTxt.append("sqrt(" + String.valueOf(a) + " + x) = "
				+ String.valueOf(b) + ";");

		mainTxt.append("\n");

		mainTxt.append("sqrt(" + String.valueOf(a) + " + x)^2 = ("
				+ String.valueOf(b) + ")^2 ;");

		mainTxt.append("\n");

		mainTxt.append(String.valueOf(a) + " + x = " + String.valueOf(b * b)
				+ ";");

		mainTxt.append("\n");

		mainTxt.append("x = " + String.valueOf(b * b) + String.valueOf(a * -1)
				+ ";");

		mainTxt.append("\n");

		mainTxt.append("x = " + x + ";");

		frame.add(mainTxt);

		frame.setSize(200, 200);
		frame.setLocation(400, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void DisplaysolvFra_5(double a, double b, double c, double d, double x) {

		double phase_1 = a * c;
		double phase_2 = b * a;
		double phase_3 = d * -1;
		double phase_4 = phase_3 * phase_1;
		double phase_5 = phase_2 + phase_4;

		JFrame frame = new JFrame();
		JTextArea mainTxt = new JTextArea();

		mainTxt.setBackground(Color.green.darker().darker().darker());

		mainTxt.setForeground(Color.WHITE);

		mainTxt.setFont(font);

		mainTxt.append("solving: ");

		mainTxt.append("\n");

		// x/a+b/c=d;

		mainTxt.append("x /" + String.valueOf(a) + " + " + String.valueOf(b)
				+ " / " + String.valueOf(c) + " = " + String.valueOf(d) + ";");

		mainTxt.append("\n");

		mainTxt.append(String.valueOf(c) + " * x /" + String.valueOf(a) + " * "
				+ String.valueOf(c) + " + " + String.valueOf(b) + " * "
				+ String.valueOf(a) + " / " + String.valueOf(c) + " = "
				+ String.valueOf(d) + ";");

		mainTxt.append("\n");

		mainTxt.append(String.valueOf(c) + " * x /" + String.valueOf(phase_1)
				+ " + " + String.valueOf(phase_2) + " / "
				+ String.valueOf(phase_1) + " + " + String.valueOf(d * -1)
				+ " = 0;");

		mainTxt.append("\n");

		mainTxt.append(String.valueOf(c) + " * x /" + String.valueOf(phase_1)
				+ " + " + String.valueOf(phase_2) + " / "
				+ String.valueOf(phase_1) + " + " + String.valueOf(d * -1)
				+ " * " + String.valueOf(phase_1) + " = 0;");

		mainTxt.append("\n");

		mainTxt.append(String.valueOf(c) + " * x /" + String.valueOf(phase_1)
				+ " + " + String.valueOf(phase_2) + " / "
				+ String.valueOf(phase_1) + " + " + String.valueOf(d * -1)
				+ " * " + String.valueOf(phase_1) + " = 0;");

		mainTxt.append("\n");

		mainTxt.append(String.valueOf(c) + " * x /" + String.valueOf(phase_1)
				+ " + " + String.valueOf(phase_2) + " / "
				+ String.valueOf(phase_1) + " + " + String.valueOf(phase_4)
				+ " / " + String.valueOf(phase_1) + " = 0;");

		mainTxt.append("\n");

		mainTxt.append(String.valueOf(c) + " * x /" + String.valueOf(phase_1)
				+ " + " + String.valueOf(phase_5) + " / "
				+ String.valueOf(phase_1) + " = 0;");

		mainTxt.append("\n");

		mainTxt.append(String.valueOf(c) + " * x + " + String.valueOf(phase_5)
				+ " = 0;");

		mainTxt.append("\n");

		mainTxt.append(String.valueOf(c) + " * x = "
				+ String.valueOf(phase_5 * -1) + ";");

		mainTxt.append("\n");

		mainTxt.append("x = " + x + ";");

		frame.add(mainTxt);

		frame.setSize(200, 200);
		frame.setLocation(400, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void DisplaySolvMod(double a, double b, double x, double x2) {

		JFrame frame = new JFrame();
		JTextArea mainTxt = new JTextArea();

		mainTxt.setBackground(Color.green.darker().darker().darker());

		mainTxt.setForeground(Color.WHITE);

		mainTxt.setFont(font);

		mainTxt.append("solving: ");

		mainTxt.append("\n");

		mainTxt.append("|x + " + String.valueOf(a) + "| = " + String.valueOf(b)
				+ " ;");

		mainTxt.append("\n");

		mainTxt.append("x1 + = " + String.valueOf(b) + " "
				+ String.valueOf(a * -1) + " ;");

		mainTxt.append("\n");

		mainTxt.append("x1 + = " + x + ";");

		mainTxt.append("\n");

		mainTxt.append("x2 + = " + String.valueOf(b * -1) + " "
				+ String.valueOf(a * -1) + " ;");

		mainTxt.append("\n");

		mainTxt.append("x2 + = " + x2 + ";");

		frame.add(mainTxt);

		frame.setSize(200, 200);
		frame.setLocation(400, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void DisplaySolvSin(double a) {

		JFrame frame = new JFrame();
		JTextArea mainTxt = new JTextArea();

		mainTxt.setBackground(Color.green.darker().darker().darker());

		mainTxt.setForeground(Color.WHITE);

		mainTxt.setFont(font);

		mainTxt.append("solving: ");

		mainTxt.append("\n");
		
		mainTxt.append("Sin x = "+String.valueOf(a)+";");	
		
		mainTxt.append("\n");
		
		mainTxt.append("x = (-1)^k * arcsin("+String.valueOf(a)+") + pi*k, k=Z;");
		
		mainTxt.append("\n");
		
		mainTxt.append(equationsTrigeometry.solvSin(a)+";");

		frame.add(mainTxt);

		frame.setSize(300, 300);
		frame.setLocation(400, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void DisplaySolvCos(double a) {

		JFrame frame = new JFrame();
		JTextArea mainTxt = new JTextArea();

		mainTxt.setBackground(Color.green.darker().darker().darker());

		mainTxt.setForeground(Color.WHITE);

		mainTxt.setFont(font);

		mainTxt.append("solving: ");

		mainTxt.append("\n");
		
		mainTxt.append("cos x = "+String.valueOf(a)+";");	
		
		mainTxt.append("\n");
		
		mainTxt.append("x =+- arccos("+String.valueOf(a)+") + 2*pi*k, k=Z;");
		
		mainTxt.append("\n");
		
		mainTxt.append(equationsTrigeometry.solvCos(a)+";");

		frame.add(mainTxt);

		frame.setSize(300, 300);
		frame.setLocation(400, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void DisplaySolvTg(double a) {

		JFrame frame = new JFrame();
		JTextArea mainTxt = new JTextArea();

		mainTxt.setBackground(Color.green.darker().darker().darker());

		mainTxt.setForeground(Color.WHITE);

		mainTxt.setFont(font);

		mainTxt.append("solving: ");

		mainTxt.append("\n");
		
		mainTxt.append("Tg x = "+String.valueOf(a)+";");	
		
		mainTxt.append("\n");
		
		mainTxt.append("x = arctg("+String.valueOf(a)+") + pi*k, k=Z;");
		
		mainTxt.append("\n");
		
		mainTxt.append(equationsTrigeometry.solvTg(a)+";");

		frame.add(mainTxt);

		frame.setSize(300, 300);
		frame.setLocation(400, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void DisplaySolvCtg(double a) {

		JFrame frame = new JFrame();
		JTextArea mainTxt = new JTextArea();

		mainTxt.setBackground(Color.green.darker().darker().darker());

		mainTxt.setForeground(Color.WHITE);

		mainTxt.setFont(font);

		mainTxt.append("solving: ");

		mainTxt.append("\n");
		
		mainTxt.append("ctg x = "+String.valueOf(a)+";");	
		
		mainTxt.append("\n");
		
		mainTxt.append("x = arcctg("+String.valueOf(a)+") + pi*k, k=Z;");
		
		mainTxt.append("\n");
		
		mainTxt.append(equationsTrigeometry.solvCtg(a)+";");

		frame.add(mainTxt);

		frame.setSize(300, 300);
		frame.setLocation(400, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void DisplayForSolvSystemEnq(double a, double b, double x, double y) {
		JFrame frame = new JFrame();
		JTextArea mainTxt = new JTextArea();

		/*
		 * x+y = a;
		 * x+b=y
		 */		
		
		mainTxt.setBackground(Color.green.darker().darker().darker());

		mainTxt.setForeground(Color.WHITE);

		mainTxt.setFont(font);

		mainTxt.append("solving: ");

		mainTxt.append("\n");

		mainTxt.append("x + y = "+a+";");
		mainTxt.append("x "+b+"= y;");

		mainTxt.append("\n");

		mainTxt.append("y = "+a+" - x;");
		mainTxt.append("x "+b+" = "+a+" - x;");

		mainTxt.append("\n");	
		
		mainTxt.append("y = "+a+" - x;");
		mainTxt.append("x "+b+" + "+a+" + x = 0;");
		
		mainTxt.append("\n");	
		
		mainTxt.append("y = "+a+" - x;");
		mainTxt.append("x + x + "+b+" + "+a+" = 0;");
		
		mainTxt.append("\n");	
		
		mainTxt.append("y = "+a+" - x;");
		mainTxt.append("2*x + "+b+" + "+a+" = 0;");

		mainTxt.append("\n");	
		
		mainTxt.append("y = "+a+" - x;");
		mainTxt.append("2*x = "+b+" + "+a+";");	
		
		mainTxt.append("\n");	
		
		mainTxt.append("y = "+a+" - x;");
		mainTxt.append("x = ("+b+" + "+a+") / 2;");
		
		mainTxt.append("\n");	
		
		mainTxt.append("y = "+a+-x+";");
		mainTxt.append("x ="+ x +";");		
		
		mainTxt.append("\n");	
		
		mainTxt.append("y = "+y+";");
		mainTxt.append("x ="+ x +";");		
		frame.add(mainTxt);

		frame.setSize(200, 200);
		frame.setLocation(400, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
	
	// a*sin+b = 0
	public void DisplaySolvSin_2(double a, double b) {

		JFrame frame = new JFrame();
		JTextArea mainTxt = new JTextArea();

		mainTxt.setBackground(Color.green.darker().darker().darker());

		mainTxt.setForeground(Color.WHITE);

		mainTxt.setFont(font);

		mainTxt.append("solving: ");

		mainTxt.append("\n");
		
		mainTxt.append(String.valueOf(a)+" * Sin x +"+String.valueOf(b)+" = 0;");	
		
		mainTxt.append("\n");
		
		mainTxt.append(String.valueOf(a)+" * Sin x ="+String.valueOf(b*-1)+";");
		
		mainTxt.append("\n");
		
		mainTxt.append("Sin x ="+String.valueOf(b*-1)+" / "+String.valueOf(a)+";");
		
		mainTxt.append("\n");
		
		mainTxt.append(equationsTrigeometry.solvSin_2(a, b));

		frame.add(mainTxt);

		frame.setSize(300, 300);
		frame.setLocation(400, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void DisplaySolvCos_2(double a, double b) {

		JFrame frame = new JFrame();
		JTextArea mainTxt = new JTextArea();

		mainTxt.setBackground(Color.green.darker().darker().darker());

		mainTxt.setForeground(Color.WHITE);

		mainTxt.setFont(font);

		mainTxt.append("solving: ");

		mainTxt.append("\n");
		
		mainTxt.append(String.valueOf(a)+" * Cos x +"+String.valueOf(b)+" = 0;");	
		
		mainTxt.append("\n");
		
		mainTxt.append(String.valueOf(a)+" * Cos x ="+String.valueOf(b*-1)+";");
		
		mainTxt.append("\n");
		
		mainTxt.append("Cos x ="+String.valueOf(b*-1)+" / "+String.valueOf(a)+";");
		
		mainTxt.append("\n");
		
		mainTxt.append(equationsTrigeometry.solvCos_2(a, b));

		frame.add(mainTxt);

		frame.setSize(300, 300);
		frame.setLocation(400, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void DisplaySolvTg_2(double a, double b) {

		JFrame frame = new JFrame();
		JTextArea mainTxt = new JTextArea();

		mainTxt.setBackground(Color.green.darker().darker().darker());

		mainTxt.setForeground(Color.WHITE);

		mainTxt.setFont(font);

		mainTxt.append("solving: ");

		mainTxt.append("\n");
		
		mainTxt.append(String.valueOf(a)+" * Tg x +"+String.valueOf(b)+" = 0;");	
		
		mainTxt.append("\n");
		
		mainTxt.append(String.valueOf(a)+" * Tg x ="+String.valueOf(b*-1)+";");
		
		mainTxt.append("\n");
		
		mainTxt.append("Tg x ="+String.valueOf(b*-1)+" / "+String.valueOf(a)+";");
		
		mainTxt.append("\n");
		
		mainTxt.append(equationsTrigeometry.solvTg_2(a, b));

		frame.add(mainTxt);

		frame.setSize(300, 300);
		frame.setLocation(400, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void DisplaySolvCtg_2(double a, double b) {

		JFrame frame = new JFrame();
		JTextArea mainTxt = new JTextArea();

		mainTxt.setBackground(Color.green.darker().darker().darker());

		mainTxt.setForeground(Color.WHITE);

		mainTxt.setFont(font);

		mainTxt.append("solving: ");

		mainTxt.append("\n");
		
		mainTxt.append(String.valueOf(a)+" * ctg x +"+String.valueOf(b)+" = 0;");	
		
		mainTxt.append("\n");
		
		mainTxt.append(String.valueOf(a)+" * ctg x ="+String.valueOf(b*-1)+";");
		
		mainTxt.append("\n");
		
		mainTxt.append("ctg x ="+String.valueOf(b*-1)+" / "+String.valueOf(a)+";");
		
		mainTxt.append("\n");
		
		mainTxt.append(equationsTrigeometry.solvCtg_2(a, b));

		frame.add(mainTxt);

		frame.setSize(300, 300);
		frame.setLocation(400, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
