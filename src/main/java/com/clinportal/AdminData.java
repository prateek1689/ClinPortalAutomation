package com.clinportal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdminData {
	// private static String login = "kmatharasi@path.wustl.edu";
	// private static String pass = "Master6";

	/*
	 * public static void main(String args[]) {
	 * System.setProperty("webdriver.chrome.driver",
	 * "D:/WorkSpace1/ClinPortalAutomation/src/main/resources/chromedriver.exe"
	 * ); driverLogin = new ChromeDriver();
	 * 
	 * driverLogin
	 * .get("https://clinpd3.cbmi.wucon.wustl.edu/clinportal/Login.do");
	 * 
	 * LoginPage loginPage = PageFactory.initElements(driverLogin,
	 * LoginPage.class); loginPage.login(login, pass);
	 * 
	 * driverLogin.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 * 
	 * WebElement element =driverLogin.findElement(By.xpath(
	 * "/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/em"
	 * )); //Actions actions = new Actions(driverLogin);
	 * //actions.doubleClick(element); //System.out.println(element.getText());
	 * element.click();
	 * 
	 * //driverLogin.quit();
	 */
	WebDriver driver;
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/em")
	private WebElement adminDataBtn;
	@FindBy(how = How.ID, using = "ext-gen73")
	private WebElement userTab;
	@FindBy(how = How.ID, using = "ext-gen117")
	private WebElement addUserBtn;

	public AdminData(WebDriver driver) {
		this.driver = driver;
	}

	// Method for locating admin data button
	public void adminDataBtn() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		adminDataBtn.click();

	}

	// Method for locating user tab
	public void userTab() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// WebElement selectgender = driver.findElement(By.id("gender"));
		// selectgender.sendKeys("Male");


		userTab.click();
	}

	// Method for locating add user tab
	/*public void addUserBtn() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		addUserBtn.click();

	}
*/
	public AdminData adminData() {
		adminDataBtn();
		userTab();
		//addUserBtn();
		return PageFactory.initElements(driver, AdminData.class);
	}

}
