package DAY_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCSSGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		

//		driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Pune");
//		driver.findElement(By.className("gNO89b")).submit();
		
		driver.findElement(By.cssSelector("textarea[class='gLFyf']")).sendKeys("Divyam Chaudhari",Keys.ENTER);
		
		
		
		
	
}

	}


