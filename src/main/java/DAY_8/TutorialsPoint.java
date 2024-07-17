package DAY_8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TutorialsPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		
		WebElement btn1 = driver.findElement(By.xpath("//button[normalize-space()='Click Me']"));
		//WebElement btn2 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[2]"));
		WebElement btn3 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[3]"));
		
		Actions mouse = new Actions(driver);
		

		mouse.click(btn1).perform();
		//mouse.contextClick(btn2).perform();
		mouse.doubleClick(btn3).perform();
		
		
		
	}

}
