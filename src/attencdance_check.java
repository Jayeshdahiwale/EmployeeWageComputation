
public class Random_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

	}

}
