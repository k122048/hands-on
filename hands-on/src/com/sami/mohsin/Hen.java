package com.sami.mohsin;

public class Hen extends Flyable implements Bird{

	@Override
	public void makeSound() {
		System.out.println("Hen makes sound");
		// TODO Auto-generated method stub

	}
	
	@Override 
	public int getFeathers()
	{
	return feathers;
		
	}
	
	@Override
	public void flying()
	{
		System.out.println("bird can fly");
		
	}

}
