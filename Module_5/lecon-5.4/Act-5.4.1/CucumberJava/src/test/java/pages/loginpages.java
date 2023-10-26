package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class loginpages {
	WebDriver driver;
	By txt_email = By.name("email");
	By txt_password = By.name("password");
	By btn_login = By.xpath("//span[@class='EvhBA']");
	
	public loginpages(WebDriver driver) {
		this.driver = driver ;
	}

	public void enterusername(String email) {
	 driver.findElement(txt_email).sendKeys(email);
	}

	public void enterpassword(String password) {
		driver.findElement(txt_password).sendKeys(password);

	}

	public void clicklogin() {
		driver.findElement(btn_login).click();
	}

	public void loginValidUser(String email, String password) {
		driver.findElement(txt_email).sendKeys(email);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}
}
