package com.vad.solvingequations;

import java.util.Scanner;

public class AllSolvingEquations {
	Scanner scn = new Scanner(System.in);	
	double dob = scn.nextDouble();
	int num = scn.nextInt();
	
	double[] arr = new double[num];	
	
	public double sum(int x,double b, double... a) {
		double d = 0;
		for (int i = 0; i <= a.length; i++) {
			d = a[i] + a[i + 1];
		}
		b = b-d;
		return b/x;
	}
}
