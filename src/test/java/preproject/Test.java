package preproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	@org.testng.annotations.Test
	 public void launchingbrowser(){
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		   driver.get("https://www.google.com");
		     
		   
		   
		   
	}
	
	
}
