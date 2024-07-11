package DAY_5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Validating_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		
//		Thread.sleep(5000);

		driver.findElement(By.partialLinkText("Create Account")).click();
		
//		driver.findElement(By.xpath("//a[@title='Create Rediffmail Account']"));
		
		
		
		WebElement ddlist = driver.findElement(By.id("country"));
		
		Select country = new Select(ddlist);
		List<WebElement> cddl = country.getOptions();
		
		//1 To check no. of countries in dd		
				System.out.println("no of countries: "+ cddl.size());
		//2 To print names of countries
		int i=0;
		for(WebElement c : cddl) {
			System.out.println(i+ "."+ c.getText());
			i++;
		}
		
		//3. To print selected country
		System.out.println("Selected country: "+ country.getFirstSelectedOption().getText());
		
		//4 Select by visible text
		country.selectByVisibleText("Australia");
		driver.close();
		
		//5.Select by Index
		//country.selectByIndex(239);
		
		
		//6. Select by value
		//country.selectByValue(20);
		
		
	
	}

}
