package com.vad.solvingequations;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.vad.solvingequtions.controler.BasicNumberOperations;

public class Run {
	public static void main(String[] args) {
		BasicNumberOperations basicNumOps = new BasicNumberOperations();

		// gui bloc
		JFrame frame2 = new JFrame();

		JPanel panelBase = new JPanel();
		JButton solv = new JButton("Solov");
		JTextField inText = new JTextField(10);
		JLabel label = new JLabel("Ex: 2x=12");
		label.setForeground(Color.gray);

		panelBase.add(solv);
		panelBase.add(inText);
		panelBase.add(label);
		frame2.setSize(300, 100);
		frame2.setVisible(true);
		frame2.add(panelBase);
		frame2.setLocation(400, 400);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		solv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				basicNumOps.detectInteger(inText.getText());
				JOptionPane.showMessageDialog(null, basicNumOps.mathOperations(inText.getText()));
			}
		});
		}
	
}
