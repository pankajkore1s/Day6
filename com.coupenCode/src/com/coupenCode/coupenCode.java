package com.coupenCode;

public class coupenCode {
	public static void main(String[] args) 
	{
		char[] characters="abcdefghijklmnopqrstuvwxyz123456789".toCharArray();
		int max=100000000;
		int random=(int) (Math.random()*max);	
		StringBuffer stringB=new StringBuffer();
		
		while (random>0)
		{
			stringB.append(characters[random % characters.length]);
			random /= characters.length;
		}

		String couponCode=stringB.toString();
		System.out.println("Coupon Code: "+couponCode);	
	}

}
