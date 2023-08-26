package weekdayassignment;

public class NegativetoPositive {

	public static void main(String[] args) {
		int number = -40;
		int output=0;
		
		if(number<0)
		{
			output=number*-1;
			System.out.println(number + " is converted to "+ output);
			
		} 
		else
		{
			System.out.println("The given number is not negative number");
		}
	

	}

}
