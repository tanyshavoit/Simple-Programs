package com.ua.tetiana.voitovych.bigNumbers;


public class BigNumbers {
	// à is bigger than b
	public String addition(String a, String b) {
		int index_a = a.length();
		int res_1;
		int t = 0;
		String res = "";
		for (int i = b.length() - 1; i >= 0; i--) {
			index_a--;
			if (t == 0) {
				res_1 = whichNumber(a.charAt(index_a)) + whichNumber(b.charAt(i));
			} else {
				res_1 = whichNumber(a.charAt(index_a)) + whichNumber(b.charAt(i)) + 1;
				t = 0;
			}
			if (!(res_1 > 9)) {

				res = Integer.toString(res_1) + res;

			} else {
				t = 1;
				res = Integer.toString(res_1 - 10) + res;
			}
		}
		if (t == 1) {
			if (index_a == 0) {
				res = "1" + res;
			} else {
				res = a.substring(0, index_a - 1) + Integer.toString(whichNumber(a.charAt(index_a - 1)) + 1) + res;
			}
		} else {
			res = a.substring(0, index_a) + res;
		}
		return res;

	}

	public String Fibonachi(int number) {

		String res;
		if (number == 0)
			return "0";
		if (number == 1)
			return "1";
		else {
			String a = "0";
			res = "1";
			String temp;
			for (int i = 1; i < number; i++) {
				temp = res;
				res = addition(res, a);
				a = temp;

			}
		}
		return res;

	}

	public int whichNumber(char a) {
		if (a == '1') {
			return 1;
		}
		if (a == '2') {
			return 2;
		}
		if (a == '3') {
			return 3;
		}
		if (a == '4') {
			return 4;
		}
		if (a == '5') {
			return 5;
		}
		if (a == '6') {
			return 6;
		}
		if (a == '7') {
			return 7;
		}
		if (a == '8') {
			return 8;
		}
		if (a == '9') {
			return 9;
		}

		return 0;
	}
}

