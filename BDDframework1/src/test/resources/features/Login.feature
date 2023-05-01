Feature:Login
Scenario:Successful login with valid credentials
Given user launch Chrome browser
When user open url "https://www.nopcommerce.com/en/login"
And user enters Email as "Admin@12311" and password as "Admin@123"
And click on Login
Then Page title should be "free and Open-Source ecommeroce platform"
When user click on Logout link
Then page title should be "Get Started"
And close browser 

Feature:Login
Scenario Outline::UnSuccessful login with invalid credentials
Given user launch Chrome browser
When user open url "https://www.nopcommerce.com/en/login"
And user enters <username>and <password>
And click on Login
Then Page title should be "free and Open-Source ecommeroce platform"
When user click on Logout link
Then page title should be "Get Started"
And close browser 
Examples:
"Admin234"|"pass23"|"Admin345"|"pass2323"