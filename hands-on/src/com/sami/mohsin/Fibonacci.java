package com.sami.mohsin;

public class Fibonacci {

	public static void fibonacci(int n)
	{
		int n1 = 0;
		int n2 = 1;
		int temp = 0;
		for(int i = 2 ; i <= n ; i++)
		{
			
			temp = n1+n2;
			System.out.println(temp);
			
			n1 = n2;
			n2 = temp;
			System.out.println(temp);
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fibonacci(10);
	}

}
