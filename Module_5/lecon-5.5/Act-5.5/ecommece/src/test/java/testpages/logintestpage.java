package testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logintestpage {
	WebDriver driver;
	By txt_email = By.xpath("//input[@class='form-control']");
	By txt_password = By.xpath("//input[@class='form-control js-child-focus js-visible-password']");
	By btn_login = By.xpath("//button[@id='submit-login']");
	By text= By.xpath("/html/body/main/section/div/div/section/section/section/div/ul/li");
	
	public logintestpage(WebDriver driver) {
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
	public void checktext() {
		driver.findElement(text).isDisplayed();
	}
}

