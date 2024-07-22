package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class LoginPage extends BaseClass {
	
	@FindBy(name="username")
	private WebElement un;
	
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(name="//button[text()=' Login ']")
	private WebElement loginButton;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
// create associated methods of each and every object repository and without entering data
	public void loginFunctionality(String Username, String Password)
	{
		Wait.sendKeys(un, Username);
		Wait.sendKeys(pass, Password);
		
	}
	public void clickFunctionality()
	{
		Wait.elementTobeClickable(loginButton);
	}



}