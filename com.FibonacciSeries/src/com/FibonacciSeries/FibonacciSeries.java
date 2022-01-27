package com.FibonacciSeries;

import java.util.*;
public class FibonacciSeries {
	public static void main (String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int count=sc.nextInt();		
		int a=0,b=1,c=0,i;
		System.out.println(a+" "+b);
		
		for(i=2;i<count;++i){
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
		
	}
}
