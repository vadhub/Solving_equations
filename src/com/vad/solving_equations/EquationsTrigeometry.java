package com.vad.solving_equations;

public class EquationsTrigeometry {
	String[] angls = { "pi/6", "pi/4", "pi/3", "pi/2", "pi" };

	String[] neg_angls = { "7pi/6", "5pi/4", "4pi/3", "3pi/2", "11pi/6",
			"7pi/4", "5pi/3" };

	String[] cos_neg_angls = { "5pi/6", "3pi/4", "2pi/3" };

	private int COUNT = 1;

	public String slovSin(int a) {

		if (a == 1 / 2) {
			return "x = (-1)^k * " + angls[0] + "+ pi*k, k=Z";

		} else if (a == Math.sqrt(2) / 2) {

			return "x = (-1)^k * " + angls[1] + "+ pi*k, k=Z";

		} else if (a == Math.sqrt(3) / 2) {

			return "x = (-1)^k *" + angls[2] + "+ pi*k, k=Z";
		} else if (a == 1) {

			return "x = " + angls[3] + "+ pi*k, k=Z";
		} else if (a == 0) {

			return "x = pi*k, k=Z";
		} else if (a == -1 / 2) {

			return "x = (-1)^k * -(" + neg_angls[1] + ")+ pi*k, k=Z";
		} else if (a == -(Math.sqrt(2) / 2)) {

			return "x = (-1)^k * -(" + neg_angls[2] + ")+ pi*k, k=Z";
		} else if (a == -(Math.sqrt(3) / 2)) {

			return "x = (-1)^k * -(" + neg_angls[3] + ")+ pi*k, k=Z";
		} else if (a == -1) {
			return "x = -pi/2 + pi*k, k=Z";
		} else if (a > COUNT || a< (COUNT * -1)) {
			return "x = (-1)^k * arcsin(" + a + ")+pi*k, k=Z";
		}
		return null;
	}

	public String slovCos(int a) {

		if (a == 1 / 2) {
			return "x = +-" + angls[2] + " 2pi*n, n=Z";

		} else if (a == Math.sqrt(2) / 2) {

			return "x = +-" + angls[1] + " 2pi*n, n=Z";

		} else if (a == Math.sqrt(3) / 2) {

			return "x = +-" + angls[0] + " 2pi*n, n=Z";
		} else if (a == 1) {

			return "x = 2pi*n, n=z";
		} else if (a == 0) {

			return "x =" + angls[3] + "pi*n, n=Z";
		} else if (a == -1 / 2) {

			return "x = +-" + cos_neg_angls[2] + " pi*n, n=Z";
		} else if (a == -(Math.sqrt(2) / 2)) {

			return "x = +-" + cos_neg_angls[1] + " pi*n, n=Z";
		} else if (a == -(Math.sqrt(3) / 2)) {

			return "x = +-" + cos_neg_angls[0] + " pi*n, n=Z";
		} else if (a == -1) {
			return "x = " + cos_neg_angls[4] + " pi*n, n=Z";
		} else if (a > COUNT || a < (COUNT * -1)) {
			return "x = +- arccos(" + a + ")+pi*n, sn=Z";
		}
		return null;
	}

}
