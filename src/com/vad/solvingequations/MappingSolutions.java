package com.vad.solvingequations;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MappingSolutions {
	private Font font = new Font("SERIF", 10, 20);
	public void DisplayForSum(int a, int b, int x){
		JFrame frame = new JFrame();
		JTextArea mainTxt = new JTextArea();
		
		mainTxt.setFont(font);
		
		mainTxt.append("solving: ");
		
		mainTxt.append("\n");
		
		mainTxt.append(String.valueOf(a)+"+ x = "+String.valueOf(b)+";");	
		
		mainTxt.append("\n");
		
		mainTxt.append("x = "+String.valueOf(b)+" "+String.valueOf(a*-1)+";");	
		
		mainTxt.append("\n");		
		
		mainTxt.append("x = "+String.valueOf(x)+";");
		
		frame.add(mainTxt);
		
		frame.setSize(200, 200);
		frame.setLocation(400, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
	}
}
