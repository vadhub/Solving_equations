package com.vad.solvingequations;

public class EquationsTrigeometry {
	String[] angls = { "pi/6", "pi/4", "pi/3", "pi/2", "pi" };

	String[] neg_angls = { "7pi/6", "5pi/4", "4pi/3", "3pi/2", "11pi/6",
			"7pi/4", "5pi/3" };

	String[] cos_neg_angls = { "5pi/6", "3pi/4", "2pi/3" };

	private int COUNT = 1;

	public String solvSin(int x) {

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
			return "x = (-1)^k * arcsin(" + x + ")+pi*k, k=Z";
		}
		return "ERROR";
	}

	public String solvCos(int x) {

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
		}
		return "ERROR";
	}

	public String solvTg(int x) {
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
			
			return "x = " + neg_angls[1] + "pi*n, n=Z";
		}
		return "ERROR";
	}

}
