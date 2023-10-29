/*package teststeps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testpages.logintestpage;
import testpages.updatepage;

public class updatestep {
    WebDriver driver;
    logintestpage loginPage;
     updatepage update;

   @Before
      public void  browsersetup() {
    	System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\divers\\chromedriver.exe") ;
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    	driver=new ChromeDriver();
    }
    @After
      public void tearDown();
    
    @When("click on information button")
	  public void click_on_information_button() {
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		update = new updatepage (driver);
	    update.clickoninformation();
	}

	@When("user delete old first name")
	  public void user_delete_old_first_name() {
	    update.userClearsTextField();
	}

	@When("^user writes(.*)and(.*)$")
	  public void user_writes_newfirstname_and_Password(String newfirstname, String Password) {
	    System.out.println("user writes newfirstname and Password" );
	    update = new updatepage (driver);
	    update.writesnewfirstname(newfirstname);
	    update.writesPassword(Password);
	}

	@When("click to pic message")
	  public void click_to_pic_message() {
	    update.clicktopicmessage();
	}

	@When("click to pic confidentiality")
	public void click_to_pic_confidentiality() {
	    update.clicktopicconfidentiality();
	}

	@When("click to save button")
	  public void click_to_save_button() {
	    update.clickonsavebutton();
	}

	@Then("update new first name is successful")
	  public void update_new_first_name_is_successful() {
	    
	}

	@Then("update new first name is not successful")
	public void update_new_first_name_is_not_successful() {
	    update.checkerrortext();
	}
}*/
