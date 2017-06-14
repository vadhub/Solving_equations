package com.vad.solving_equations;

public class Equations {
	// a+x=b
		// x+a=b
		public void solvSum(int a, int b) {
			int x = b - a;
			print(x);
		}

		// x^2*a+b+c=0
		// D=b^2-4*a*c
		// x1 = -b+sqrt(d)/2a
		// x2 = -b-sqrt(d)/2a
		public void solvR(int a, int b, int c) {
			double d = b ^ 2 - 4 * a * c;
			double x1 = Math.sqrt(d) - b;
			double x2 = Math.sqrt(d) + b * -1;

			if (d < 0) {
				print("Not Solution " + d);
			}

			print("Dis :" + d);
			print(x1);
			print(x2);
		}

		// x/b=a
		public void slovFra(int a, int b) {
			int x = b * a;

			print(x);
		}

		// b/x=a
		public void slovFra2(double a, double b) {
			double x = a / b;

			print(x);
		}

		// a*x=b
		public void slovMul(double a, double b) {
			double x = b / a;
			print(x);
		}

		// a+x/b = c
		public void slovFra3(double a, double b, double c) {
			double d_1 = c * -1;
			double d_2 = d_1 * b;
			double d_3 = a + d_2;
			double x = d_3 * -1;

			print(x);
		}

		// a^2+b+c/d=e
		public void slovFra4(int a, int b, int c, int d, int e) {
			double d_1 = e * -1;
			double d_2 = d_1 * d;
			int d_3 = (int) (c + d_2);

			double g = b ^ 2 - 4 * a * d_3;
			double x1 = Math.sqrt(g) - b;
			double x2 = (Math.sqrt(g) + b) * -1;

			if (g < 0) {
				print("Not dicision d<0 " + d);
			}
			
			print(x1);
			print(x2);

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
