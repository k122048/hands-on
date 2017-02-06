package com.sami.mohsin;

public class FindRepeated {

	public static int findRepeat(int number,int[] a)
	{
		int count = 0;
		for(int  i = 0 ; i < a.length ; i++ )
		{
			if(number==a[i])
			{
				count++;
			}
			
			
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]  a = {1,2,3,4,1,6,8,9,1};
		int number = 1;
		int count = 0;
		
		count = findRepeat(number,a);
	     System.out.println(number + "repeat: " + count); 
       
	}

}
