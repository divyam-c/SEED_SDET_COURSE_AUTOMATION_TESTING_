package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		

		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		driver.findElement(By.id("submit")).click() ;
	    
	    
	if(driver.getPageSource().contains("Logged In Successfully"))
	{
		System.out.println("Test case is pass");
	}
	else
	{
		System.out.println("Test case is fail");
	}

				

	}



	}


