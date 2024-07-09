package DAY_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("login")).sendKeys("Admin");
		driver.findElement(By.name("passwd")).sendKeys("Admin");
		driver.findElement(By.name("proceed")).click();
		driver.close();
	}

}
