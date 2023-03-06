package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("amazon");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manothini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sathiyanathan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Shivanya");
		driver.findElement(By.name("departmentName")).sendKeys("ECE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("All Is Well");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("manojinimano@gmail.com");
		WebElement stateDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(stateDropDown);
		state.selectByVisibleText("New York");
		Thread.sleep(3000);
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Yet to decide");
		Thread.sleep(3000);
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("manorithi");
		Thread.sleep(3000);
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(3000);
		String title2 = driver.getTitle();
		System.out.println("The tilte is" + title2);
		 

	}

}
