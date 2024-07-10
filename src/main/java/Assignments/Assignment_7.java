package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://echoecho.com/htmlforms09.htm");
           

		List<WebElement> chckbx = driver.findElements(By.xpath("//td[@class='table8']//input"));

		  System.out.println("Before clicking---------------------------------");
	        for (WebElement radioBtn : chckbx) {
	            System.out.println("Radio Button - Visibility: " + radioBtn.isDisplayed());
	            System.out.println("Radio Button - Enabled: " + radioBtn.isEnabled());
	            System.out.println("Radio Button - Selected: " + radioBtn.isSelected());
	        }
	        
	        
	        
	        if (chckbx.get(1).isSelected()) {
	        	chckbx.get(0).click();
	    		chckbx.get(2).click();
	        }
	    
	        System.out.println("\n\nAfter clicking---------------------------------");
	        for (WebElement radioBtn : chckbx) {
	            System.out.println("Radio Button - Visibility: " + radioBtn.isDisplayed());
	            System.out.println("Radio Button - Enabled: " + radioBtn.isEnabled());
	            System.out.println("Radio Button - Selected: " + radioBtn.isSelected());
	        }

	       
//	        driver.quit();
	    }

        
	}


