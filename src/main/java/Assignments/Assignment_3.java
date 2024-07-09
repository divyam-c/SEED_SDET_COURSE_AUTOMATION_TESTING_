package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		

		driver.findElement(By.id("txtCustomerID")).sendKeys("Divyam Chaudhari");
		driver.findElement(By.id("txtPassword")).sendKeys("Divyam");
		driver.findElement(By.id("Butsub")).click() ;
	    
	    
	if(driver.getPageSource().contains("Invalid Username/Password"))
	{
		System.out.println("Test case is pass");
	}
	else
	{
		System.out.println("Test case is fail");
	}

				

	}

}
