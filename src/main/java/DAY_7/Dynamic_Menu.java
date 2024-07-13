package DAY_7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.istqb.in/");
		List<WebElement> lst = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/nav[1]/ul[1]/li"));

		System.out.println(lst.size());
		for (WebElement webElement : lst) {
			System.out.println(webElement.getText());
		}
		driver.close();
	}

}
