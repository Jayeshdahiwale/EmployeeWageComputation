import java.util.Scanner;
public class Add_Employee_Wage {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Add the name of employee :");
		String name=input.nextLine();
		int part_time_hour=8;
		int wage_per_hour=20;
		int wage=part_time_hour * wage_per_hour;
		System.out.println("Name of employee is " + name + " and his salary is Rs. "+ wage);
	}

}
