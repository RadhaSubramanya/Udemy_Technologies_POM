package ObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_PageFactory 
{
WebDriver driver;
public Login_Page_PageFactory(WebDriver driver)
{
	this.driver = driver;
	//Initialize page factory
	PageFactory.initElements(driver, this);
}
/*
By userNameTextField = By.xpath("//input[@id='username']");
By passwordTextField = By.xpath("//input[@id='password']");
By signInButton = By.xpath("//button[text()='Sign in']");

*Instead of this declaration , we use PAGE FACTORY ANNOTATIONS
*/

@FindBy(xpath="//input[@id='username']")
WebElement userNameTextField;

@FindBy(xpath="//input[@id='password']")
WebElement passwordTextField;

@FindBy(xpath="//button[text()='Sign in']")
WebElement signInButton;

/*
public WebElement UserNameTextField()
{
	return driver.findElement(userNameTextField);
}

public WebElement PasswordTextField()
{
	return driver.findElement(passwordTextField);
}
public WebElement SignInButton()
{
	return driver.findElement(signInButton);
}
* Instead of writing driver.findElement, we write the below code
*/

public WebElement UserNameTextField()
{
	return userNameTextField;
}

public WebElement PasswordTextField()
{
	return passwordTextField;
}
public WebElement SignInButton()
{
	return signInButton;
}
}
