package Assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("Divyam");
		driver.findElement(By.id("userEmail")).sendKeys("Divyam@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Pune");
		driver.findElement(By.id("permanentAddress")).sendKeys("Nashik");
		driver.findElement(By.id("submit")).click();


	}

}