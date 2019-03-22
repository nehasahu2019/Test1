package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;

import Utility.ExcelUtil;
import Config.*;

public class BrowserFactory {

	public static WebDriver d;

	
	public static WebDriver Browserconfig(String browserName){
		
		if(browserName.equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.chrome.driver","./Jar/chromedriver.exe");
		
		 d = new ChromeDriver();
		 d.get(Constant.url);
		 d.manage().window().maximize();
		}
		
		else if(browserName.equalsIgnoreCase("FireFox")){
			System.setProperty("webdriver.FireFox.marionette","./Jar/geckodriver.exe");
			
			 d = new FirefoxDriver();
			// d.get(url);
			 d.manage().window().maximize();
		}
			else if(browserName.equalsIgnoreCase("IE")){
				System.setProperty("webdriver.ie.driver","./Jar/geckodriver.exe");
				
				 d = new InternetExplorerDriver();
				// d.get(url);
				 d.manage().window().maximize();
				
			}
		return d;	
			
		}
	}
	
	

