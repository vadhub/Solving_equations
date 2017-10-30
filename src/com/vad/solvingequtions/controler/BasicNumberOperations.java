package com.vad.solvingequtions.controler;

import java.util.ArrayList;

public class BasicNumberOperations {

	// detect symbols in string
	public ArrayList<Integer> detectInteger(String str) {

		ArrayList<Integer> intList = new ArrayList<Integer>();

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
			} else {
				ast += c;
			}
		}
		
		System.out.println(ast);

		int pass = ast.indexOf("=");

		if (pass == -1) {
			System.out.println("not");
		} else {
			ast = ast.replace('=', '-');
		}

		String[] arrStirng = ast.split(" ");

		for (String s : arrStirng) {
			try {
				intList.add(Integer.parseInt(s));
			} catch (Exception e) {
				intList.add(0);
			}
		}

		// delete '0'
		for (int i = 0; i < intList.size(); i++) {

			if (intList.get(i) == 0) {
				intList.remove(i);
			}
		}

		return intList;

	}

	// current x
	public int numX(String str) {
		int num = 0;
		int numSub = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);			
			if (c == 'x') {
				if(Character.isDigit(str.charAt(i-1))){
					numSub =numSub + Character.getNumericValue(str.charAt(i-1));
					System.out.println(numSub);				
				}else {
					num++;
				}				
			}
		}
		
		return numSub+num;

	}

	// fulfill math operations
	public int mathOperations(String str1) {
		int summ = 0;
		ArrayList<Integer> listNumbers = detectInteger(str1);
		for (int i = 0; i < listNumbers.size(); i++) {
			summ = summ + listNumbers.get(i);
		}
		try {
			return (summ * -1) / numX(str1);
		} catch (Exception ex) {
			return summ * -1;
		}

	}

}
