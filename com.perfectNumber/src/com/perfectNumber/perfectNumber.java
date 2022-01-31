package com.perfectNumber;

import java.util.*;

public class perfectNumber {
	public static void main (String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number=");
		int perfectnumber=sc.nextInt();	
		int sumOfDivisor=0;
		for (int i=1;i<=perfectnumber/2;i++){
			if(perfectnumber%i==0){
				sumOfDivisor=sumOfDivisor+i;
			}
		}
		if(sumOfDivisor==perfectnumber){
			System.out.println(perfectnumber + " is a perfect number");
		}
		else
			System.out.println(perfectnumber + " is not a perfect number");
	}
}
