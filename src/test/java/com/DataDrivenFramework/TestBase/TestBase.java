package com.DataDrivenFramework.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {
	public WebDriver driver;
	@BeforeTest
	public void initializeThis() throws IOException {
		
		
		Properties prop = new Properties();
		String projection = System.getProperty("user.dir");
		String configPath = projection+"/Resources/data.properties";
		
		//System.out.println(configPath);
		
		FileInputStream file = new FileInputStream(configPath);
		//loading the file
		prop.load(file);
		String browserName = prop.getProperty("browser");
		String url = prop.getProperty("url");
		int waitTime = Integer.parseInt(prop.getProperty("implicitWait"));
		
		if(browserName.equalsIgnoreCase("chrome"))
		{	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aniruddha\\Desktop\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aniruddha\\Desktop\\Automation\\Drivers\\chromedriver_win32\\firefox.exe");
			driver= new FirefoxDriver();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aniruddha\\Desktop\\Automation\\Drivers\\chromedriver_win32\\edge.exe");
			driver= new EdgeDriver();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
		}
		
		
	}
	
	@AfterTest
	public void endThis() {
//		try {
//			Thread.sleep(6000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.quit();
	}

}
