package com.chalange;

public class Area {
	
	//declare a member variables and initialization
	final double pi=3.142;
	
	//declare a method  area 
	public double area(double radius)
	{
		if(radius>=0)
		{
			return pi*radius*radius;//retun the readus of the circle
		}
		else
		{
			return -1.0;
		}
	}
	public double area(int length,int width)
	{
		if(length>=0&&width>=0)
		{
			return length*width;//retun the readus of the circle
		}
		else
		{
			return -1.0;
		}
	}
}
