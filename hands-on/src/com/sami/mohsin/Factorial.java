package com.sami.mohsin;

public class Factorial {
	
	public static int factorial(int number)
	{
		int result = 1;
		while(number > 0 )
		{
			result = result *  number;
			number--;
			
		}
		
		return result;
	}
	
	public static int recursiveFactorial(int n)
	{int result = 1 ;
		
		if(n == 0 )
		{
			return result;
			
		}
		else
		{
			result = n * recursiveFactorial(n-1);
			return result;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int number = 0 ;
         number = recursiveFactorial(10);
		System.out.println(number);
	}

}
