package Tricentis;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Truck {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.sparkstone.co.nz/sampleapp/101/index.php");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"nav_truck\"]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"make\"]/option[6]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"engineperformance\"]")).sendKeys("456");
		
		driver.findElement(By.xpath("//*[@id=\"dateofmanufacture\"]")).sendKeys("07/18/2024");
		
		driver.findElement(By.xpath("//*[@id=\"numberofseats\"]/option[6]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"fuel\"]/option[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"payload\"]")).sendKeys("123");
		
		driver.findElement(By.xpath("//*[@id=\"totalweight\"]")).sendKeys("1243");
		
		driver.findElement(By.xpath("//*[@id=\"listprice\"]")).sendKeys("27520");
		
		driver.findElement(By.xpath("//*[@id=\"licenseplatenumber\"]")).sendKeys("MH15NA0004");
		
		driver.findElement(By.xpath("//*[@id=\"annualmileage\"]")).sendKeys("150");
		
		driver.findElement(By.xpath("//*[@id=\"nextenterinsurantdata\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Divyam"); 
		
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Chaudhari");
		
		driver.findElement(By.xpath("//*[@id=\"birthdate\"]")).sendKeys("09/04/2001");
		
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"streetaddress\"]")).sendKeys("Nashik");

		driver.findElement(By.xpath("//*[@id=\"country\"]/option[106]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("422101");
		
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Nashik");

		driver.findElement(By.xpath("//*[@id=\"occupation\"]/option[6]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span")).click();

		driver.findElement(By.xpath("//*[@id=\"website\"]")).sendKeys("www.google.in");
		
		driver.findElement(By.xpath("//*[@id=\"nextenterproductdata\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"startdate\"]")).sendKeys("08/20/2024");
		
		driver.findElement(By.xpath("//*[@id=\"insurancesum\"]/option[3]")).click();

		driver.findElement(By.xpath("//*[@id=\"damageinsurance\"]/option[3]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[2]/span")).click();

		driver.findElement(By.xpath("//*[@id=\"nextselectpriceoption\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"quote-sub-container\"]/div/div[1]/div/div[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"nextsendquote\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9511623290");

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("abcdef");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Diu@123");

		driver.findElement(By.xpath("//*[@id=\"confirmpassword\"]")).sendKeys("Diu@123");
		
		driver.findElement(By.xpath("//*[@id=\"Comments\"]")).sendKeys("NA");
		
		driver.findElement(By.xpath("//*[@id=\"sendemail\"]")).click();
		
		Thread.sleep(10000);
		
		File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("E:\\Seed Infotech\\SEED_SDET_COURSE_AUTOMATION_TESTING\\SEED_SDET_COURSE_AUTOMATION_TESTING\\src\\main\\java\\Tricentis\\insurancetruck.png"));
		
		
		driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();

		
		
		
		
		
		
	}

}
