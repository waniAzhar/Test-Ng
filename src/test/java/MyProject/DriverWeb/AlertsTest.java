package MyProject.DriverWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTest {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			WebElement button1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
			button1.click();
			
			Alert alert = driver.switchTo().alert();
			alert.accept();

			
			WebElement button2 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
			button2.click();
			
			alert = driver.switchTo().alert();
			alert.dismiss();
			
			WebElement button3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
			button3.click();
			alert = driver.switchTo().alert();
			alert.sendKeys("Message");
			alert.accept();

			
	}

}
