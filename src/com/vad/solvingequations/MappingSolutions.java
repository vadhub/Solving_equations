package com.vad.solvingequations;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MappingSolutions {
	private Font font = new Font("SERIF", Font.BOLD, 20);
	EquationsTrigeometry equationsTrigeometry = new EquationsTrigeometry();

	public void DisplayForSum(int a, int b, int x) {
		JFrame frame = new JFrame();
		JTextArea mainTxt = new JTextArea();

		mainTxt.setBackground(Color.green.darker().darker().darker());

		mainTxt.setForeground(Color.WHITE);

		mainTxt.setFont(font);

		mainTxt.append("solving: ");

		mainTxt.append("\n");

		mainTxt.append(String.valueOf(a) + "+ x = " + String.valueOf(b) + ";");

		mainTxt.append("\n");

		mainTxt.append("x = " + String.valueOf(b) + " "
				+ String.valueOf(a * -1) + ";");

		mainTxt.append("\n");

		mainTxt.append("x = " + String.valueOf(x) + ";");

		frame.add(mainTxt);

		frame.setSize(200, 200);
		frame.setLocation(400, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public void DisplayForR(int a, int b, int c) {

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

	public void DisplayForFra3(int a, int b, int c) {

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

	public void DisplaysolvMul(int a, int b, double x) {

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

	public void DisplaysolvSqrt_2(int a, int b, int x) {

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

	public void DisplaysolvFra_5(int a, int b, int c, int d, double x) {

		int phase_1 = a * c;
		int phase_2 = b * a;
		int phase_3 = d * -1;
		int phase_4 = phase_3 * phase_1;
		int phase_5 = phase_2 + phase_4;

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

	public void DisplaySolvMod(int a, int b, int x, int x2) {

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
	
	public void DisplaySolvSin(int a) {

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
	
	public void DisplaySolvCos(int a) {

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
	
	public void DisplaySolvTg(int a) {

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
}
