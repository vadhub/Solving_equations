package com.vad.solvingequations;

public class AllSolvingEquations {	
	
	public double sum(int x,double b, double... a) {
		double d = 0;
		
		for (int i = 0; i < a.length; i++) {
			d = d + a[i];
		}
		b = b-d;
		
		return b/x;
	}
}
