package DAY_8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://demoqa.com/buttons");
				
				WebElement btn1 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/button[1]"));
				WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
				WebElement btn3 = driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
	
//				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/p[3]")).getText();
//				driver.findElement(By.xpath("//p[@id='rightClickMessage']")).getText();
//				driver.findElement(By.xpath("//p[@id='doubleClickMessage']")).getText();
				
				
				Actions mouse = new Actions(driver);
				
				mouse.click(btn1).perform();
				mouse.contextClick(btn2).perform();
				mouse.doubleClick(btn3).perform();
				
				
	}

}
