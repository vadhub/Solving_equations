package com.vad.solving_equations;
import java.awt.Choice;
import java.awt.FlowLayout;

import javax.swing.*;

public class Run {

	public static void main(String[] args) {
		Equations equations = new Equations();
		
		//gui bloc
		
		JFrame frame = new JFrame();
		
		JTextField result = new JTextField(4);		
		JButton enter = new JButton("Enter");
		
		JLabel l_a = new JLabel("a: ");
		JLabel l_b = new JLabel("b: ");
		JLabel l_c = new JLabel("c: ");
		JLabel l_d = new JLabel("d: ");
		JLabel l_e = new JLabel("e: ");
		JLabel l_result = new JLabel("result: ");
		
		Choice ch = new Choice();
		
		ch.add("a+x=b");
		ch.add("x^2*a+b+c=0");
		ch.add("x^2*a+b+c=0");
		ch.add("x/b=a");
		ch.add("b/x=a");
		ch.add("a*x=b");
		ch.add("a+x/b = c");
		ch.add("a^2+b+c/d=e");
		ch.add("a/b+c/d=e");		
		
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
		frame.setSize(450, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(400, 400);
		
		
		String st_a = a.getText();
		String st_b = b.getText();
		String st_c = c.getText();
		String st_d = d.getText();
		String st_e = e.getText();		
	
		int int_a = Integer.parseInt(st_a);
		int int_b = Integer.parseInt(st_b);
		int int_c = Integer.parseInt(st_c);
		int int_d = Integer.parseInt(st_d);
		int int_e = Integer.parseInt(st_e);		
		
		equations.slovFra(2, 3);
		equations.slovFra2(4, 5);
		equations.slovFra3(5, 6, 7);
		equations.slovFra4(1, 1, 1, 2, 3);
		equations.slovMul(2, 6);
		equations.solvR(1, -2, 3);
		equations.solvSum(6, -5);
		equations.slovFra5(1, 2, -7, 4, 3);

	}

}
