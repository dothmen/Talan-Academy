package testpages;

import org.apache.xerces.xs.datatypes.ByteList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class researchpage {
	WebDriver driver;
	
	By btn_informatique= By.xpath("//a[@class='dropdown-item']");
	By btn_software= By.xpath("//ul[@class='category-sub-menu']//a[contains(text(),'Logiciel')]");
	By btn_relevance=By.xpath("//button[@class='btn-unstyle select-title']");
	By btn_decreasingprice=By.xpath("//a[normalize-space()='Prix, décroissant']");
	
	public researchpage (WebDriver driver) {
		this.driver = driver;
	}
	public void clickoninformatiquebutton() {
		driver.findElement(btn_informatique).click();
	}
	public void clickonsoftwarebutton() {
		driver.findElement(btn_software).click();
	}
	public void clickonbtnrelevance() {
		driver.findElement(btn_relevance).click();
	}
	public void clickondecreasingprice() {
		driver.findElement(btn_decreasingprice).click();
	}
	
}
