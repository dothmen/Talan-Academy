package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

public class loginpages {
	WebDriver driver;
	By txt_emeil = By.name("email");
	By txt_password = By.name("password");
	By btn_login = By.className("connexion");

	public void enterusername(String email) {
	 driver.findElement(txt_emeil).sendKeys(email);
	}
	 public loginpages (WebDriver driver) {
	 
	 }
	 
 

	public void enterpassword(String password) {
		driver.findElement(txt_password).sendKeys(password);

	}

	public void clicklogin() {
		driver.findElement(btn_login).click();
	}

	public void loginValidUser(String email, String password) {
		driver.findElement(txt_emeil).sendKeys(email);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}
}
