package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.creatpage;

public class creatsteps {

	WebDriver driver;
	creatpage login;

	@Given("user on register page")
	public void user_on_register_page() {
		System.out.println("inside step-user is on login page");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/divers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.navigate().to("https://www.coquette.tn/connexion?create_account=1");
		driver.manage().window().maximize();
	}

	@When("^user enters name (.*)$")
	public void user_enters_name_name(String name) {
		System.out.println("inside step-user enters name");
		login = new creatpage(driver);
		login.entername(name);

	}
	@When("^user enters lastname (.*)$")
	public void user_enters_lastname_lastname(String lastname) {
		System.out.println("inside step-user enters lastname");
		login = new creatpage(driver);
		login.enterlastName(lastname);

	}

	@When("^user enters password (.*)$")
	public void user_enters_password_password(String password) {
		System.out.println("inside step-user enters email");
		login = new creatpage(driver);
		login.enterMotdepasse(password);

	}

	@When("^user enters email (.*)$")
	public void user_enters_email_email(String email) {
		System.out.println("inside step-user enters email");
		login= new creatpage (driver);
		login.enteremail(email);
	}
	@When("^user enters birthday (.*)$")
		public void user_enters_birthday_birthday(String birthday) {
			System.out.println("inside step-user enters birthday");
			login= new creatpage (driver);
			login.enterdatedenaissance(birthday);
	}
	@When("user click on inscrition button")
	public void user_click_on_inscrition_button() {
		login = new creatpage(driver);
		login.clickcreatonaccount();
	}

	@Then("account is created")
	public void account_is_created() {
		login.checkText();
	}

	

}
