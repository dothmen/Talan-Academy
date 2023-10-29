package testpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class updatepage {
	WebDriver driver;
	
	By btn_information= By.xpath("//i[contains(text(),'')]");
	By txt_firstname=  By.xpath("//input[@class='form-control']");
	By txt_password= By.xpath("//input[@class='form-control js-child-focus js-visible-password']");
	By btn_message= By.xpath("//input[@name='customer_privacy']");
	By btn_confidentiality= By.xpath("//input[@name='psgdpr']");
	By btn_save=By.xpath("//button[@type='submit']");
	By txt_error= By.xpath("/html/body/main/section/div/div/section/section/aside/div/article/ul/li");

	public updatepage (WebDriver driver) {
		this.driver = driver;
	}
	
    public void clickoninformation() {
    	driver.findElement(btn_information).click();
    }
    public void userClearsTextField() {
    	driver.findElement(txt_firstname).clear();
    }
    
    public void writesnewfirstname(String newfirstname) {
    	driver.findElement(txt_firstname).sendKeys(newfirstname);
    }
    public void writesPassword(String Password) {
    	driver.findElement(txt_password).sendKeys(Password);
    }
    
    public void clicktopicmessage() {
    	driver.findElement(btn_message).click();
    }
    
    public void clicktopicconfidentiality() {
    	driver.findElement(btn_confidentiality).click();
    }
    public void clickonsavebutton() {
    	driver.findElement(btn_save).click();
    }
    public void checkerrortext() {
    	driver.findElement(txt_error).isDisplayed();
    }
}
