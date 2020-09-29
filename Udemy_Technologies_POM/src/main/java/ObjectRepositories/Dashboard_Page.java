package ObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard_Page 
{
	WebDriver driver;
	public Dashboard_Page(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By hamburgerIcon = By.xpath("//div[@id='appnavigator']");
	By marketingButton = By.xpath("//span[contains(text(),'MARKETING')]");
	By campaignsButton = By.xpath("//span[contains(text(),'Campaigns')]");
	
	public WebElement hamburgerIcon()
	{
		return driver.findElement(hamburgerIcon);
	}
	public WebElement marketingButton()
	{
		return driver.findElement(marketingButton);
	}
	public WebElement campaignsButton()
	{
		return driver.findElement(campaignsButton);
	}
}
