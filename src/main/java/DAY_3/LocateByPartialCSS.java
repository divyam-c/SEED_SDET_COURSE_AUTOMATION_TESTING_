package DAY_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByPartialCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement check1 = driver.findElement(By.partialLinkText(" new account"));

		check1.click();
		
		driver.findElement(By.cssSelector("input[name^='name']")).sendKeys("Divyam Chaudhari");
		driver.findElement(By.cssSelector("input[name^='login']")).sendKeys("Divyam");
		driver.findElement(By.cssSelector("input[name*='passwd']")).sendKeys("Pass123!");
		driver.findElement(By.cssSelector("input[name^='confirm_passwd']")).sendKeys("Pass123!!!");
		driver.findElement(By.cssSelector("input[name^='altemail']")).sendKeys("Divyamc");
		driver.findElement(By.cssSelector("input[name^='mobno']")).sendKeys("9512634387");
		
		
		
	}

}
