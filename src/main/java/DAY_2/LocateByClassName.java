package DAY_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		WebElement search = driver.findElement(By.className("gLFyf"));

		search.sendKeys("Divyam Chaudhari");
		search.sendKeys(Keys.ENTER);
//		search.submit();
}
}