package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	
	WebDriver driver;
	By btn_connexion=By.xpath("/html/body/div[4]/header/div[1]/div[2]/div[3]/div[1]/div/ul/li[1]/a");
	By txt_email = By.xpath("//input[@type='text']");
	By txt_password = By.xpath("//input[@type='password']");
	By btn_validate = By.xpath("//button[@type='submit']");
	
	
	public loginpage(WebDriver driver) {
		this.driver = driver ;
	}
	public void clickconnexion() {
		driver.findElement(btn_connexion).click();
	}

	public void enterEmail(String Email) {
	 driver.findElement(txt_email).sendKeys(Email);
	}
	
	public void enterPassword(String Password) {
		driver.findElement(txt_password).sendKeys(Password);

	}
	
	public void clickvalidatebutton() {
		driver.findElement(btn_validate).click();
	}
	

	
}
