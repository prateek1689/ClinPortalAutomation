/**
 * 
 */
package com.clinportal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.selenesedriver.FindElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.Selenium;

/**
 * @author kuldeep
 * 
 */
public class AddUserDetails {

	WebDriver driver;
	@FindBy(how = How.ID_OR_NAME, using = "emailAddress")
	private WebElement emailAdd;
	@FindBy(how = How.ID_OR_NAME, using = "lastName")
	private WebElement lastName;
	@FindBy(how = How.ID, using = "street")
	private WebElement street;
	@FindBy(how = How.ID, using = "statearrow")
	private WebElement state;
	@FindBy(how = How.ID, using = "countryarrow")
	private WebElement country;
	@FindBy(how = How.ID_OR_NAME, using = "faxNumber")
	private WebElement faxNumber;
	@FindBy(how = How.ID_OR_NAME, using = "departmentIdarrow")
	private WebElement department;
	@FindBy(how = How.ID_OR_NAME, using = "confirmEmailAddress")
	private WebElement conEmailAdd;
	@FindBy(how = How.ID_OR_NAME, using = "firstName")
	private WebElement firstName;
	@FindBy(how = How.ID_OR_NAME, using = "city")
	private WebElement city;
	@FindBy(how = How.ID_OR_NAME, using = "zipCode")
	private WebElement zipCode;
	@FindBy(how = How.ID_OR_NAME, using = "phoneNumber")
	private WebElement phoneNumber;
	@FindBy(how = How.ID, using = "institutionIdarrow")
	private WebElement institution;
	@FindBy(how = How.ID, using = "cancerResearchGroupIdarrow")
	private WebElement researchGroup;
	@FindBy(how = How.ID, using = "rolearrow")
	private WebElement rolearrow;
	@FindBy(how = How.ID, using = "comments")
	private WebElement comments;
	@FindBy(how = How.ID, using = "btnUserSumbit")
	private WebElement btnUserSumbit;

	public AddUserDetails(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void emailAdd(String email) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		emailAdd.sendKeys(email);
	}

	public void lastName(String lname) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		lastName.sendKeys(lname);
	}

	public void street(String streetName) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		street.sendKeys(streetName);
	}

	public void state() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		state.click();
		driver.findElement(
				By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[7]/td[3]/div/ul/li[5]"))
				.click();

		// Get the Dropdown as a Select using its name attribute
		// Select make = new Select(driver.findElement(By.id("statearrow")));

		// make.selectByVisibleText("California");
		// assertEquals("Honda", make.getFirstSelectedOption().getText());

	}

	public void country() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Select country1 = new Select(country);
		// country1.selectByVisibleText("Canada");
		country.click();
		driver.findElement(
				By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[8]/td[3]/div/ul/li[10]"))
				.click();
	}

	public void faxNumber(String number) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		faxNumber.sendKeys(number);
	}

	public void department() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		department.click();
		driver.findElement(
				By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[10]/td[3]/div/ul/li[7]"))
				.click();
	}

	public void conEmailAdd(String conemailId) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		conEmailAdd.sendKeys(conemailId);
	}

	public void firstName(String name) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		firstName.sendKeys(name);
	}

	public void city(String cityName) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		city.sendKeys(cityName);
	}

	public void zipCode(String zipcode) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		zipCode.sendKeys(zipcode);
	}

	public void phoneNumber(String phoneNo) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		phoneNumber.sendKeys(phoneNo);
	}

	public void institution() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Select insti = new Select(institution);
		// insti.selectByVisibleText("3123 Research Blvd");
		institution.click();
		driver.findElement(
				By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[9]/td[7]/div/ul/li[6]"))
				.click();
	}

	public void researchGroup() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		researchGroup.click();
		driver.findElement(
				By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[10]/td[7]/div/ul/li[4]"))
				.click();
	}

	public void role() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		rolearrow.click();
		driver.findElement(
				By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr[2]/td[3]/div/ul/li[2]"))
				.click();
	}

	public void comments(String commentMessage) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		comments.sendKeys(commentMessage);

	}

	public void btnUserSumbit() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		btnUserSumbit.click();
	}

	public AddUserDetails fillUserDetails(String email, String lname,
			String streetName, String number, String conemailId, String name,
			String cityName, String zipcode, String phoneNo, String comtMess) {

		emailAdd(email);
		lastName(lname);
		street(streetName);
		state();
		country();
		faxNumber(number);
		department();
		conEmailAdd(conemailId);
		firstName(name);
		city(cityName);
		zipCode(zipcode);
		phoneNumber(phoneNo);
		institution();
		researchGroup();
		role();
		comments(comtMess);
		btnUserSumbit();
		return PageFactory.initElements(driver, AddUserDetails.class);

	}
}
