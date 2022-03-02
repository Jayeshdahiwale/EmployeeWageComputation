package com.bridgelabz;

public class Application {
    static final int WAGE_PER_HOUR=20;
    static final int FULL_DAY_HOUR=8;
    static final int PARTIAL_DAY_HOUR=4;
	
	public static void main(String[] args) {
	System.out.println("Welcome to employee wage computation program.");
	
	

	
	int a= (int)Math.floor(Math.random()*10)%3;
	switch(a) {
	case 1:
		System.out.println("Employee is present");
		
		System.out.println("Daily Wage :Rs."+FULL_DAY_HOUR * WAGE_PER_HOUR);
		break;
	
	case 2:
		System.out.println("Part Time Employee is present");
		System.out.println("Daily Wage :Rs."+PARTIAL_DAY_HOUR * WAGE_PER_HOUR);
		break;
		
	
	
	default:
		System.out.println("Employee is absent");
		break;
	}
	
	
}
}
