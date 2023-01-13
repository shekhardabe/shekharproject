package trial;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	public static void main(String[] args) 
	{
		//Browser launch
		System.setProperty("webdriver.chrome.driver", "C:\\Automation support\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
         //open application
		driver.get("https://www.thelallantop.com/news/post/brazil-bolsonaro-supporters-break-into-brazilian-congress-and-presidential-palace");
		//click on 
		driver.findElementByXPath("//*[@class='icon-cat-home']").click();
		
	}
	
	
	
	
	
	
	

}
