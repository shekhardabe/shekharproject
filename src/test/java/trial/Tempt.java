package trial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt 
{
	public static void main(String[]ags) throws InterruptedException
	{
		//smoke Test
		// Browser Launch
		System.setProperty("webdriver.chrome.driver", "C:\\Automation support\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		
		//open Application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Enter username
		driver.findElementByXPath("//*[@name='username']").sendKeys("Admin");
		//Enter pass
		driver.findElementByXPath("//*[@name='password']").sendKeys("admin123");
		//click on login button
		driver.findElementByXPath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']").click();
		//click on admin
		driver.findElementByXPath("(//*[@class='oxd-main-menu-item'])[1]").click();
		//click on add button
		driver.findElementByXPath("//*[@class='oxd-icon bi-plus oxd-button-icon']").click();
		//click on user role dropdown
		driver.findElementByXPath("(//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]").click();
		//select css
		driver.findElementByXPath("//*[text()='ESS']").click();
		//Employe name
		driver.findElementByXPath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']").click();
		//dropdown
		driver.findElementByXPath("//*[@placeholder='Type for hints...']").sendKeys("Odis  Adalwin");
		//
		driver.findElementByXPath("(//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]").click();
		//username
		driver.findElementByXPath("(//*[@class='oxd-input oxd-input--active'])[2]").sendKeys("minds");
		//password
		driver.findElementByXPath("(//*[@type='password'])[1]").sendKeys("Shekhar@123");
		//confirm pass
		driver.findElementByXPath("(//*[@type='password'])[2]").sendKeys("Shekhar@123");
		
	   
	    
	    
	      
	    
		
		
		
	}	
}
