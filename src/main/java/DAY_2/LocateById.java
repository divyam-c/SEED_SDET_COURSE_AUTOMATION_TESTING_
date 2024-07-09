package DAY_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateById {


		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

			driver.findElement(By.id("login1")).sendKeys("Divyam");
			driver.findElement(By.id("password")).sendKeys("ABC@123");
			Thread.sleep(5000);
			driver.close();
			
			
		}
}