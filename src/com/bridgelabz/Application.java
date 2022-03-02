package com.bridgelabz;

public class Application {
    static final int WAGE_PER_HOUR=20;
    static final int FULL_DAY_HOUR=8;
    static final int PARTIAL_DAY_HOUR=4;
	static final int MAX_WORKING_DAYS=20;
	public static void main(String[] args) {
	System.out.println("Welcome to employee wage computation program.");
	
	int monthlyWage=0;
    int days=1;
	while(days<=20) {
		
		int a= (int)Math.floor(Math.random()*10)%3;
		
		switch(a) {
		
		case 1:
			System.out.println("Employee is present");
			int dailyWage=FULL_DAY_HOUR * WAGE_PER_HOUR;
			System.out.println("Daily Wage :Rs."+dailyWage);
			monthlyWage=monthlyWage+dailyWage;
			break;
		
		case 2:
			System.out.println("Part Time Employee is present");
			int partialDailyWage=PARTIAL_DAY_HOUR * WAGE_PER_HOUR;
			System.out.println("Daily Wage :Rs."+partialDailyWage);
			monthlyWage=monthlyWage+partialDailyWage;
			break;
			
		
		
		default:
			System.out.println("Employee is absent");
			break;
		
		}
		days++;
		
	}
	System.out.println("Total monthly wage :Rs."+monthlyWage);
	
	
}
}
