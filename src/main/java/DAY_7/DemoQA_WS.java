package DAY_7;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA_WS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://demoqa.com/browser-windows");
//		driver.findElement(By.id("tabButton")).click();
		driver.findElement(By.xpath("//*[@id=\"windowButton\"]")).click();		
		
		Set<String> win = driver.getWindowHandles();
		Iterator <String> i = win.iterator();
		String win1 = i.next();
		System.out.println("First window title: "+ driver.getTitle());
		String win2 = i.next();
		driver.switchTo().window(win2);
		System.out.println("Second window title: "+ driver.getTitle());
		
		
		driver.quit();
	}

}
