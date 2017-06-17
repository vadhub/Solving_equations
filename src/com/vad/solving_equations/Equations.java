package com.vad.solving_equations;
public class Equations {
	// a+x=b
	// x+a=b
	public int solvSum(int a, int b) {
		int x = b - a;
		return x;
	}

	// x^2*a+b+c=0
	// D=b^2-4*a*c
	// x1 = -b+sqrt(d)/2a
	// x2 = -b-sqrt(d)/2a
	public double solvR(int a, int b, int c){
		double d = b ^ 2 - 4 * a * c;
		double x1 = Math.sqrt(d) - b;
		double x2 = Math.sqrt(d) + b * -1;

		if (d < 0) {
			print("Not Solution " + d);
		}

		print("Dis :" + d);
		print(x1);
		print(x2);
		return x2;
	}

	// x/b=a
	public int slovFra(int a, int b) {
		int x = b * a;

		print(x);
		
		return x;
	}

	// b/x=a
	public double slovFra2(double a, double b) {
		double x = a / b;

		print(x);
		return x;
	}

	// a*x=b
	public double slovMul(double a, double b) {
		double x = b / a;
		print(x);
		
		return x;
	}

	// a+x/b = c
	public double slovFra3(double a, double b, double c) {
		double phase_1 = c * -1;
		double phase_2 = phase_1 * b;
		double phase_3 = a + phase_2;
		double x = phase_3 * -1;

		print(x);
		
		return x;
	}

	// a^2+b+c/d=e
	public double slovFra4(int a, int b, int c, int d, int e) {
		double phase_1 = e * -1;
		double phase_2 = phase_1 * d;
		int d_3 = (int) (c + phase_2);

		double g = b ^ 2 - 4 * a * d_3;
		double x1 = Math.sqrt(g) - b;
		double x2 = Math.sqrt(g) + (b * -1);

		if (g < 0) {
			print("Not dicision d<0 " + d);
		}

		print(x1);
		print(x2);
		
		return x2;

	}

	// a/b+c/d=e;
	public void slovFra5(int a, int b, int c, int d, int e) {
		if (b != d) {
			int phase_1 = e * -1;
			int mul = b * d;
			int ovrl = a * d;
			int ovrl2 = c * b;
			double phase_2 = ovrl + ovrl2 + phase_1;
			double x = phase_2 / mul;

			print(x);

		} else {
			int phase_1 = e * -1;
			int phase_2 = phase_1 * d;
			int phase_3 = a + c + phase_2;
			int x = phase_3 / d;

			print(x);

		}
	}

	private void print(int i) {
		System.out.println(i);
	}

	private void print(double i) {
		System.out.println(i);
	}

	private void print(String str) {
		System.out.println(str);
	}
}
