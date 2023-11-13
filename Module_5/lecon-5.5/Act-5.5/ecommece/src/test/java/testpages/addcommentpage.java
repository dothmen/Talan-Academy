package testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addcommentpage {
	WebDriver driver;
	By btn_addcomment=By.cssSelector(".btn.btn-comment.btn-comment-big.post-product-comment");
	By txt_title=By.xpath("//input[@name='comment_title']");
	By txt_comment=By.xpath("//textarea[@name='comment_content']");
	By btn_submit=By.xpath("//button[normalize-space()='Envoyer']");
	By checktext=By.xpath("//div[@id='product-comment-posted-modal']//h2[1]");
	
	public addcommentpage (WebDriver driver) {
		this.driver= driver;
	}
	public void clickonaddcommentbutton() {
		driver.findElement(btn_addcomment).click();
	}
	public void entertitle() {
		driver.findElement(txt_title).sendKeys("Avis");
	}
	public void entercomment() {
		driver.findElement(txt_comment).sendKeys("bon produit");
	}
	public void clickonsubmitbutton() {
		driver.findElement(btn_submit).click();
	}
	public void checktext() {
		driver.findElement(checktext).isDisplayed();
	}
	}


