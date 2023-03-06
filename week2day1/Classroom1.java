package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

//***	Load salesforce application: 
// https://login.salesforce.com/
// -Load facebook.com in ChromeBrowser and EdgeBrowse


public class Classroom1 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://login.salesforce.com/");

		EdgeDriver driver1 = new EdgeDriver();
		driver1.get("https://www.facebook.com/");
		driver1.get("https://login.salesforce.com/");
		

	
	
	}
	


}
