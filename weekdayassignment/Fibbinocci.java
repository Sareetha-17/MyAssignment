package weekdayassignment;

public class Fibbinocci {

	public static void main(String[] args) {
		
				int firstNum =0;
				int secNum =1;
				int sum= 0;
				
				System.out.println("First number:" + firstNum);
				for (int i=1;i<=11;i++)
				{
					sum = firstNum+secNum;
					firstNum= secNum;
					secNum =sum;
					System.out.println(sum);
				}


			}

	}


