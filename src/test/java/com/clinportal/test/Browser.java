/**
 * 
 */
package com.clinportal.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

/**
 * @author strumsoft
 * 
 */
public class Browser {

     WebDriver driver;

    @BeforeMethod
    /* The annotated method will be run before all tests in this suite have run */
    // browser is the name of parameter that we have used in xml
    @Parameters(value = { "browser" })
    /* this annotation is used to insert parameter in test */
    public void openBroswer(@Optional("IE") String browser) {
	System.out.println("inside openBroswer ===> ");
	/*
	 * Comparing the value of parameter name if this is FF then It would
	 * launch Firefox and script that would run is as follows
	 */
	if (browser.equalsIgnoreCase("FF")) {
	    System.out.println("Firefox driver would be used");
	    driver = new FirefoxDriver();
	    driver.get("https://localhost:8443/PGAdmin/identity/login");
	    driver.navigate().to(
		    "https://clinpd5.cbmi.wucon.wustl.edu/clinportal/RedirectHome.do");
	    System.out.println("driver in open browser  ==== >: " + driver);

	} else if (browser.equalsIgnoreCase("CHROME")) {
	    System.out.println("CHROME driver would be used");
	    System.setProperty("webdriver.chrome.driver",
		    "D:/WorkSpace1/ClinPortalAutomation/src/main/resources/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://clinpd5.cbmi.wucon.wustl.edu/clinportal/RedirectHome.do");
	    System.out.println("driver in open browser  ==== >: " + driver);

	} else {
	    System.out.println("IE");
	    System.setProperty("webdriver.ie.driver",
		    "D:/WorkSpace1/ClinPortalAutomation/src/main/resources/IEDriverServer.exe");
	    DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
	    caps.setCapability(
	        InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
	        true);
	    WebDriver driver = new InternetExplorerDriver(caps);
	    driver.get("https://clinpd5.cbmi.wucon.wustl.edu/clinportal/RedirectHome.do");

	    System.out.println("driver in open browser : " + driver);

	}

    }

    @AfterSuite
    /* this annotation would run once test script execution would complete */
    public void closeBrowser() {
	try {
	    driver.wait(15000);
	} catch (Exception e) {
	}
	driver.close();
	driver.quit();
    }

}