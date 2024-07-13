package Assignments;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Assignment_8 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
//		ChromeOptions opt = new ChromeOptions();
//		opt.addExtensions(new File("C:\\Users\\Lenovo\\Downloads\\Stands AdBlocker - Chrome Web Store 2.1.21.0.crx"));
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.id("firstName")).sendKeys("Divyam");
		driver.findElement(By.id("lastName")).sendKeys("Chaudhari");
		driver.findElement(By.id("userEmail")).sendKeys("divyamc9");
		
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"))
				.click();
		
		driver.findElement(By.id("userNumber")).sendKeys("9511623290");
		
		driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("subjectsInput")).sendKeys("Hindi");
		Thread.sleep(5000);
		driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
		
		WebElement uploadElement = driver.findElement(By.id("//*[@id=\"uploadPicture\"]"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("\"C:\\Users\\Lenovo\\OneDrive\\Desktop\\Screenshot 2024-07-12 125953.png\"");

        // check the "I accept the terms of service" check box
       // driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        //driver.findElement(By.name("send")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Pune");
		
		
	}

}
