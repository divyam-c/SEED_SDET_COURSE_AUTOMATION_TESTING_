package DAY_10;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EchotrakMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
        
        EchotrakClass ect = new EchotrakClass();
        ect.driver = driver;
        ect.userName("seed");
        ect.password("Pass@123");
        ect.clickonSignInButton();
	}

}
