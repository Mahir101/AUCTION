package dev.FIRSTGAME;

import java.util.Random;

public class Number {
	private static int A[] = new int[43];

	public static int getnum() {
		Random dice = new Random();
		int number;
		number = dice.nextInt(40);
		if(number==0)
			number++;
		while (A[number] != 0) {
			System.out.println(number);
			number++;
			//number %= 25;
		}
		return number;
	}
	public static void set(int n)
	{
		A[n]=1;
	}
}
