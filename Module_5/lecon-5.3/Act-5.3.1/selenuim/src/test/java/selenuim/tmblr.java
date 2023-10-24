package selenuim;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tmblr {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
       
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(" https://www.tumblr.com/login");
        WebElement emailField = driver.findElement(By.name("email"));
        WebElement motdepasseField = driver.findElement(By.name("password"));
        emailField.sendKeys("dorsaf.othmen@talan.com");
        motdepasseField.sendKeys("dodododo27948.!");
        driver.findElement(By.className("EvhBA")).click();
        
        WebElement textButton = driver.findElement(By.xpath("//button[@class='FOqaP']"));
        textButton.click();
       
        WebElement insertextField = driver.findElement(By.xpath("//p[@class='block-editor-rich-text__editable block-editor-block-list__block wp-block is-selected wp-block-paragraph rich-text']"));
        insertextField.sendKeys("hello, this is my first post on tumblr");
        driver.findElement(By.xpath("//*[@id=\"glass-container\"]/div/div/div/div/div/div/div[2]/div/div[3]/div/div/div/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"glass-container\"]/div[2]/div[2]/div/div[2]/button[1]/span")).click();
        


        


        
	}
	
}
