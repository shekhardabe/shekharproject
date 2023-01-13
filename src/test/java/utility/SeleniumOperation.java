package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperation 
{
	public static ChromeDriver driver=null;
	public static void browserlaunch(Object[]inputParameters)
	{
			String strBrowserName=(String)inputParameters[0];
			String strExe=(String)inputParameters[1];
			System.setProperty(strBrowserName, strExe);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	}
	public static void openApplication(Object[]inputParameters)
	{
		String path=(String)inputParameters[0]; 
		driver.get(path); 
	
	}
	public static void clickOnElement(Object[]inputParameters)
	{
		String path=(String)inputParameters[0];
		driver.findElement(By.xpath(path)).click();
	
	
	}
	public static void moveToElement(Object[]inputParameters)
	{
		String xpath=(String)inputParameters[0];
		Actions act=new Actions(driver);											                        
		WebElement xyz=driver.findElement(By.xpath(xpath));                
		act.moveToElement(xyz).build().perform();
	}
	public static void sendTextOnUi(Object[]inputParameters)
	{
		String path=(String)inputParameters[0];
		String text=(String)inputParameters[1];
		driver.findElement(By.xpath(path)).sendKeys(text);
	}
		public static void main(String[]args) throws InterruptedException
		{

			      // Broswer launch
			         Object [] input1=new Object[2];
					   input1[0]="webdriver.chrome.driver";
					   input1[1]="C:\\Automation support\\chromedriver.exe";
					  SeleniumOperation.browserlaunch(input1);
					  
		         // Open Application
					  Object [] input2= new Object[2];
					  input2[0]="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
					  SeleniumOperation.openApplication(input2);
					 
					  //Enter username
					   Object [] input3= new Object[2];
			                    input3[0]="//*[@name='username']";
			                    input3[1]="Admin";
			            SeleniumOperation.sendTextOnUi(input3); 
			
			          //Enter Pass
						 Object [] input4= new Object[2];
				           input4[0]="//*[@name='password']";
				           input4[1]="admin123";
				         SeleniumOperation.sendTextOnUi(input4);
			
	          //clickOn login
	        Object [] input5= new Object[2];
		 input5[0]="//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']";
		 SeleniumOperation.clickOnElement(input5);
		               
		               Thread.sleep(5000);
		               // click on admin
		               Object [] input6= new Object[2];
				         input6[0]="(//*[@class='oxd-main-menu-item'])[1]";
				         SeleniumOperation.clickOnElement(input6);
                	// click on add button
				  Object [] input7= new Object[2];
			         input7[0]="//*[@class='oxd-icon bi-plus oxd-button-icon']";	        
			  SeleniumOperation.clickOnElement(input7);
	
	
		}

}
