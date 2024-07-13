package DAY_7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dynamic_Menus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.istqb.in/");
		List<WebElement> lst = driver.findElements(By.xpath("//li[@class='sp-menu-item sp-has-child']//a[normalize-space()='SPECIALIST']"));
		System.out.println(lst.size());
		
		WebElement specialist = driver.findElement(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[6]/a"));

		
		Actions mouse = new Actions(driver);
		mouse.moveToElement(specialist).perform();
		
		List<WebElement> submenus = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[6]/div[1]/div[1]/ul[1]/li"));
		
		for (WebElement webElement : submenus) {
			System.out.println(webElement.getText());
			
		}
		
		
	}

}
