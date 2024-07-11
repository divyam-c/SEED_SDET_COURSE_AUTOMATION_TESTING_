package DAY_5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Sol");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//text[normalize-space()='Solapur']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Kol");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//text[@class='placeHolderMainText'][normalize-space()='Kolhapur(Maharashtra)']"))
				.click();

	}

}
