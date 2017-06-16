package com.vad.solving_equations;
import java.awt.FlowLayout;

import javax.swing.*;

public class Run {

	public static void main(String[] args) {
		Equations equations = new Equations();
		
		//gui bloc
		
		JFrame frame = new JFrame();
		
		JTextField result = new JTextField();		
		JButton enter = new JButton();
		
		JTextField a = new JTextField();
		JTextField b = new JTextField();
		JTextField c = new JTextField();
		JTextField d = new JTextField();
		JTextField e = new JTextField();
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		
		
		panel1.add(enter);
		panel1.add(a);
		panel1.add(b);
		panel1.add(c);
		panel1.add(d);
		panel1.add(e);
		panel1.add(result);
		
		frame.add(panel1);
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
