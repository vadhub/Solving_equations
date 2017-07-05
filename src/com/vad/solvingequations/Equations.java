package com.vad.solvingequations;

public class Equations {
	// a+x=b
	// x+a=b
	public int solvSum(int a, int b) {
		int x = b - a;
		return x;
	}

	// a*x^2+b*x+c=0
	// D=b^2-4*a*c
	// x1 = -b+sqrt(d)/2a
	// x2 = -b-sqrt(d)/2a
	public double solvR_X1(double a, double b, double c) {
		double d = b * b - 4 * a * c;
		double phase_1 = b * -1 + Math.sqrt(d);

		double x1 = phase_1 / 2 * a;

		return x1;
	}

	public double solvR_X2(int a, int b, int c) {
		double d = b * b - 4 * a * c;
		double phase_1 = -b - Math.sqrt(d);

		double x2 = phase_1 / 2 * a;

		return x2;
	}

	// x/b=a
	public int solvFra(int a, int b) {
		int x = b * a;

		return x;
	}

	// b/x=a
	public double solvFra2(double a, double b) {
		double x = a / b;

		return x;
	}

	// a*x=b
	public double solvMul(double a, double b) {
		double x = b / a;

		return x;
	}

	// a+x/b = c
	public double solvFra3(double a, double b, double c) {
		double phase_1 = c * -1;
		double phase_2 = phase_1 * b;
		double phase_3 = a + phase_2;
		double x = phase_3 * -1;

		return x;
	}

	// ax^2+xb+c/d=e
	public double solvFra4(int a, int b, int c, int d, int e) {
		double phase_1 = e * -1;
		double phase_2 = phase_1 * d;
		int phase_3 = (int) (c + phase_2);

		double g = b * b - 4 * a * phase_3;
		double x1 = (Math.sqrt(g) - (b * -1)) / 2 * a;
		double x2 = (Math.sqrt(g) + (b * -1)) / 2 * a;

		if (g < 0) {
			return d;
		}

		if (x1 < x2) {
			return x2;
		} else {
			return x1;
		}

	}

	// x/a+b/c=d;
	public int solvFra5(int a, int b, int c, int d) {

		int phase_1 = a * c;
		int phase_2 = b * a;
		int phase_3 = d * -1;
		int phase_4 = phase_3 * phase_1;
		int phase_5 = phase_2 + phase_4;
		int phase_Fin = (phase_5 / c) * -1;
		return phase_Fin;
	}

	// sqrt(a+x)=b
	public int solvSqrt_2(int a, int b) {
		int phase_1 = b * b;
		int x = phase_1 - a;
		return x;
	}

	// sqrt(a+x)^3=b
	public int solvSqrt_3(int a, int b) {
		int phase_1 = b * b * b;
		int x = phase_1 - a;
		return x;

	}

	// sqrt(a+x)^3=b
	public int solvSqrt_4(int a, int b) {
		int phase_1 = b * b * b * b;
		int x = phase_1 - a;
		return x;
	}

	// |x+a|=b
	public int solvMod_X1(int a, int b) {
		int phase_1 = a * -1;
		int x1 = b + phase_1;

		return x1;
	}

	public int solvMod_X2(int a, int b) {
		int phase_1 = a * -1;
		int phase_2 = b * -1;
		int x2 = phase_1 + phase_2;

		return x2;
	}

	/*
	 * x+y = a;
	 * x+b=y
	 */
	public int solvSystemEnqX(int a, int b) {
		int y;

		y = a + b;

		y = (a + b) / 2;

		return a - y;

	}

	public int solvSystemEnqY(int a, int b) {
		return (a + b) / 2;

	}

}
