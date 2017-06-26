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
	public void DisplayForR(int a, int b, int c, double x){
		
		double d = b * b - 4 * a * c;
		double phase_1 = -b + Math.sqrt(d);
		double phase_1X2 = -b - Math.sqrt(d);
		double phase_2 = phase_1/2*a;
		double phase_2X2 = phase_1X2/2*a;
		
		
		JFrame frame = new JFrame();
		JTextArea mainTxt = new JTextArea();		
		
		mainTxt.setFont(font);
		
		mainTxt.append("solving: ");
		
		mainTxt.append("\n");
		
		mainTxt.append("x^2*"+String.valueOf(a)+"+ x*"+String.valueOf(c)+" = "+String.valueOf(b)+";");	
		
		mainTxt.append("\n");
		
		mainTxt.append("D = "+String.valueOf(b*b)+" -4 *"+String.valueOf(a)+"*"+String.valueOf(c)+"="+String.valueOf(d)+";");
		
		
		
		mainTxt.append("\n");	
		
		mainTxt.append("x1 = "+String.valueOf(b*-1)+"+ sqrt("+String.valueOf(d)+");");
		
		mainTxt.append("\n");
		
		mainTxt.append("x1 = "+String.valueOf(phase_2)+";");
		
		mainTxt.append("\n");
		
		mainTxt.append("x2 = "+String.valueOf(b*-1)+"- sqrt("+String.valueOf(d)+");");
		
		mainTxt.append("\n");
		
		mainTxt.append("x2 =" +String.valueOf(phase_2X2)+";");
				
		frame.add(mainTxt);
		
		frame.setSize(200, 200);
		frame.setLocation(400, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
	}
}
