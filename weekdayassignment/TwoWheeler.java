package weekdayassignment;

public class TwoWheeler {
	 int noOfWheels= 2;
	 short noOfMirrors =10;
	 long chassisNumber =213421435l;
	 boolean isPuncture= false;
	 String bikeName= "KTM";
	 double runningKM = 40.5;
	
	 public static void main(String[] args) {
	
		 TwoWheeler wheel = new TwoWheeler();
		 System.out.println("Bike name is "+wheel.bikeName);
		 System.out.println("Number of Two wheeler is "+wheel.noOfWheels);
		 System.out.println("Number of mirrors "+wheel.noOfMirrors);
		 System.out.println("Is Punture " +wheel.isPuncture);
		 System.out.println("Running Km "+wheel.runningKM);
		 System.out.println("Number is "+wheel.chassisNumber);
		 
		 
		 
		 

	}

}
