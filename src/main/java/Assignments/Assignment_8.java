package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment_8 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
//		ChromeOptions opt = new ChromeOptions();
//		opt.addExtensions(new File("C:\\Users\\Lenovo\\Downloads\\Stands AdBlocker - Chrome Web Store 2.1.21.0.crx"));
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
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

		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Pune");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[contains(text(),'Select City')]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@id='submit']")).submit();
		
		
	}

}
