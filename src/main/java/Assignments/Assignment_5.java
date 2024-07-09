package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		

		driver.findElement(By.className("gLFyf")).sendKeys("Pune");
		driver.findElement(By.className("gNO89b")).submit();
		
		if(driver.getCurrentUrl().contains("Pune"))
		{
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
		}
	    
	}

}
