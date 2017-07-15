package com.vad.solvingequations;

public class AllSolvingEquations {

	public double sum(int x, double b, double... a) {
		double d = 0;

		for (int i = 0; i < a.length; i++) {
			d = d + a[i];
		}
		b = b - d;

		return b / x;
	}

	public double mul(int x, double b, double... a) {
		double d = 1;

		for (int i = 0; i < a.length; i++) {
			d = d * a[i];
		}

		return b / (d * x);
	}
	
	public double del(int x, double b, double a) {
		
		if(x>1){		
		return  a * b*x;
		}else{
			return  a * b;
		}
	}
}
