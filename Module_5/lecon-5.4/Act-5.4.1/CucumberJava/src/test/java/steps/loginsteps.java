package steps;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginpages;


public class loginsteps {
    WebDriver driver;
    loginpages login;

   @Given("browser is open") 
   public void browser_is_open() {
	   
	 System.out .println("inside step-user is on login page"); 
	   
	  System.setProperty("webdriver.chrome.driver", "src/test/resources/divers/chromedriver.exe") ;
	  driver=new ChromeDriver();
	  driver.navigate().to("https://www.tumblr.com/login");
	  driver.manage().window().maximize();
	  
	 
	  
	  
   } 
   
   @When("^user enters(.*)and(.*)$")
   public void user_enters_email_and_password(String email, String password) {
	   System.out.println("inside Step-user enters email and password");
	   login = new loginpages (driver);
	   login.enterusername(email);
	   login.enterpassword(password);
	   
   }
   @And("clicks on login  button")
   public void clicks_on_login_button() {
	   System.out.println("inside step_user enters email and password");
	   login.clicklogin();
	   
   }
   
   @Then("user is navigated to the home page")
   public void user_is_navigated_to_the_home_page() {
       // Write code here that turns the phrase above into concrete actions
       throw new io.cucumber.java.PendingException();
   }
   }
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   // @Before
   // public void setUp() {
        // Initialize the web driver (e.g., ChromeDriver)
      //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\dothmen\\Documents\\Talan-Academy\\Module_5\\lecon-5.4\\Act-5.4.1\\cucumber\\test\\chromedriver.exe");
      //  driver = new ChromeDriver();
      //  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  	//	driver.get("https://www.tumblr.com/login");
  //  }


  	

	//@When("user enters {string} and {string}")
	//public void user_enters_and(String string, String string2) {
		//JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

		// Exécute un clic JavaScript sur un élément
		//WebElement emailfiled = driver.findElement(By.name("email"));
		//jsExecutor.executeScript("email.click();", emailfiled);
		//WebElement emailField = driver.findElement(By.name("email"));
		//WebElement motdepasseField = driver.findElement(By.name("password"));
		//emailfiled.sendKeys("dorsaf.othmen@talan.com");
		//motdepasseField.sendKeys("dodododo27948.!");

	//}

	//@Then("user is navigated to the home page")
	//public void user_is_navigated_to_the_home_page() {
	  // homeLink = driver.findElement(By.className("EvhBA"));
	  //  homeLink.click();
	//}


//}
