package com.sami.mohsin;

public class palindrome {

	public  static boolean isPalindrome(String a)
	{   boolean result = false;
	    int i = 0;
		int j = a.length()-1;
		for(int k = 0 ; k <= (a.length()/2)-1 ; k++ )
		{
			if( a.charAt(i) == a.charAt(j) )
			{
				i++;
				j--;
				result = true;
				
			}
			else
			{
				result = false;
				break;
				
				
			}
			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    String str = "abba";
	    boolean ans;
	    
	    ans = isPalindrome(str);
	    
	    if(ans == true)
	    {
	    	System.out.println("Palindrome");
	    }
		
	}

}
