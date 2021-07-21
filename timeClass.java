package com.chalange;
//create a class as demo
public class timeClass {
//declare a parameterized  getdurationstring method with 
	public static String getDurationString(int minutes,int seconds)
	{
		int hours=0;
		
		if(minutes>=0&&(seconds>=0&&seconds<=59))
		{
			hours=minutes/60;
			minutes=minutes%60;
			
			return "houres:"+hours+"  "+"minutes :"+minutes+"  "+"Seconds :"+seconds;
		}
		else
		{
			return "Invalid value";
		}
	}
	public static String getDurationString(int seconds)
	{
		int minutes=0;
		if(seconds>=0)
		{
			minutes=seconds/60;
			seconds=seconds%60;
			return "minutes :"+minutes+"  "+"Seconds :"+seconds;
			
		}
		else
		{
			return "invalid value";
		}
	}
	
	
}