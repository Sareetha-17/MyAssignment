package weekdayassignment;

public class IsPrime {

	public static void main(String[] args) {
		int number =7;
		int count=0;
		for (int i=1;i<=number/2;i++) {
			if(number%i==0)
			{
				count++;				
			}
			}
			
			if (count>1)
			{
				System.out.println(" Not a Prime number ");
			}
			else
			{
				System.out.println("prime Number" );
			}
			
		}

	}


