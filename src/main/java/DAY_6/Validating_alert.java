package DAY_6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validating_alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		
		//handling alert
		Thread.sleep(5000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	}

}
