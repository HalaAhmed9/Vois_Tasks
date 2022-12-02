package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Booking.PagesBase;

public class Login extends PagesBase {

	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private By validUserName = By.id("user-name");
	public void send_validUserName() {
	driver.findElement(validUserName).sendKeys("standard_user");	
	}
	
	private By validPassword = By.id("password");
	public void send_validPassword() {
	driver.findElement(validPassword).sendKeys("secret_sauce");
	}
	
	private By 	Btnlogin = By.id("login-button");
	public void press_Btnlogin() {
	driver.findElement(Btnlogin).click();
	}
	public void press_BtnNext() {
		// TODO Auto-generated method stub
		
	}
	
}
