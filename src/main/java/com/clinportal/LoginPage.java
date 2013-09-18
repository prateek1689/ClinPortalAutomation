/**
 * 
 */
package com.clinportal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



/**
 * @author prateek
 *
 */
public class LoginPage {
	
	 WebDriver driver;
	    @FindBy(how = How.ID, using = "txtloginName")
	    private WebElement loginID;
	    @FindBy(how = How.ID, using = "txtPassword")
	    private WebElement passworD;
	    @FindBy(how = How.ID, using = "btnSubmit")
	    private WebElement loginButton;

	    
	    public LoginPage(WebDriver driver) {
		this.driver = driver;
	    }

	    // Method for locating login field
	    public void enterLogin(String login) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginID.sendKeys(login);

	    }

	    // Method for locating password field
	    public void enterPassword(String password) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		passworD.sendKeys(password);
	    }

	    // Method for locating submit button
	    public void clickLoginButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginButton.click();

	    }

	    // Method for login to clinportal app
	    public LoginPage login(String login, String password) {
		enterLogin(login);
		enterPassword(password);
		clickLoginButton();
		return PageFactory.initElements(driver, LoginPage.class);
	    }


}
