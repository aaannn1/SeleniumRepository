package com.ebay.DataDrivenFrameworkPages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ebay.DataDrivenFramework.VerifyLogin.TC001_VerifyLogin;
@Test
public class SignOn {
	
static String projectLocation = System.getProperty("user.dir");
	
	
	
	
	WebDriver driver;
	
	public SignOn(WebDriver driver) {
		
		this.driver=driver;
	}
	@FindBy(xpath="//input[@name='userName']")
	
	public WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	
	public WebElement password;
	
@FindBy(xpath="//input[@name='login']")
	
	public WebElement login;

public void clickLoginButton()
{
	login.click();
}
	

}
