package com.infosys.exceptions;

public class Exception3 {
	public static void main(String args[]) {
		try {
			// db connection
			int a[] = new int[5];// 0,1,2,3,4
			a[4] = 30 / 0;
			String s = "1234";
			int x = Integer.parseInt(s);
			System.out.println(s.length());// NPE
			// System.out.println("no error " + a[4]+" "+x);
		}

		catch (ArrayIndexOutOfBoundsException ae) {// jvm
			System.out.println("please enter valid index");
		} catch (ArithmeticException e) {
			System.out.println("dont enter zero as denominator");
		} catch (NumberFormatException e) {
			System.out.println("we cant convert string to number");
		} catch (Exception e) {
			System.out.println("unable find length of the string");
		}

		finally {
			// close db connection
			System.out.println("executes every time for closing connections");
		}

		System.out.println("remaining code  executed...");
	}
}