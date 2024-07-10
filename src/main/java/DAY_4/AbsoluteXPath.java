package DAY_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		
		driver.findElement(By.xpath("html/body/div/div/div/div[2]/form/div/div[2]/div/div[2]/input")).sendKeys("divyamc");
		driver.findElement(By.xpath("html/body/div/div/div/div[2]/form/div/div[2]/div[2]/div[2]/div/input")).sendKeys("Pass@123");
		driver.findElement(By.xpath("html/body/div/div/div/div[2]/form/div/div[2]/div[2]/div[2]/div/input[2]")).click();
		

	}

}
