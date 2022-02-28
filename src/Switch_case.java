import java.util.Scanner;
public class Switch_case {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
        System.out.println("Enter any one of the command (Attendance/Daily_Employee_Wage/Add_Employee) : ");
        String text = input.nextLine();
        switch(text) {
        case "Attendance":
        	int min = 0;  
    		int max = 1;  
    		
    		//Generate random int value from 0 to 1   
    		
    		int b = (int)(Math.random()*(max-min+1)+min);  
    		if(b==0) {
    			System.out.println("Employee is Absent");
    		}
    		else {
    			System.out.println("Employee is present");
    		}
        	break;
        case "Daily_Employee_Wage":
        	int wage_per_hour=20;
    		int work_hour=8;
    		int daily_wage= wage_per_hour * work_hour;
    		System.out.println("The daily wage is Rs. " + daily_wage );
        	break;
        case "Add_Employee":
        	Scanner input1= new Scanner(System.in);
    		System.out.println("Add the name of employee :");
    		String name=input1.nextLine();
    		int part_time_hour=8;
    		int wage_per_hour1=20;
    		int wage=part_time_hour * wage_per_hour1;
    		System.out.println("Name of employee is " + name + " and his salary is Rs. "+ wage);
        	break;
        default:
        	System.out.println("Command not recognized");
        	break;
        }
	}

}
