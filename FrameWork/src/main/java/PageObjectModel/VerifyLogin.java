package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Utility.ExcelUtil;
import Utility.Screenshot;

public class VerifyLogin{
	@Test
	public void validlLogin(){
	WebDriver d= BrowserFactory.Browserconfig("Chrome");
	
	LoginPage log=PageFactory.initElements(d,LoginPage.class);
	
	ExcelUtil e= new ExcelUtil();
	//e.getExcelData(0, 1, 0);
	
	
	log.LogintoFB("neha","sahuu");
	
	
	Screenshot.Screen("Facebook");
	
	}
	
}
