package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement check1 = driver.findElement(By.partialLinkText(" new account"));

		check1.click();
		
		driver.findElement(By.name("name73ebff9b")).sendKeys("Divyam Chaudhari");
		driver.findElement(By.name("login73ebff9b")).sendKeys("Divyam");
		driver.findElement(By.name("passwd73ebff9b")).sendKeys("Pass123!");
		driver.findElement(By.name("confirm_passwd73ebff9b")).sendKeys("Pass123!");
		driver.findElement(By.name("altemailb94e18a0")).sendKeys("Pass123!");
		driver.findElement(By.name("mobno73ebff9b")).sendKeys("Pass123!");
		
		
}
	}