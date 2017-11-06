package com.vad.solvingequtions.controler;

import java.util.ArrayList;

public class BasicNumberOperations {
	public double square(double a) {
		return a * a;
	}

	public String deleteSpace(String s){
		s = s.replace(" ", "");
		return s;
	}
	
	//change
	public String changeSymbol(String ast){
		int pass = ast.indexOf("=");

		if (pass == -1) {
		} else {
			ast = ast.replace('=', '-');
		}
		return ast;
	}
	
	//adding numbers into arraylist
	public ArrayList<Double> addInt(String ast, ArrayList<Double> intList){
		String[] arrStirng = ast.split(" ");

		for (String s : arrStirng) {
			try {
				intList.add(Double.parseDouble(s));
			} catch (Exception e) {
				intList.add(0.0);
			}
		}

		return intList;
		
	}
	
	public ArrayList<Double> squreNum(String ast, ArrayList<Double> sqList){
		String[] arrStirng = ast.split(" ");

		for (String s : arrStirng) {
			try {
				sqList.add(Double.parseDouble(s));
			} catch (Exception e) {
				sqList.add(0.0);
			}
		}

		return sqList;
		
	}

	// current x
	public int numX(String str) {
		int num = 0;
		int numSub = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == 'x') {

				if (Character.isDigit(str.charAt(i - 1))) {
					numSub = numSub	+ Character.getNumericValue(str.charAt(i - 1));
				} else {
					num++;
				}
			}
		}

		return numSub + num;
	}
	// delete '0'
	public ArrayList<Double> deleteZ(ArrayList<Double> intList){
		
	for (int i = 0; i < intList.size(); i++) {

		if (intList.get(i) == 0) {
			intList.remove(i);
		}
	}
	return intList;
}

	// detect symbols in string
		public ArrayList<Double> detectInteger(String str) {
			deleteSpace(str);
			ArrayList<Double> intList = new ArrayList<Double>();
			int l =str.length();

			String ast = "";

			for (int i = 0; i < str.length(); i++) {

				char c = str.charAt(i);
				if (c == '/') {
					ast += " " + c;
				} else if (c == '-') {
					ast += " " + c;
				} else if (c == '+') {
					ast += " " + c;
				} else if (c == '=') {
					ast += " " + c;
				}else if(c=='('){
					if(str.charAt(i-1)=='t'){
						squreNum(ast, intList);
						l = l - 1;
					}
				}else {
					ast += c;
				}
			}
			changeSymbol(ast);
			addInt(ast, intList);
			deleteZ(intList);
			System.out.println(ast);

			return intList;
		}

	// fulfill math operations
	public double mathOperations(String str1) {
		double summ = 0;
		
		ArrayList<Double> listNumbers = detectInteger(str1);
		
		for (int i = 0; i < listNumbers.size(); i++) {
			summ = summ + listNumbers.get(i);
		}
		
		try {
			return (summ * -1) / numX(str1);
		} catch (Exception ex) {
			return summ;
		}
	}

}
