package weekdayassignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class SampleCodeSel {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

}