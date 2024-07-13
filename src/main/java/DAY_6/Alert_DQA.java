package DAY_6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_DQA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demoqa.com/alerts");
	
//		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();

				
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)","");
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(6000);
		Alert alt = driver.switchTo().alert();
		
		alt.sendKeys("Divyam");
		System.out.println(alt.getText());
		alt.accept();
	}

}
