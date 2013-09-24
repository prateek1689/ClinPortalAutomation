/**
 * 
 */
package com.clinportal.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.clinportal.AddUserDetails;
import com.clinportal.AdminData;
import com.clinportal.LoginPage;

/**
 * @author kuldeep
 * 
 */
public class AdminDataTest extends Browser {
	private static final Logger logger = LoggerFactory.getLogger(AdminDataTest.class);
	private static String login = "kmatharasi@path.wustl.edu";
	private static String pass = "Master6";
	//private String actualTitle = "";
	
	String email ="xyz2@gmail.com";
	String lname = "jan";
	String streetName = "200";
	String number = "1234567890";
	String conemailId = "xyz2@gmail.com";
	String name = "abc";
	String cityName = "xyz";
	String zipcode = "452009";
	String phoneNo = "1234567890";
	
	String commMessage= "Hi";
	
	WebDriver driverAdminData;

	@Test
	public void testAdminData() {
		driverAdminData = driver;
		System.out.println("@@@@@@@@@@@@@@@@@@@@:" + driverAdminData);
		LoginPage loginPage = PageFactory.initElements(driverAdminData,
				LoginPage.class);
		loginPage.login(login, pass);
		
		AdminData adminData = PageFactory.initElements(driverAdminData, AdminData.class);
		logger.info("admindata:-" + driverAdminData.getTitle());
		adminData.adminData();
		
		AddUserDetails addUserDetails = PageFactory.initElements(driverAdminData, AddUserDetails.class);
		addUserDetails.fillUserDetails(email, lname, streetName, number, conemailId, name, cityName, zipcode, phoneNo, commMessage);
		

	}

}
