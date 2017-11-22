package com.vad.solvingequtions.controler;

import java.util.ArrayList;

public class BasicNumberOperations {

	//multiplies number on itself
	public ArrayList<Double> sqrt(ArrayList<Double> sqrtInt){
		for(int i=0;i<sqrtInt.size();i++){
			sqrtInt.add(sqrtInt.get(i)*sqrtInt.get(i));
		}
		return sqrtInt;
		
	}
	
	//detect symbol "t"
			public boolean detectT(String str){
				for(int i = 0;i<str.length();i++){
					char c = str.charAt(i);
					if(c == 't'){
						return true;
					}
				}
				return false;

			}

	//method solving a*x^2 + b*x +c = 0

	public double sqSolv(ArrayList<Double> intList){
		double d = (intList.get(1))-4*intList.get(0)*intList.get(2);
		double x = ((intList.get(1)*-1)-Math.sqrt(d))/2*intList.get(0);

		if(d<0){
			return 0;
		}
			return x;
	}

	//detect symbol "^"
	public boolean sqX(String str){
		for(int i = 0;i<str.length();i++){
			char c = str.charAt(i);
			if(c == '^'){
				return true;
			}
		}
		return false;

	}	
	
	//special method for detecting symbols square the equation	
	public ArrayList<Double> sqXdetectInteger(String str) {
		deleteSpace(str);
		ArrayList<Double> intList = new ArrayList<Double>();

		String ast = "";

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			if (c == 'x') {
				ast +=" " + '1';
			} else if (c == '^') {
				ast += " " + '1';
			} else{
				ast += c;
			}
		}
		addInt(ast, intList);
		deleteZ(intList);

		return intList;
	}
	
	//deleting space symbol
	public String deleteSpace(String s) {
		s = s.replace(" ", "");
		return s;
	}

	// adding numbers into arraylist
	public ArrayList<Double> addInt(String ast, ArrayList<Double> intList) {

		int pass = ast.indexOf("=");

		if (pass == -1) {
		} else {
			ast = ast.replace('=', '-');
		}

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

	public ArrayList<Double> squreNum(String ast, ArrayList<Double> sqList) {
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
					numSub = numSub
							+ Character.getNumericValue(str.charAt(i - 1));
				} else {
					num++;
				}
			}
		}
		return numSub + num;
	}

	// delete '0'
	public ArrayList<Double> deleteZ(ArrayList<Double> intList) {

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
			} else{
				ast += c;
			}
		}
		addInt(ast, intList);
		deleteZ(intList);

		return intList;
	}

	// fulfill math operations
	public double mathOperations(String str1) {
		double summ = 0;

		ArrayList<Double> listNumbers = detectInteger(str1);
		
		if(detectT(str1) == true){
			sqrt(listNumbers);
		}

		for (int i = 0; i < listNumbers.size(); i++) {
			summ = summ + listNumbers.get(i);
		}

		if(sqX(str1) == true){
			return sqSolv(listNumbers);
		}	

		try {
			return (summ) / numX(str1);
		} catch (Exception ex) {
			return summ;
		}
	}

}
