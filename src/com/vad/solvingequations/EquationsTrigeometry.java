package com.vad.solvingequations;

public class EquationsTrigeometry {
	String[] angls = { "pi/6", "pi/4", "pi/3", "pi/2", "pi" };

	String[] neg_angls = { "7pi/6", "5pi/4", "4pi/3", "3pi/2", "11pi/6",
			"7pi/4", "5pi/3" };

	String[] cos_neg_angls = { "5pi/6", "3pi/4", "2pi/3" };

	private int COUNT = 1;

	// //////////////////sin special for display
	public String SpecialArcSin(double int_a) {

		if (int_a == 1 / 2) {
			return "(-1)^k * " + angls[0] + "+ pi*k, k=Z";

		} else if (int_a == Math.sqrt(2) / 2) {

			return "(-1)^k * " + angls[1] + "+ pi*k, k=Z";

		} else if (int_a == Math.sqrt(3) / 2) {

			return "(-1)^k *" + angls[2] + "+ pi*k, k=Z";
		} else if (int_a == 1) {

			return angls[3] + "+ pi*k, k=Z";
		} else if (int_a == 0) {

			return "pi*k, k=Z";
		} else if (int_a == -1 / 2) {

			return "(-1)^k * -(" + neg_angls[1] + ")+ pi*k, k=Z";
		} else if (int_a == -(Math.sqrt(2) / 2)) {

			return "(-1)^k * -(" + neg_angls[2] + ")+ pi*k, k=Z";
		} else if (int_a == -(Math.sqrt(3) / 2)) {

			return "(-1)^k * -(" + neg_angls[3] + ")+ pi*k, k=Z";
		} else if (int_a == -1) {
			return "-pi/2 + pi*k, k=Z";
		} else {
			return "(-1)^k * arcsin(" + String.valueOf(int_a) + ")+pi*k, k=Z";
		}
	}

	// //////////////////cos special for display
	public String SpecialArcCos(double x) {

		if (x == 1 / 2) {
			return "+-" + angls[2] + " +  2pi*n, n=Z";

		} else if (x == Math.sqrt(2) / 2) {

			return "+-" + angls[1] + " +  2pi*n, n=Z";

		} else if (x == Math.sqrt(3) / 2) {

			return "+-" + angls[0] + " +  2pi*n, n=Z";
		} else if (x == 1) {

			return "2pi*n, n=z";
		} else if (x == 0) {

			return angls[3] + " + pi*n, n=Z";
		} else if (x == -1 / 2) {

			return "+-" + cos_neg_angls[2] + " + pi*n, n=Z";
		} else if (x == -(Math.sqrt(2) / 2)) {

			return "+-" + cos_neg_angls[1] + " +  pi*n, n=Z";
		} else if (x == -(Math.sqrt(3) / 2)) {

			return "+-" + cos_neg_angls[0] + " +  pi*n, n=Z";
		} else if (x == -1) {

			return cos_neg_angls[4] + " pi*n, n=Z";
		} else if (x > COUNT || x < (COUNT * -1)) {
			return "x = +- arccos(" + String.valueOf(x) + ")+2pi*k, k=Z";
		}
		return "ERROR";
	}

	// ////////////////////tg special for display
	public String SpecialArcTg(double x) {
		if (x == 0) {
			return "x = pi*n, n=Z";
		} else if (x == 1 / (Math.sqrt(3))) {

			return "x = " + angls[0] + "pi*n, n=Z";
		} else if (x == 1) {

			return "x = " + angls[1] + "pi*n, n=Z";
		} else if (x == Math.sqrt(3)) {

			return "x = " + angls[2] + "pi*n, n=Z";
		} else if (x == -(Math.sqrt(3))) {

			return "x = " + neg_angls[2] + "pi*n, n=Z";
		} else if (x == -(1 / (Math.sqrt(3)))) {

			return "x = " + neg_angls[0] + "pi*n, n=Z";
		} else if (x == -1) {

			return "x = " + neg_angls[5] + "pi*n, n=Z";
		} else if (x > COUNT || x < -COUNT) {

			return "does not exist";
		}
		return "ERROR";
	}
	
	// ////////////////////ctg special for display
		public String SpecialArcCtg(double x) {
			if (x == 1 / (Math.sqrt(3))) {

				return angls[2] + "pi*n, n=Z";
			} else if (x == 1) {

				return angls[1] + "pi*n, n=Z";
			} else if (x == Math.sqrt(3)) {

				return  angls[0] + "pi*n, n=Z";
			} else if (x == -(Math.sqrt(3))) {

				return neg_angls[4] + "pi*n, n=Z";
			} else if (x == -(1 / (Math.sqrt(3)))) {

				return neg_angls[6] + "pi*n, n=Z";
			} else if (x == -1) {

				return neg_angls[5] + "pi*n, n=Z";
			} else if (x > COUNT || x < -COUNT) {
				return "does not exist";
			}
			return "ERROR";
		}


	public String solvSin(double int_a) {

		if (int_a == 1 / 2) {
			return "x = (-1)^k * " + angls[0] + "+ pi*k, k=Z";

		} else if (int_a == Math.sqrt(2) / 2) {

			return "x = (-1)^k * " + angls[1] + "+ pi*k, k=Z";

		} else if (int_a == Math.sqrt(3) / 2) {

			return "x = (-1)^k *" + angls[2] + "+ pi*k, k=Z";
		} else if (int_a == 1) {

			return "x = " + angls[3] + "+ pi*k, k=Z";
		} else if (int_a == 0) {

			return "x = pi*k, k=Z";
		} else if (int_a == -1 / 2) {

			return "x = (-1)^k * -(" + neg_angls[1] + ")+ pi*k, k=Z";
		} else if (int_a == -(Math.sqrt(2) / 2)) {

			return "x = (-1)^k * -(" + neg_angls[2] + ")+ pi*k, k=Z";
		} else if (int_a == -(Math.sqrt(3) / 2)) {

			return "x = (-1)^k * -(" + neg_angls[3] + ")+ pi*k, k=Z";
		} else if (int_a == -1) {
			return "x = -pi/2 + pi*k, k=Z";
		} else {
			return "x = (-1)^k * arcsin(" + String.valueOf(int_a)
					+ ")+pi*k, k=Z";
		}

	}

	public String solvCos(double x) {

		if (x == 1 / 2) {
			return "x = +-" + angls[2] + " +  2pi*n, n=Z";

		} else if (x == Math.sqrt(2) / 2) {

			return "x = +-" + angls[1] + " +  2pi*n, n=Z";

		} else if (x == Math.sqrt(3) / 2) {

			return "x = +-" + angls[0] + " +  2pi*n, n=Z";
		} else if (x == 1) {

			return "x = 2pi*n, n=z";
		} else if (x == 0) {

			return "x =" + angls[3] + " + pi*n, n=Z";
		} else if (x == -1 / 2) {

			return "x = +-" + cos_neg_angls[2] + " + pi*n, n=Z";
		} else if (x == -(Math.sqrt(2) / 2)) {

			return "x = +-" + cos_neg_angls[1] + " +  pi*n, n=Z";
		} else if (x == -(Math.sqrt(3) / 2)) {

			return "x = +-" + cos_neg_angls[0] + " +  pi*n, n=Z";
		} else if (x == -1) {

			return "x = " + cos_neg_angls[4] + " pi*n, n=Z";
		} else if (x > COUNT || x < (COUNT * -1)) {
			return "x = +- arccos(" + String.valueOf(x) + ")+2pi*k, k=Z";
		}
		return "ERROR";
	}

	public String solvTg(double x) {
		if (x == 0) {
			return "x = pi*n, n=Z";
		} else if (x == 1 / (Math.sqrt(3))) {

			return "x = " + angls[0] + "pi*n, n=Z";
		} else if (x == 1) {

			return "x = " + angls[1] + "pi*n, n=Z";
		} else if (x == Math.sqrt(3)) {

			return "x = " + angls[2] + "pi*n, n=Z";
		} else if (x == -(Math.sqrt(3))) {

			return "x = " + neg_angls[2] + "pi*n, n=Z";
		} else if (x == -(1 / (Math.sqrt(3)))) {

			return "x = " + neg_angls[0] + "pi*n, n=Z";
		} else if (x == -1) {

			return "x = " + neg_angls[5] + "pi*n, n=Z";
		} else if (x > COUNT || x < -COUNT) {

			return "does not exist";
		}
		return "ERROR";
	}

	public String solvCtg(double x) {

		if (x == 1 / (Math.sqrt(3))) {

			return "x = " + angls[2] + "pi*n, n=Z";
		} else if (x == 1) {

			return "x = " + angls[1] + "pi*n, n=Z";
		} else if (x == Math.sqrt(3)) {

			return "x = " + angls[0] + "pi*n, n=Z";
		} else if (x == -(Math.sqrt(3))) {

			return "x = " + neg_angls[4] + "pi*n, n=Z";
		} else if (x == -(1 / (Math.sqrt(3)))) {

			return "x = " + neg_angls[6] + "pi*n, n=Z";
		} else if (x == -1) {

			return "x = " + neg_angls[5] + "pi*n, n=Z";
		} else if (x > COUNT || x < -COUNT) {
			return "does not exist";
		}
		return "ERROR";
	}

	// a*sin+b = 0
	public String solvSin_2(double a, double b) {

		double x = (b * -1) / a;

		if (x == 1 / 2) {
			return "x = (-1)^k * " + angls[0] + "+ pi*k, k=Z";

		} else if (x == Math.sqrt(2) / 2) {

			return "x = (-1)^k * " + angls[1] + "+ pi*k, k=Z";

		} else if (x == Math.sqrt(3) / 2) {

			return "x = (-1)^k *" + angls[2] + "+ pi*k, k=Z";
		} else if (x == 1) {

			return "x = " + angls[3] + "+ pi*k, k=Z";
		} else if (x == 0) {

			return "x = pi*k, k=Z";
		} else if (x == -1 / 2) {

			return "x = (-1)^k * -(" + neg_angls[1] + ")+ pi*k, k=Z";
		} else if (x == -(Math.sqrt(2) / 2)) {

			return "x = (-1)^k * -(" + neg_angls[2] + ")+ pi*k, k=Z";
		} else if (x == -(Math.sqrt(3) / 2)) {

			return "x = (-1)^k * -(" + neg_angls[3] + ")+ pi*k, k=Z";
		} else if (x == -1) {
			return "x = -pi/2 + pi*k, k=Z";
		} else if (x > COUNT || x < (COUNT * -1)) {
			return "x = (-1)^k * arcsin(" + String.valueOf(x) + ")+pi*k, k=Z";
		}
		return "ERROR";

	}

	// a*cos+b = 0
	public String solvCos_2(double a, double b) {

		double x = (b * -1) / a;

		if (x == 1 / 2) {
			return "x = +-" + angls[2] + " +  2pi*n, n=Z";

		} else if (x == Math.sqrt(2) / 2) {

			return "x = +-" + angls[1] + " +  2pi*n, n=Z";

		} else if (x == Math.sqrt(3) / 2) {

			return "x = +-" + angls[0] + " +  2pi*n, n=Z";
		} else if (x == 1) {

			return "x = 2pi*n, n=z";
		} else if (x == 0) {

			return "x =" + angls[3] + " + pi*n, n=Z";
		} else if (x == -1 / 2) {

			return "x = +-" + cos_neg_angls[2] + " + pi*n, n=Z";
		} else if (x == -(Math.sqrt(2) / 2)) {

			return "x = +-" + cos_neg_angls[1] + " +  pi*n, n=Z";
		} else if (x == -(Math.sqrt(3) / 2)) {

			return "x = +-" + cos_neg_angls[0] + " +  pi*n, n=Z";
		} else if (x == -1) {

			return "x = " + cos_neg_angls[4] + " pi*n, n=Z";
		} else if (x > COUNT || x < (COUNT * -1)) {
			return "x = +- arccos(" + String.valueOf(x) + ")+pi*k, k=Z";
		}
		return "ERROR";

	}

	// a*tg+b = 0
	public String solvTg_2(double a, double b) {

		double x = (b * -1) / a;
		if (x == 0) {
			return "x = pi*n, n=Z";
		} else if (x == 1 / (Math.sqrt(3))) {

			return "x = " + angls[0] + "pi*n, n=Z";
		} else if (x == 1) {

			return "x = " + angls[1] + "pi*n, n=Z";
		} else if (x == Math.sqrt(3)) {

			return "x = " + angls[2] + "pi*n, n=Z";
		} else if (x == -(Math.sqrt(3))) {

			return "x = " + neg_angls[2] + "pi*n, n=Z";
		} else if (x == -(1 / (Math.sqrt(3)))) {

			return "x = " + neg_angls[0] + "pi*n, n=Z";
		} else if (x == -1) {

			return "x = " + neg_angls[5] + "pi*n, n=Z";
		} else if (x > COUNT || x < -COUNT) {

			return "does not exist";
		}
		return "ERROR";
	}

	// a*ctg+b = 0
	public String solvCtg_2(double a, double b) {
		double x = (b * -1) / a;

		if (x == 1 / (Math.sqrt(3))) {

			return "x = " + angls[2] + "pi*n, n=Z";
		} else if (x == 1) {

			return "x = " + angls[1] + "pi*n, n=Z";
		} else if (x == Math.sqrt(3)) {

			return "x = " + angls[0] + "pi*n, n=Z";
		} else if (x == -(Math.sqrt(3))) {

			return "x = " + neg_angls[4] + "pi*n, n=Z";
		} else if (x == -(1 / (Math.sqrt(3)))) {

			return "x = " + neg_angls[6] + "pi*n, n=Z";
		} else if (x == -1) {

			return "x = " + neg_angls[5] + "pi*n, n=Z";
		} else if (x > COUNT || x < -COUNT) {
			return "does not exist";
		}
		return "ERROR";
	}

	// sin(x/a)=b
	public String solvSin_3(double a, double b) {
		if (b == 1 / 2) {
			return "x = (-1)^k * " + a + " * " + angls[0] + " + " + a
					+ " * pi*k, k=Z";

		} else if (b == Math.sqrt(2) / 2) {

			return "x = (-1)^k * " + a + " * " + angls[1] + "+" + a
					+ " * pi*k, k=Z";

		} else if (b == Math.sqrt(3) / 2) {

			return "x = (-1)^k * " + a + " * " + angls[2] + " + " + a
					+ " * pi*k, k=Z";
		} else if (b == 1) {

			return "x = " + a + " * " + angls[3] + "+" + a + "* pi*k, k=Z";
		} else if (b == 0) {

			return "x = " + a + " * pi*k, k=Z";
		} else if (b == -1 / 2) {

			return "x = (-1)^k * -(" + String.valueOf(a * -1) + " * "
					+ neg_angls[1] + ") + " + a + " * pi*k, k=Z";
		} else if (b == -(Math.sqrt(2) / 2)) {

			return "x = (-1)^k * -(" + String.valueOf(a * -1) + " * "
					+ neg_angls[2] + ") + " + a + " * pi*k, k=Z";
		} else if (b == -(Math.sqrt(3) / 2)) {

			return "x = (-1)^k * -(" + a + " * " + neg_angls[3] + ") + " + a
					+ " * pi*k, k=Z";
		} else if (b == -1) {
			return "x =" + String.valueOf(a * -1) + " + " + "pi/2 +" + a
					+ " * pi*k, k=Z";
		} else {
			return "x = (-1)^k * arcsin(" + String.valueOf(b * a) + ") + " + a
					+ " * pi*k, k=Z";
		}
	}

	// cos(x/a)=b
	public String solvCos_3(double a, double b) {
		if (b == 1 / 2) {
			return "x = +-" + String.valueOf(a) + " * " + angls[2] + " + "
					+ String.valueOf(a * 2) + "pi*n, n=Z";

		} else if (b == Math.sqrt(2) / 2) {

			return "x = +-" + String.valueOf(a) + " * " + angls[1] + " + "
					+ String.valueOf(a * 2) + " pi*n, n=Z";

		} else if (b == Math.sqrt(3) / 2) {

			return "x = +-" + String.valueOf(a) + " * " + angls[0] + " + "
					+ String.valueOf(a * 2) + "pi*n, n=Z";
		} else if (b == 1) {

			return "x = " + String.valueOf(a) + "pi*n, n=z";
		} else if (b == 0) {

			return "x =" + String.valueOf(a) + " * " + angls[3] + " + "
					+ String.valueOf(a * 2) + " + pi*n, n=Z";
		} else if (b == -1 / 2) {

			return "x = +-" + String.valueOf(a * -1) + " * " + cos_neg_angls[2]
					+ " + " + String.valueOf(a * 2) + " + pi*n, n=Z";
		} else if (b == -(Math.sqrt(2) / 2)) {

			return "x = +-" + String.valueOf(a * -1) + " * " + cos_neg_angls[1]
					+ " + " + String.valueOf(a * 2) + " +  pi*n, n=Z";
		} else if (b == -(Math.sqrt(3) / 2)) {

			return "x = +-" + String.valueOf(a * -1) + " * " + cos_neg_angls[0]
					+ " + " + String.valueOf(a * 2) + " +  pi*n, n=Z";
		} else if (b == -1) {

			return "x = " + String.valueOf(a * -1) + " * " + cos_neg_angls[4]
					+ " + " + String.valueOf(a * 2) + " pi*n, n=Z";
		} else {
			return "x = +- arccos(" + String.valueOf(a * b) + ")"
					+ String.valueOf(a * 2) + "+pi*k, k=Z";
		}
	}

	// tg(x/a)=b
	public String solvTg_3(double a, double b) {

		if (b == 0) {
			return "x =" + a + " * pi*n, n=Z";
		} else if (b == 1 / (Math.sqrt(3))) {

			return "x = " + a + " * " + angls[0] + a + " * " + "pi*n, n=Z";
		} else if (b == 1) {

			return "x = " + a + " * " + angls[1] + a + " * " + "pi*n, n=Z";
		} else if (b == Math.sqrt(3)) {

			return "x = " + a + " * " + angls[2] + a + " * " + "pi*n, n=Z";
		} else if (b == -(Math.sqrt(3))) {

			return "x = " + a + " * " + neg_angls[2] + a + " * " + "pi*n, n=Z";
		} else if (b == -(1 / (Math.sqrt(3)))) {

			return "x = " + a + " * " + neg_angls[0] + a + " * " + "pi*n, n=Z";
		} else if (b == -1) {

			return "x = " + a + " * " + neg_angls[5] + a + " * " + "pi*n, n=Z";
		} else if (b > COUNT || b < -COUNT) {

			return "does not exist";
		}
		return "ERROR";
	}

	// Ctg(x/a)=b
	public String solvCtg_3(double a, double b) {

		if (b == 1 / (Math.sqrt(3))) {

			return "x = "+a+"*" + angls[2] +" + "+a+ " * pi*n, n=Z";
		} else if (b == 1) {

			return "x = "+a+"*" +  angls[1] +" + "+a+ " * pi*n, n=Z";
		} else if (b == Math.sqrt(3)) {

			return "x = " +a+"*" +  angls[0] +" + "+a+ " * pi*n, n=Z";
		} else if (b == -(Math.sqrt(3))) {

			return "x = " +a+"*" +  neg_angls[4] +" + "+a+ " * pi*n, n=Z";
		} else if (b == -(1 / (Math.sqrt(3)))) {

			return "x = " +a+"*" +  neg_angls[6] +" + "+a+ " * pi*n, n=Z";
		} else if (b == -1) {

			return "x = " +a+"*" + neg_angls[5] +" + "+a+ " * pi*n, n=Z";
		} else if (b > COUNT || b < -COUNT) {
			return "does not exist";
		}
		return "ERROR";
	}

}
