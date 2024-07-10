package DAY_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement check1 = driver.findElement(By.partialLinkText(" new account"));

		check1.click();
		
		WebElement chckBox= driver.findElement(By.cssSelector("input[name^='chk_alte']"));
		
		System.out.println("Before clicking---------------------------------");
		
		System.out.println("Visiblity of checkbox: " + chckBox.isDisplayed());
		System.out.println("Check box Enable: " + chckBox.isEnabled());
		System.out.println("Check box Selected: " + chckBox.isSelected());
		
		
		if (chckBox.isSelected()== false)
			chckBox.click();
		

		System.out.println("\n\nAfter clicking---------------------------------");
		
		System.out.println("Visiblity of checkbox: " + chckBox.isDisplayed());
		System.out.println("Check box Enable: " + chckBox.isEnabled());
		System.out.println("Check box Selected: " + chckBox.isSelected());
		
		
	}

}
