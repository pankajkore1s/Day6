package com.reversenumber;

import java.util.*;

public class reversenumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number=");
		int number=sc.nextInt();
		int reversed = 0;
		while(number != 0) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number/= 10;
		}

		System.out.println("Reversed Number: " + reversed);
	}
}
