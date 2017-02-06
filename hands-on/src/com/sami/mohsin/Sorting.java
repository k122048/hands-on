package com.sami.mohsin;

public class Sorting {

public static void bubbleSort(int a[])
{
	int temp;
	for(int i = 0 ; i < a.length ; i++ )
	{
		for(int j = 1 ; j < a.length-1 ; j++)
		{
			if(a[i] < a[j])
			{
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
				
			}
			
		}
	}
	
	for(int i = 0 ; i < a.length ; i++ )
	{
         System.out.println(i);		
	}
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {9,5,1,2,4,3,6,8,7};


bubbleSort(a);		
		
	}

}
