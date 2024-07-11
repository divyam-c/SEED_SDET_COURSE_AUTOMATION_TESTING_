package DAY_5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Validating_MultiDD {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://output.jsbin.com/osebed/2");
		
//		driver.findElement(By.partialLinkText("Create Account")).click();
		
		WebElement ddmlist = driver.findElement(By.id("fruits"));
		
		Select fruit = new Select(ddmlist);
		List<WebElement> fddl = fruit.getOptions();
		
		//1 To check no. of fruits in dd		
				System.out.println("no of fruits: "+ fddl.size());
		//2 To print names of fruits
		int i=0;
		for(WebElement f : fddl) {
			System.out.println(i+ "."+ f.getText());
			i++;
		}
		
		//3 Select by visible text
		fruit.selectByVisibleText("Apple");
		
		
		//4.Select by Index
		fruit.selectByIndex(1);
		
		
		
	}
}
