package DAY_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class ValidatingRadioBTN {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        WebElement check1 = driver.findElement(By.partialLinkText("new account"));
        check1.click();

        
        List<WebElement> gender = driver.findElements(By.xpath("html/body/center/form/div/table[2]/tbody/tr[24]/td[3]/input"));

       
        System.out.println("Before clicking---------------------------------");
        for (WebElement radioBtn : gender) {
            System.out.println("Radio Button - Visibility: " + radioBtn.isDisplayed());
            System.out.println("Radio Button - Enabled: " + radioBtn.isEnabled());
            System.out.println("Radio Button - Selected: " + radioBtn.isSelected());
        }

     
        if (!gender.get(1).isSelected()) {
            gender.get(1).click();
        }

       
        System.out.println("\n\nAfter clicking---------------------------------");
        for (WebElement radioBtn : gender) {
            System.out.println("Radio Button - Visibility: " + radioBtn.isDisplayed());
            System.out.println("Radio Button - Enabled: " + radioBtn.isEnabled());
            System.out.println("Radio Button - Selected: " + radioBtn.isSelected());
        }

       
        driver.quit();
    }
}