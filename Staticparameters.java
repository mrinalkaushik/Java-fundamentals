package com.bridgelab.day1;

public class staticparameters { /* class with static variable */
	static int x = 15;
	static int y;

	static void func(int z) { /* static method */
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	}

	static { /* The static initialization block initializes the static variable y */
		System.out.println("Running static initialization block.");
		y = x + 7;
	}

	public static void main(String args[]) {
		func(6);
	}
}
