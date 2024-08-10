package DAY_10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RediffClass {

	WebDriver driver;
	
	public void clickonSignInLink() {
		driver.findElement(By.partialLinkText("Sign")).click();
	}
	
	public void setUserName(String un) {
		driver.findElement(By.id("login1")).sendKeys(un);
		
	}
	
	public void clickonSignButton() {
		driver.findElement(By.name("proceed")).click();
	}
	
	public String handleAlert() {
		Alert alt = driver.switchTo().alert();
		String altmsg = alt.getText();
		alt.accept();
		return altmsg;
	}
}
