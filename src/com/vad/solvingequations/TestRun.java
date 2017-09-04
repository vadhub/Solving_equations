package com.vad.solvingequations;

import java.util.Scanner;

public class TestRun {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);	
		
		int num =scn.nextInt();
		int x = scn.nextInt();		
		double res = scn.nextInt();
		
		
		double[] arr = new double[num];	
		
		for(int i =0;i<arr.length;i++){			
			
			arr[i] = scn.nextDouble();
		}
						
	

	}

}
