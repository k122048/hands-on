package com.sami.mohsin;

public class FindMax {
	
	public static int findMax(int[] a)
	{
		int max=Integer.MIN_VALUE;
	
		for(int  i = 0 ; i < a.length-1; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
				
			}
			
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {5,4,6,9,8,1};
	 
		int maxValue = Integer.MAX_VALUE;
		
		maxValue = findMax(a);
		
		System.out.println(maxValue);
		
	}

}
