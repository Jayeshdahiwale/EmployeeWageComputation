package com.bridgelabz;

public class Application {
    static final int WAGE_PER_HOUR=20;
	
	public static void main(String[] args) {
	System.out.println("Welcome to employee wage computation program.");
	int fullDayHour=8;
	
	int dailyWage=fullDayHour * WAGE_PER_HOUR;
	
	int a= (int)Math.floor(Math.random()*10)%2;
	if(a==1) {
		System.out.println("Employee is present");
		System.out.println("Daily Wage :Rs."+dailyWage);
	}
	else {
		System.out.println("Employee is absent");
	}
	
}
}
