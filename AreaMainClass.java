package com.chalange;

public class AreaMainClass {

	public static void main(String[] args) 
	{
		Area a =new Area();//create the object of area class 
		
		double result=a.area(6.3);//call the method with single parameter 
		
		double rectangle_result=a.area(12,12);//call the method with 2 parameter
		if(result>=0)
		{
			System.out.println("Area of circle is :"+result);
		}
		else
		{
			System.out.println("invalid input");
		}
		if(rectangle_result>=0)
		{
			System.out.println("Area of  is :"+rectangle_result);
		}
		else
		{
			System.out.println("invalid input");
		}
	}
		
}
