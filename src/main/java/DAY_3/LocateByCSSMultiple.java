package DAY_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCSSMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/imghp?hl=en&authuser=0&ogbl");
		

		driver.findElement(By.cssSelector("textarea[class='gLFyf'][id='APjFqb']")).sendKeys("Virat Kohli",Keys.ENTER);
		
		
		
		
	}

}
