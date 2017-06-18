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
	public double solvR(int a, int b, int c) {
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
		int phase_3 = (int) (c + phase_2);

		double g = b ^ 2 - 4 * a * phase_3;
		double x1 = Math.sqrt(g) - b;
		double x2 = Math.sqrt(g) + (b * -1);

		if (g < 0) {
			print("Not dicision d<0 " + d);
		}

		print(x1);
		print(x2);

		return x2;

	}

	// x/a+b/c=d;
	public int slovFra5(int a, int b, int c, int d) {

		int phase_1 = a * c;
		int phase_2 = b * a;
		int phase_3 = d * -1;
		int phase_4 = phase_3 * phase_1;
		int phase_5 = phase_2 + phase_4;
		int phase_Fin = (phase_5 / c) * -1;

		print(phase_Fin);

		return phase_Fin;
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
