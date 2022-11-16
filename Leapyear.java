package com.bridgelab.day1;
import java.util.Scanner;
public class leapyear {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("year:");
		double year = num.nextDouble();
		boolean leap = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			} else
				leap = true;
		} else
			leap = false;
		if (leap) {
			System.out.println("leapyear");
		} else {
			System.out.println("not a leapyear");
		}
	}
}
