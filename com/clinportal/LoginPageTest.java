package com.clinportal;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;



public class LoginPageTest {

	private static final Logger logger = LoggerFactory
		    .getLogger(LoginPageTest.class);
	    private static String login = "kmatharasi@path.wustl.edu";
	    private static String pass = "Master6";

	    private String actualTitle = "";
	    WebDriver driverLogin;
	    
	  
	    @Test
	    public void testLoginSuccess() {
		driverLogin = Browser.driver;
	    	
		logger.info("testLogin() driver : = > " + driverLogin);
		actualTitle = driverLogin.getTitle();

		String expectedTitle = "Partner Login";
		LoginPage loginPage = PageFactory.initElements(driverLogin,
			LoginPage.class);
		loginPage.login(login, pass);

		try {
		    Thread.sleep(900);
		} catch (InterruptedException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}

		if (actualTitle.contentEquals(expectedTitle)) {
		    logger.info("Title is correct");
		} else {
		    logger.info("Title is not correct");
		}

		logger.info("Name1:" + driverLogin.getTitle());
		Assert.assertEquals(driverLogin.getTitle(), "Partner Login");
	    }*/

}
