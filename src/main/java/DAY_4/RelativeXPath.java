package DAY_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPath {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("divyamc");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pass@123");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			

		}

	}
