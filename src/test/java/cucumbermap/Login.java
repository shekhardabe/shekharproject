package cucumbermap;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumOperation;

public class Login
{
	@Given("user open browser with {string} and {string}")
	public void user_open_browser_with_and(String string, String string2)
	{ 
		Object [] input1=new Object[2];
	   input1[0]="webdriver.chrome.driver";
	   input1[1]="C:\\Automation support\\chromedriver.exe";
	  SeleniumOperation.browserlaunch(input1);  
	}

	@Given("user enter url as {string}")
	public void user_enter_url_as(String string)
	{
		 Object [] input2= new Object[2];
		  input2[0]="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		  SeleniumOperation.openApplication(input2);
	}

	@When("user enter {string} as username")
	public void user_enter_as_username(String string)
	{ 
		Object [] input3= new Object[2];
        input3[0]="//*[@name='username']";
        input3[1]="Admin";
        SeleniumOperation.sendTextOnUi(input3);   
	}

	@When("user enter {string} as password")
	public void user_enter_as_password(String string) 
	{
		Object [] input4= new Object[2];
        input4[0]="//*[@name='password']";
        input4[1]="admin123";
        SeleniumOperation.sendTextOnUi(input4);
	}

	@When("user click on login button")
	public void user_click_on_login_button()
	{
		Object [] input5= new Object[2];
		 input5[0]="//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']";
		 SeleniumOperation.clickOnElement(input5);
	}

	@Then("user select Admin option")
	public void user_select_admin_option() 
	{
		     Object [] input6= new Object[2];
	         input6[0]="(//*[@class='oxd-main-menu-item'])[1]";
	         SeleniumOperation.clickOnElement(input6);
	}
	
}
