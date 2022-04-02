package MyProject.DriverWeb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignupTest {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			WebElement SignupPage = driver.findElement(By.xpath("//*[text()='Create New Account']"));
			SignupPage.click();
			
			WebElement DOBDay = driver.findElement(By.id("day"));
			Select ddDOBDay = new Select(DOBDay);
			ddDOBDay.selectByVisibleText("20");
			
			WebElement DOBMnth = driver.findElement(By.id("month"));
			Select mmDOBMnth = new Select(DOBMnth);
			mmDOBMnth.selectByVisibleText("Jan");
			
			WebElement DOBYear = driver.findElement(By.id("year"));
			Select yyDOBYear = new Select(DOBYear);
			yyDOBYear.selectByVisibleText("1995");
			
			
			List<WebElement> Months = driver.findElements(By.xpath("//select[@id='month']/option"));
			
			for (int i = 0; i < Months.size(); i++) {
				
				System.out.println(Months.get(i).getText());
				
			}
			//.............Hard coded.............
//			WebElement FemaleRadio = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
//			FemaleRadio.click();
			
			
			
			//........Dynamic Approach...........
			String GenderVal = "Male";
			String GenderXpath = "//label[text()='" + GenderVal + "']/following-sibling::*";
			
			WebElement GenderRadio = driver.findElement(By.xpath(GenderXpath));
			GenderRadio.click();
			
			//driver.close();
	
		}

}
