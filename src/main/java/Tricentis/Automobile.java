package Tricentis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automobile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.sparkstone.co.nz/sampleapp/101/index.php");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='main-navigation']//a[@id='nav_automobile']")).click();
		

		driver.findElement(By.xpath("//*[@id=\"make\"]/option[15]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"engineperformance\"]")).sendKeys("234");
		
		driver.findElement(By.xpath("//*[@id=\"dateofmanufacture\"]")).sendKeys("07/18/2024");
		
		driver.findElement(By.xpath("//*[@id=\"numberofseats\"]/option[6]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"fuel\"]/option[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"listprice\"]")).sendKeys("27520");
		
		driver.findElement(By.xpath("//*[@id=\"licenseplatenumber\"]")).sendKeys("MH15NA0004");
		
		driver.findElement(By.xpath("//*[@id=\"annualmileage\"]")).sendKeys("150");

		driver.findElement(By.xpath("//*[@id=\"nextenterinsurantdata\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Divyam");
		
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Chaudhari");
		
		driver.findElement(By.xpath("//*[@id=\"birthdate\"]")).sendKeys("09/04/2001");
		
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"streetaddress\"]")).sendKeys("Nashik");

		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("422101");
		
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Nashik");

		driver.findElement(By.xpath("//*[@id=\"occupation\"]/option[6]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span")).click();

		driver.findElement(By.xpath("//*[@id=\"website\"]")).sendKeys("www.google.in");
		
		driver.findElement(By.xpath("//*[@id=\"nextenterproductdata\"]")).click();

		

		

		
		

		

		
		

		
		

		
		

		
		

		

		
	}

}
