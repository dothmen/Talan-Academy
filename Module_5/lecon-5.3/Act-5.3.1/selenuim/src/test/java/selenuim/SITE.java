package selenuim;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SITE {

	public static void main(String[] args) {
		    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	        ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	        driver.get("https://www.blueisland.tn/login?back=identity");	
	        
	        WebElement usernameField = driver.findElement(By.name("email"));
	        usernameField.sendKeys("dorsafothmen12@gmail.com");
	        WebElement passewordField = driver.findElement(By.name("passwd"));
	        passewordField.sendKeys("Dodo27948.!");
	       
	        driver.findElement(By.name("SubmitLogin")).click();
	        WebElement prénomField = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
	        prénomField.clear();
	        prénomField.sendKeys("souha");
	        WebElement passewordField1 = driver.findElement(By.xpath("//*[@id=\"old_passwd\"]"));
	        passewordField1.sendKeys("Dodo27948.!");
	        driver.findElement(By.name("submitIdentity")).click();
	}	

}
