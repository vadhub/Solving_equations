package com.vad.solvingequations;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Run {

	public static void main(String[] args) {
		Equations equations = new Equations();
		EquationsTrigeometry equationsTri = new EquationsTrigeometry();
		MappingSolutions mappingSol = new MappingSolutions();

		// gui bloc
		JFrame frame2 = new JFrame();

		JPanel panelBase = new JPanel();
		JButton solv = new JButton("Solov");
		JTextField inText = new JTextField(10);

		panelBase.add(solv);
		panelBase.add(inText);

		frame2.setSize(300, 100);
		frame2.setVisible(true);
		frame2.add(panelBase);
		frame2.setLocation(400, 400);

		JTextField result = new JTextField(17);
		JButton enter = new JButton("Enter");

		solv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				detectInteger(inText.getText());
				JOptionPane.showMessageDialog(null,
						mathOperations(inText.getText()));

			}
		});

		JLabel l_a = new JLabel("a: ");
		JLabel l_b = new JLabel("b: ");
		JLabel l_c = new JLabel("c: ");
		JLabel l_d = new JLabel("d: ");
		JLabel l_e = new JLabel("e: ");
		JLabel l_result = new JLabel("result: ");

		Choice ch = new Choice();

		ch.add(" ");
		ch.add("x^2*a+bx+c=0");
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
		ch.add("a*sinX + b = 0");
		ch.add("a*cosX + b = 0");
		ch.add("a*tgX + b = 0");
		ch.add("x+y = a; x+b=y;");
		ch.add("sin(x/a) = b");
		ch.add("cos(x/a) = b");
		ch.add("tg(x/a) = b");
		ch.add("ctg(x/a) = b");
		ch.add("a*sin(x)^2+b*sin(x)+c=0");
		ch.add("a*cos(x)^2+b*cos(x)+c=0");

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

		enter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				double int_a;
				double int_b;
				double int_c;
				double int_d;
				double int_e;

				int_a = Double.parseDouble(a.getText());
				int_b = Double.parseDouble(b.getText());
				int_c = Double.parseDouble(c.getText());
				int_d = Double.parseDouble(d.getText());
				int_e = Double.parseDouble(e.getText());

				if (ch.getSelectedIndex() == 1) {

					double x = equations.solvR_X1(int_a, int_b, int_c);
					double x2 = equations.solvR_X2(int_a, int_b, int_c);

					mappingSol.DisplayForR(int_a, int_b, int_c);

					result.setText(String.valueOf(x) + ";" + String.valueOf(x2));

				} else if (ch.getSelectedIndex() == 2) {

					double x = equations.solvFra(int_a, int_b);

					result.setText(String.valueOf(x));

				} else if (ch.getSelectedIndex() == 3) {

					double x = equations.solvFra2(int_a, int_b);

					result.setText(String.valueOf(x));

				} else if (ch.getSelectedIndex() == 4) {

					double x = equations.solvFra3(int_a, int_b, int_c);

					mappingSol.DisplayForFra3((int) int_a, int_b, int_c);

					result.setText(String.valueOf(x));

				} else if (ch.getSelectedIndex() == 5) {

					double x = equations.solvMul(int_a, int_b);

					mappingSol.DisplaysolvMul((int) int_a, int_b, x);
					result.setText(String.valueOf(x));

				} else if (ch.getSelectedIndex() == 6) {

					double x = equations.solvFra4((int) int_a, int_b, int_c,
							int_d, int_e);

					result.setText(String.valueOf(x));

				} else if (ch.getSelectedIndex() == 7) {

					double x = equations.solvFra5((int) int_a, int_b, int_c,
							int_d);

					mappingSol.DisplaysolvFra_5((int) int_a, int_b, int_c,
							int_d, x);

					result.setText(String.valueOf(x));

				} else if (ch.getSelectedIndex() == 8) {

					String x = equationsTri.solvSin(int_a);

					mappingSol.DisplaySolvSin(int_a);

					result.setText(x);

				} else if (ch.getSelectedIndex() == 9) {

					String x = equationsTri.solvCos(int_a);

					mappingSol.DisplaySolvCos(int_a);

					result.setText(x);

				} else if (ch.getSelectedIndex() == 10) {

					String x = equationsTri.solvTg(int_a);

					mappingSol.DisplaySolvTg(int_a);

					result.setText(x);

				} else if (ch.getSelectedIndex() == 11) {

					double x = equations.solvSqrt_2(int_a, int_b);

					mappingSol.DisplaysolvSqrt_2(int_a, int_b, x);
					result.setText(String.valueOf(x));

				} else if (ch.getSelectedIndex() == 12) {

					double x = equations.solvSqrt_3(int_a, int_b);
					result.setText(String.valueOf(x));

				} else if (ch.getSelectedIndex() == 13) {

					double x = equations.solvSqrt_4(int_a, int_b);
					result.setText(String.valueOf(x));

				} else if (ch.getSelectedIndex() == 14) {

					double x1 = equations.solvMod_X1(int_a, int_b);
					double x2 = equations.solvMod_X2(int_a, int_b);

					mappingSol.DisplaySolvMod(int_a, int_b, x1, x2);

					result.setText(String.valueOf(x1) + " ; "
							+ String.valueOf(x2));
				} else if (ch.getSelectedIndex() == 15) {

					String x = equationsTri.solvCtg(int_a);

					mappingSol.DisplaySolvCtg(int_a);

					result.setText(x);

				} else if (ch.getSelectedIndex() == 16) {

					String x = equationsTri.solvSin_2(int_a, int_b);
					mappingSol.DisplaySolvSin_2(int_a, int_b);

					result.setText(x);
				} else if (ch.getSelectedIndex() == 17) {

					String x = equationsTri.solvCos_2(int_a, int_b);
					mappingSol.DisplaySolvCos_2(int_a, int_b);

					result.setText(x);
				} else if (ch.getSelectedIndex() == 18) {

					String x = equationsTri.solvTg_2(int_a, int_b);
					mappingSol.DisplaySolvTg_2(int_a, int_b);

					result.setText(x);
				} else if (ch.getSelectedIndex() == 19) {

					double x = equations.solvSystemEnqX(int_a, int_b);
					double y = equations.solvSystemEnqY(int_a, int_b);

					result.setText(String.valueOf(x) + ";" + String.valueOf(y));
				} else if (ch.getSelectedIndex() == 20) {

					String x = equationsTri.solvSin_3(int_a, int_b);
					mappingSol.DisplaySolvSin_3(int_a, int_b);

					result.setText(x);
				} else if (ch.getSelectedIndex() == 21) {

					String x = equationsTri.solvCos_3(int_a, int_b);
					mappingSol.DisplaySolvCos_3(int_a, int_b);

					result.setText(x);
				} else if (ch.getSelectedIndex() == 22) {

					String x = equationsTri.solvTg_3(int_a, int_b);
					mappingSol.DisplaySolvTg_3(int_a, int_b);

					result.setText(x);
				} else if (ch.getSelectedIndex() == 23) {

					String x = equationsTri.solvCtg_3(int_a, int_b);
					mappingSol.DisplaySolvCtg_3(int_a, int_b);

					result.setText(x);
				} else if (ch.getSelectedIndex() == 24) {

					String x = equationsTri.solvSin_X(int_a, int_b, int_c);

					mappingSol.DisplaySolvSin_X(int_a, int_b, int_c);
					result.setText(x);
				} else if (ch.getSelectedIndex() == 25) {

					String x = equationsTri.solvCos_X(int_a, int_b, int_c);

					mappingSol.DisplaySolvCos_X(int_a, int_b, int_c);
					result.setText(x);
				}

			}
		});

		System.out.println(detectInteger("x-2=12"));
		System.out.println(mathOperations("x-2=12"));

	}

	// detect symbols in string
	public static ArrayList<Integer> detectInteger(String str) {

		ArrayList<Integer> intList = new ArrayList<Integer>();		

		String ast = "";

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			if (c == '/') {
				ast += " " + c;
			} else if (c == '-') {
				ast += " " + c;
			} else if (c == '+') {
				ast += " " + c;
			} else if (c == '=') {
				ast += " " + c;
			} else {
				ast += c;
			}
		}	
		
		int pass = ast.indexOf("=");		

		if (pass == -1) {
			System.out.println("not");
		} else {
			ast = ast.replace('=', '-');
		}
		
		String[] arrStirng = ast.split(" ");
		
		for (String s : arrStirng) {
			try {
				intList.add(Integer.parseInt(s));
			} catch (Exception e) {
				intList.add(0);
			}
		}		

		// delete '0'
		for (int i = 0; i < intList.size(); i++) {

			if (intList.get(i) == 0) {
				intList.remove(i);
			}
		}

		return intList;

	}

	// fulfill math operations
	public static int mathOperations(String str1) {
		int summ = 0;
		ArrayList<Integer> listNumbers = detectInteger(str1);
		for (int i = 0; i < listNumbers.size(); i++) {
			summ = summ + listNumbers.get(i);
		}
		return summ * -1;
	}

}
