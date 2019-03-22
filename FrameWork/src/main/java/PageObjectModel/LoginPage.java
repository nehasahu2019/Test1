package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	@FindBy(id="email")
	private WebElement user_name;


	@FindBy(name="pass")
	private WebElement user_password;
		
	@FindBy(how=How.XPATH, using ="//*[@id='u_0_8']") 
	private WebElement submit_button;

	public void LogintoFB(String id,String pwd){
	
		user_name.sendKeys(id);
		user_password.sendKeys(pwd);
		submit_button.click();
	}
	
	
}
