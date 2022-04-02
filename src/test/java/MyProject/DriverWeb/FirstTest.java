package MyProject.DriverWeb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.simplilearn.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			
			WebElement LoginLink = driver.findElement(By.linkText("Log in"));
			LoginLink.click();
			
			WebElement Email = driver.findElement(By.name("user_login"));
			Email.sendKeys("abc@xyz.com");
			
			WebElement Password = driver.findElement(By.id("password"));
			Password.sendKeys("Pqrsd@12345");
			
			WebElement RememberMe = driver.findElement(By.className("rememberMe"));
			RememberMe.click();
			
			WebElement LoginBtn = driver.findElement(By.name("btn_login"));
			LoginBtn.click();
			
			WebElement ErrorMsg = driver.findElement(By.id("msg_box"));
			String ActMsg = ErrorMsg.getText();
			String ExpMsg = "The email or password you have entered is invalid.";
			
					if (ActMsg.equals(ExpMsg)) {
						System.out.println("Test Passed");
						
					} else {
						System.out.println("Test Failed");
					}
			
			
			List<WebElement> Links = driver.findElements(By.tagName("a"));
			System.out.println("Total Number of Links in the web page: "+Links.size());
			
				for (int i = 0; i < Links.size(); i++) {
					
					System.out.println("Href is: "+Links.get(i).getAttribute("href"));
					
				}
			
			
			driver.close();

	}

}
