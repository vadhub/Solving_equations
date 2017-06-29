package com.vad.solvingequations;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Run {

	public static void main(String[] args) {
		Equations equations = new Equations();
		EquationsTrigeometry equationsTri = new EquationsTrigeometry();
		MappingSolutions mappingSol = new MappingSolutions();

		// gui bloc

		JFrame frame = new JFrame();

		JTextField result = new JTextField(17);
		JButton enter = new JButton("Enter");

		JLabel l_a = new JLabel("a: ");
		JLabel l_b = new JLabel("b: ");
		JLabel l_c = new JLabel("c: ");
		JLabel l_d = new JLabel("d: ");
		JLabel l_e = new JLabel("e: ");
		JLabel l_result = new JLabel("result: ");

		Choice ch = new Choice();

		ch.add("a+x=b");
		ch.add("x^2a+bx+c=0");
		ch.add("x/b=a");
		ch.add("b/x=a");
		ch.add("a+x/b = c");
		ch.add("a*x=b");
		ch.add("ax^2+bx+c/d=e");
		ch.add("x/a+b/c=d");
		ch.add("sinX = a");
		ch.add("cosX = a");
		ch.add("tgX = a");
		ch.add("sqrt(a+x)=b");
		ch.add("sqrt(a+x)^3=b");
		ch.add("sqrt(a+x)^4=b");
		ch.add("|a+x| = b");
		ch.add("�tgX = a");

		JTextField a = new JTextField(4);
		JTextField b = new JTextField(4);
		JTextField c = new JTextField(4);
		JTextField d = new JTextField(4);
		JTextField e = new JTextField(4);

		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());

		panel1.add(ch);
		panel1.add(enter);
		panel1.add(l_a);
		panel1.add(a);
		panel1.add(l_b);
		panel1.add(b);
		panel1.add(l_c);
		panel1.add(c);
		panel1.add(l_d);
		panel1.add(d);
		panel1.add(l_e);
		panel1.add(e);
		panel1.add(l_result);
		panel1.add(result);

		frame.add(panel1);
		frame.setVisible(true);
		frame.setSize(560, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(400, 400);

		enter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int int_a;
				int int_b;
				int int_c;
				int int_d;
				int int_e;

				int_a = Integer.parseInt(a.getText());
				int_b = Integer.parseInt(b.getText());
				int_c = Integer.parseInt(c.getText());
				int_d = Integer.parseInt(d.getText());
				int_e = Integer.parseInt(e.getText());

				if (ch.getSelectedIndex() == 0) {
					int x = (int) equations.solvSum(int_a, int_b);
					
					mappingSol.DisplayForSum(int_a, int_b, x);	
					
					result.setText(String.valueOf(x));
				} else if (ch.getSelectedIndex() == 1) {
					
					double x = equations.solvR_X1(int_a, int_b, int_c);
					double x2 = equations.solvR_X2(int_a, int_b, int_c);
					
					mappingSol.DisplayForR(int_a, int_b, int_c);

					result.setText(String.valueOf(x)+";"+String.valueOf(x2));

				} else if (ch.getSelectedIndex() == 2) {

					int x = equations.solvFra(int_a, int_b);

					result.setText(String.valueOf(x));

				} else if (ch.getSelectedIndex() == 3) {

					double x = equations.solvFra2(int_a, int_b);

					result.setText(String.valueOf(x));

				} else if (ch.getSelectedIndex() == 4) {

					double x = equations.solvFra3(int_a, int_b, int_c);
					
					mappingSol.DisplayForFra3(int_a, int_b, int_c);

					result.setText(String.valueOf(x));

				} else if (ch.getSelectedIndex() == 5) {

					double x = equations.solvMul(int_a, int_b);
					
					mappingSol.DisplaysolvMul(int_a, int_b, x);
					result.setText(String.valueOf(x));

				} else if (ch.getSelectedIndex() == 6) {

					double x = equations.solvFra4(int_a, int_b, int_c, int_d, int_e);

					result.setText(String.valueOf(x));

				} else if (ch.getSelectedIndex() == 7) {

					double x = equations.solvFra5(int_a, int_b, int_c, int_d);
					
					mappingSol.DisplaysolvFra_5(int_a, int_b, int_c, int_d, x);

					result.setText(String.valueOf(x));
				} else if (ch.getSelectedIndex() == 8) {
					String x = equationsTri.solvSin(int_a);
					result.setText(x);

				} else if (ch.getSelectedIndex() == 9) {

					String x = equationsTri.solvCos(int_a);
					result.setText(x);
				} else if (ch.getSelectedIndex() == 10) {

					String x = equationsTri.solvTg(int_a);
					result.setText(x);
				} else if (ch.getSelectedIndex() == 11) {

					int x = equations.solvSqrt_2(int_a, int_b);
					
					mappingSol.DisplaysolvSqrt_2(int_a, int_b, x);
					
					result.setText(String.valueOf(x));
				} else if (ch.getSelectedIndex() == 12) {

					int x = equations.solvSqrt_3(int_a, int_b);
					result.setText(String.valueOf(x));
				} else if (ch.getSelectedIndex() == 13) {

					int x = equations.solvSqrt_4(int_a, int_b);
					result.setText(String.valueOf(x));
				} else if (ch.getSelectedIndex() == 14) {

					int x1 = equations.solvMod_X1(int_a, int_b);
					int x2 = equations.solvMod_X2(int_a, int_b);
					
					mappingSol.DisplaysolvMod(int_a, int_b, x1,x2);
					
					result.setText(String.valueOf(x1) + " ; " + String.valueOf(x2));
				} else if(ch.getSelectedIndex() == 15){
					String x = equationsTri.solvCtg(int_a);
					result.setText(x);
				}
			}
		});

	}
}
