package com.vad.solvingequations;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.vad.solvingequtions.controler.BasicNumberOperations;

public class Run {

	public static void main(String[] args) {
		Equations equations = new Equations();
		EquationsTrigeometry equationsTri = new EquationsTrigeometry();
		MappingSolutions mappingSol = new MappingSolutions();
		BasicNumberOperations basicNumOps = new BasicNumberOperations();

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
				basicNumOps.detectInteger(inText.getText());
				JOptionPane.showMessageDialog(null,
						basicNumOps.mathOperations(inText.getText()));

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
		ch.add("ñtgX = a");
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
		
		System.out.println(basicNumOps.detectInteger("x-2=12"));
		System.out.println(basicNumOps.mathOperations("x-2=12"));

	}

}
