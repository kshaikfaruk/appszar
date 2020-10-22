package preproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	@org.testng.annotations.Test
	 public void launchingbrowser(){
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		   driver.get("https://www.google.com");
		   driver.manage().window().maximize();
		    driver.findElement(By.name("q")).sendKeys("fb");
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    WebElement element= driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]"));
		    element.click();
		   
		   
		   
		   
		   
	}
	
	
}
