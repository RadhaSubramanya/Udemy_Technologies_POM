package ObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page 
{
WebDriver driver;
public Login_Page(WebDriver driver)
{
	this.driver = driver;
}
By userNameTextField = By.xpath("//input[@id='username']");
By passwordTextField = By.xpath("//input[@id='password']");
By signInButton = By.xpath("//button[text()='Sign in']");

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
}
