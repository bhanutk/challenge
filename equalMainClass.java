package com.chalange;

public class equalMainClass {

	public static void main(String[] args) {
		//create the object of equal class and along pass the arguments
		equal e=new equal(1,1,1);
		equal e1=new equal(1,5,-3);
		equal e2=new equal(1,1,3);
		equal e3=new equal(1,2,3);
		
		//call the methods
		e.printEqual();
		e1.printEqual();
		e2.printEqual();
		e3.printEqual();
	}

}
