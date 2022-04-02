package MyProject.DriverWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		UserName.sendKeys("abc@xyz.com");
		WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
		Password.sendKeys("abcfrF@1234k");
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		LoginBtn.click();
		
		
		
		
		driver.close();
	}

}
