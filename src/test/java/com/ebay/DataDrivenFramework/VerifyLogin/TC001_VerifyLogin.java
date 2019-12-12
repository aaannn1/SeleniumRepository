package com.ebay.DataDrivenFramework.VerifyLogin;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.DataDrivenFramework.TestBase.TestBase;
import com.ebay.DataDrivenFrameworkPages.SignOn;

public class TC001_VerifyLogin extends TestBase{
	
static String projectLocation = System.getProperty("user.dir");
	
	static String configPath = projectLocation + "/log4j.properties";
	
	public static final Logger log = Logger.getLogger(TC001_VerifyLogin.class.getName());
	
	@BeforeClass
	public static void getLogger()
	{
		System.out.println("configuration");
		
		PropertyConfigurator.configure(configPath);
	}

	
	@Test
	public void validLogin() {
		
		SignOn sp = PageFactory.initElements(driver, SignOn.class);
		sp.userName.sendKeys("aaannn1");
		sp.password.sendKeys("aniruddha");
		sp.login.click();
	}
public void testLogger() {
		
		log.info("testcase Passed");
		log.warn("please check the warning");
		log.info("testcase 3 passed");
		log.info("testcase 4 failed");
		log.error("critical error");
	}
	

}
