package com.sami.mohsin;

public class InfoQuestion {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a[] = {1,2,1,3,2,1,4,4,5,4,6,7,6,1};
	int count =  0 ; 
	int countEven = 0;
	int countOdd = 0;
	int counterOdd = 0;
	for( int i = 0 ; i <= a.length-1;i++)
	{
		if( a[i] % 2 == 0)
		{
			for(int j = 0 ; j < i ; j++)
			{
				if( a[i] == a[j] )
				{
					countEven++;
				}
				
		
				
				
			}
		
			if(countEven > 0 )
			{
				
				
				countEven = 0;
			}
			else
			{
			count++;
			}
		}
		else
		{
			for(int j = 0 ; j < i ; j++)
			{
				if( a[i] == a[j] )
				{
					countOdd++;
				}
				
		
				
				
			}
		
			if(countOdd > 0 )
			{
				
				
				countOdd = 0;
			}
			else
			{
			counterOdd++;
			}
			
			
		}
		
	}
	
	System.out.println("count even: "+ count+" count Odd: "+counterOdd);
	
	}

}
