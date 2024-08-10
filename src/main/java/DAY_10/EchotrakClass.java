package DAY_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EchotrakClass {

	WebDriver driver;
	
	public void userName(String un) {
		driver.findElement(By.name("txtCustomerID")).sendKeys(un);;
	}
	
	public void password(String pass) {
		driver.findElement(By.name("txtPassword")).sendKeys(pass);;
	}
	
	public void clickonSignInButton() {
		driver.findElement(By.name("Butsub")).click();;
	}
}
