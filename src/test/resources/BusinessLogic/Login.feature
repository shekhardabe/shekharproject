Feature:login functionality

Background: Application open successfully
Given user open browser with "webdriver.chrome.driver" and "C:\\Automation support\\chromedriver.exe"
Given user enter url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario: Login functionality with valid credentials
When user enter "Admin" as username
When user enter "admin123" as password
When user click on login button
Then user select Admin option 