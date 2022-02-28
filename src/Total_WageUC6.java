
public class Total_WageUC6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour=0;
		int day=0;
		int hourly_wage=20;
		int daily_wage=160;
		int hours=100;
		do {
			int num=hours/8;
			if(num>=1) {
				hours=hours-8;
				hour=hour+8;
				day=day+1;
				
			}
			else {
				int remaining_hours=hours%8;
				hour=hour+remaining_hours;
				
			}
			
		}
		while(day !=20 && hour !=100);
		if(hour==100) {
			System.out.println("The salary of person is Rs. "+ hour * hourly_wage);
			
		}
		else {
			System.out.println("The salary of person is Rs. "+ day * daily_wage);
		}
				

	}

}
