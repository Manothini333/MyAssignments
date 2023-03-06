package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
	
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
		
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Chumma note");
		driver.findElement(By.name("submitButton")).click();
		String toGetTitle = driver.getTitle();
		System.out.println(toGetTitle);
		

	}

}
