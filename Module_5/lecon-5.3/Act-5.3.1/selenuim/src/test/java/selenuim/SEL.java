package selenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SEL {

	public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("http://demo.guru99.com/test/newtours/");
	        WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
	        registerLink.click();
	        driver.findElement(By.xpath("/html/body")).click();
	        WebElement FirstnameField = driver.findElement(By.name("firstName"));
	        WebElement LastnameField = driver.findElement(By.name("lastName"));
	        WebElement phoneField = driver.findElement(By.name("phone"));
	        WebElement mailField = driver.findElement(By.name("userName"));
	        WebElement addressField = driver.findElement(By.name("address1"));
	        WebElement cityField = driver.findElement(By.name("city"));
	        WebElement stateField = driver.findElement(By.name("state"));
	        WebElement postalecodeField = driver.findElement(By.name("postalCode"));
	        WebElement countryField = driver.findElement(By.name("postalCode"));
	        WebElement usernameField = driver.findElement(By.name("email"));
	        WebElement passewordField = driver.findElement(By.name("password"));
	        WebElement confirmpassewordField = driver.findElement(By.name("confirmPassword"));
	        FirstnameField.sendKeys("dorsaf");
	        LastnameField.sendKeys("othmen");
	        phoneField.sendKeys("27948635");
	        mailField.sendKeys("dorsafothmen12@gmail.com");
	        addressField.sendKeys("city ghazala ariana tunis");
	        cityField.sendKeys("cité ghazala");
	        stateField.sendKeys("ariana");
	        postalecodeField.sendKeys("2053");
	        countryField.sendKeys("tunisia");
	        usernameField.sendKeys("dorsafothmen12@gmail.com");
	        passewordField.sendKeys("dodododo27948.!");
	        confirmpassewordField.sendKeys("dodododo27948.!");
	        WebElement submitButton = driver.findElement(By.name("submit"));
	        submitButton.click();
	        WebElement registerLink1 = driver.findElement(By.linkText("SIGN-OFF"));
	        registerLink1.click();
	        WebElement registerLink11 = driver.findElement(By.linkText("SIGN-ON"));
	        registerLink11.click();
	        WebElement usernameField1 = driver.findElement(By.name("userName"));
	        WebElement passewordField1 = driver.findElement(By.name("password"));
	        usernameField1.sendKeys("dorsafothmen12@gmail.com");
	        passewordField1.sendKeys("dodododo27948.!");
	        WebElement submitButton1 = driver.findElement(By.name("submit"));
	        submitButton1.click();
	       
	}

}
