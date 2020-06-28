package com.syntax.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task {

	public static void main(String[] args) {

		List<Exception> list = getAllExceptions();
		//System.out.println(list.size());

		Iterator<Exception> eit = list.iterator();
		while (eit.hasNext()) {
//			String message = eit.next().getMessage();
//			System.out.println(message);
			eit.next().printStackTrace();
		}
	}

	public static List<Exception> getAllExceptions() {
		List<Exception> exceptionList = new ArrayList<>();

		// 1 object of exception type
		int[] array = { 1, 2, 3 };
		try {
			System.out.println(array[4]);
		} catch (ArrayIndexOutOfBoundsException aoe) {
			exceptionList.add(aoe);
		}

		// 2 object of exception type
		try {
			Object ob = new Double(50);
			Integer i = (Integer) ob;
		} catch (ClassCastException e) {
			exceptionList.add(e);
		}

		// 3 object of exception type
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			exceptionList.add(ae);
		}

		// 4 object of exception type
		try {
			int[] negArray = new int[-1];
		} catch (NegativeArraySizeException ne) {
			exceptionList.add(ne);
		}

		return exceptionList;
	}
}
