package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class creatpage {
	WebDriver driver;
	By txt_name= By.name("firstname");
	By txt_lastName= By.name("lastname");
	By txt_Motdepasse= By.name("password");
	By txt_email= By.name("email");
	By txt_datedenaissance= By.name("birthday");
	By btn_creatonaccount=By.xpath("//button[@type='submit']");
	By text = By.xpath("//*[@id=\"products\"]/div[1]/strong");
	
	public creatpage(WebDriver driver) {
		this.driver = driver ;
	}
	public void entername(String name) {
		 driver.findElement(txt_name).sendKeys(name);
		}

	public void enterlastName(String lastName) {
	 driver.findElement(txt_lastName).sendKeys(lastName);
	}
	public void enterMotdepasse(String Motdepasse) {
		driver.findElement(txt_Motdepasse).sendKeys(Motdepasse);
	}
	public void enteremail(String email) {
		driver.findElement(txt_email).sendKeys(email);
	}
	
	public void enterdatedenaissance(String datedenaissance) {
		driver.findElement(txt_datedenaissance).sendKeys(datedenaissance);
	}
	
	public void clickcreatonaccount() {
		driver.findElement(btn_creatonaccount).click();
	
	}
	public void checkText() {
		driver.findElement(text).isDisplayed();
	
	}
}
	
		
	
	
	

