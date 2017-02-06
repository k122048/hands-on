package com.sami.mohsin;


public class SecondMax {

	
	public static void main(String[] args) {
		int a[] = {5,4,6,9,8,1};
		int highest = 0;
		int secondHighest = 0;
		
		for (int i = 0; i < a.length; i++) {

		    // If we've found a new highest number...
		    if (a[i] > highest) {

		        // ...shift the current highest number to second highest
		        secondHighest = highest;

		        // ...and set the new highest.
		        highest = a[i];
		    } else if (a[i] > secondHighest)
		    {
		        // Just replace the second highest
		        secondHighest = a[i];
		    }
		}
		
		System.out.println(highest + " " + secondHighest);
		

       }
}
        



