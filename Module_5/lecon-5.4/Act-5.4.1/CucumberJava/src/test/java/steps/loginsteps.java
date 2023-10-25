package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginpages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class loginsteps {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Initialize the web driver (e.g., ChromeDriver)
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dothmen\\Documents\\Talan-Academy\\Module_5\\lecon-5.4\\Act-5.4.1\\cucumber\\test\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  		driver.get("https://www.tumblr.com/login");
    }


  	

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

		// Exécute un clic JavaScript sur un élément
		WebElement emailfiled = driver.findElement(By.name("email"));
		jsExecutor.executeScript("email.click();", emailfiled);
		//WebElement emailField = driver.findElement(By.name("email"));
		WebElement motdepasseField = driver.findElement(By.name("password"));
		emailfiled.sendKeys("dorsaf.othmen@talan.com");
		//motdepasseField.sendKeys("dodododo27948.!");

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    WebElement homeLink = driver.findElement(By.className("EvhBA"));
	    homeLink.click();
	}


}
