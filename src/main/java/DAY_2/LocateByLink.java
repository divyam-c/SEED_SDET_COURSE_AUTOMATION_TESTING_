package DAY_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		WebElement check1 = driver.findElement(By.linkText("Create a new account"));

		//WebElement check1 = driver.findElement(By.partialLinkText(" new account"));

		check1.click();

	}
	}