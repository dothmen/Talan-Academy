package selenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tmblr {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get(" https://www.tumblr.com/login");
        WebElement emailField = driver.findElement(By.name("email"));
        WebElement motdepasseField = driver.findElement(By.name("password"));
       
       
        emailField.sendKeys("dorsaf.othmen@talan.com");
        motdepasseField.sendKeys("dodododo27948.!");
        driver.findElement(By.className("EvhBA")).click();
        
        driver.findElement(By.className("ADK9v,FOqaP")).click();
        


        
	}
	
}
