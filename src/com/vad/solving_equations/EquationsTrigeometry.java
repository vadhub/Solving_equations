package com.vad.solving_equations;

public class EquationsTrigeometry {
	String[] angls = { "pi/6", "pi/4", "pi/3", "pi/2", "pi" };

	String[] neg_angls = { "7pi/6", "5pi/4", "4pi/3", "3pi/2", "11pi/6",
			"7pi/4", "5pi/3" };

	String[] cos_neg_angls = { "5pi/6", "3pi/4", "2pi/3" };

	public String slovSin(int a) {

		if (a == 1 / 2) {
			return "x = (-1)^k " + angls[0] + " piK, k=z";

		} else if (a == Math.sqrt(2) / 2) {

			return "x = (-1)^k " + angls[1] + " piK, k=z";

		} else if (a == Math.sqrt(3) / 2) {

			return "x = (-1)^k " + angls[2] + " piK, k=z";
		} else if (a == 1) {

			return "x = " + angls[3] + " 2piK, k=z";
		} else if (a == 0) {

			return "x = piK, k=z";
		} else if (a == -1 / 2) {

			return "x = (-1)^k -" + neg_angls[1] + " piK, k=z";
		} else if (a == -(Math.sqrt(2) / 2)) {

			return "x = (-1)^k -" + neg_angls[2] + " piK, k=z";
		} else if (a == -(Math.sqrt(3) / 2)) {

			return "x = (-1)^k -" + neg_angls[3] + " piK, k=z";
		} else if (a == -1) {
			return "x = pi/2 + 2piK, k=z";
		}
		return null;
	}

}
