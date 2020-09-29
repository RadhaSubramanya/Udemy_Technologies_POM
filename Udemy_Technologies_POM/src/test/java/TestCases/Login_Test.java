package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ObjectRepositories.Dashboard_Page;
import ObjectRepositories.Login_Page;

public class Login_Test {
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://autoapp.citronglobal.com/");
		driver.manage().window().maximize();
		Login_Page loginObject = new Login_Page(driver);
		loginObject.UserNameTextField().sendKeys("Radha");
		loginObject.PasswordTextField().sendKeys("radha1");
		loginObject.SignInButton().click();
		Thread.sleep(5000);

		// dashboard actions in same class but dashboard objects are read from different
		// page object class
		Dashboard_Page dashboardObject = new Dashboard_Page(driver);
		dashboardObject.hamburgerIcon().click();
		Thread.sleep(5000);

		Actions action = new Actions(driver);
		WebElement marketingButtonElement = dashboardObject.marketingButton();
		action.moveToElement(marketingButtonElement).perform();
		Thread.sleep(5000);

		dashboardObject.campaignsButton().click();
		Thread.sleep(5000);
		driver.quit();
	}
}
