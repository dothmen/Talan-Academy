package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginpage;

public class loginSteps {
	
	WebDriver driver;
	 loginpage login;
   @Given("user in home page")
	 public void user_in_home_page() {
	    System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\divers\\chromedriver.exe");
	    driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://www.parashop.tn/");

	 }

   @When("click on connexion butten")
	 public void click_on_connexion_butten() {
		 login = new loginpage (driver);
	     login.clickconnexion();
	 }

   @When("^user enters(.*) and (.*)$")
	 public void user_enters_Email_and_Password_Email_and_password(String Email, String Password) {
		 System.out.println("inside Step-user enters email and password");
		   login = new loginpage (driver);
		   login.enterEmail(Email);
		   login.enterPassword(Password);
	 }
   @When("clicks on connexion button")
	 public void clicks_on_connexion_button() {
		 login = new loginpage (driver);
	     login.clickvalidatebutton();
	 }
@Then("user is navigated to the profil page")
	 public void user_is_navigated_to_the_profil_page() {
	     
	 }

	
   @Then("user recived error message")
	 public void user_recived_error_message() {
	   
	 }
}

	

/*@Given("user in login  page")
public void user_in_login_page(){
	System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\divers\\chromedriver.exe") ;
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://www.decathlon.tn/");

}

@When("^user enters(.*)$")
public void user_enters_email_Email(String Email) {
	System.out.println("inside Step-user enters email ");
	   login = new loginpage (driver);
	   login.enterEmail(Email);

}

@When("click on next button")
public void click_on_next_button(String Email) {
	   login = new loginpage (driver);
	   login.clicknextbutton();


}

@When("^user enters(.*)$")
public void user_enters_password_Password(String Password) {
	System.out.println("inside Step-user enters password");
	   login = new loginpage (driver);
	   login.enterPassword(Password);

}

@When("clicks on validate button")
public void clicks_on_validate_button() {
	login = new loginpage (driver);
	   login.clickvalidatebutton();
}

@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() {
	
}

@Then("user recived invalid Email")
public void user_recived_invalid_Email() {
	login.checktextvalidemail();
  
}

@Then("user recived invalid Password")
public void user_recived_invalid_Password() {
   login.checktextinvalidpassword();

}*/

