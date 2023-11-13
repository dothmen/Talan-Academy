package teststeps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testpages.addcommentpage;
import testpages.addpage;
import testpages.logintestpage;
import testpages.researchpage;
import testpages.updatepage;




public class steps {
	
	 WebDriver driver;
	 logintestpage login;
	 updatepage update;
	  researchpage research;  
	  addpage add;
	  addcommentpage addcomment;
	     @Before
	      public void  browsersetup() {
	    	System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\divers\\chromedriver.exe") ;
	    	driver=new ChromeDriver();
	    	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    	driver.manage().window().maximize();
	    }
	    @After
	      public void tearDown() {
		}
	    
   @Given("login page is open")
       public void login_page_is_open() {
	       System.out .println("inside step-user is on login page"); 
	       driver.navigate().to("http://technopro.tn/connexion?back=my-account");
	       
}

   @When("^user enters(.*)and(.*)$")
       public void user_enters_email_password(String email ,String password) {
	     System.out.println("user enters email and password");
	     login = new logintestpage (driver);
	     login.enterusername(email);
         login.enterpassword(password);
  
}

   @When("clicks on login  button")
        public void clicks_on_login_button() {
          login.clicklogin();
}

   @Then("user is navigated to the home page")
       public void user_is_navigated_to_the_home_page() {
    
}

    @Then("user recived error message")
         public void user_recived_error_message() {
         login.checktext();
}
    @When("click on information button")
	  public void click_on_information_button() {
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

	
	@When("user wants to search for the cheapest software")
	public void user_wants_to_search_for_the_cheapest_software() {
	    
	}

	@When("user click on informatique button")
	public void user_click_on_informatique_button() {
		research = new researchpage (driver);
	    research.clickoninformatiquebutton();
	}

	@When("choose the category user click on software button")
    public void choose_the_category_user_click_on_software_button() {
      research.clickonsoftwarebutton();
}

	@When("click on relevance button and click on decreasing price")
	public void click_on_relevance_button_and_click_on_decreasing_price() {
	    research.clickonbtnrelevance();
	    research.clickondecreasingprice();
	}

	@Then("user chooses the software that suits them")
	public void user_chooses_the_software_that_suits_them() {
	    
	}

    @When("the user clicks on technopro")
      public void the_user_clicks_on_technopro() {
    	add= new addpage (driver);
       add.clickontechnopro();
    }
    @When("the user clicks on the product he wants to buy")
    public void the_user_clicks_on_the_product_he_wants_to_buy() {
		add = new addpage (driver);
	
		add.clickonproduct();;
	}

	@When("click on add to Cart")
	public void click_on_add_to_Cart() {
	    add = new addpage(driver);
	    add.clickonaddtocart();
	}

	@Then("Product added to cart successfully")
	public void product_added_to_cart_successfully() {
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		add = new addpage(driver);
		add.cheakaddtext();
	}
	@When("user click on add a comment")
	public void user_click_on_add_a_comment() {
	    addcomment.clickonaddcommentbutton();
	}

	@When("enter title and comment")
	public void enter_title_and_comment() {
	   addcomment.entercomment();
	   addcomment.entertitle();
	}

	@When("click on submit button")
	public void click_on_submit_button() {
	   addcomment.clickonsubmitbutton();
	}

	@Then("submit comment is successful")
	public void submit_comment_is_successful() {
	   addcomment.checktext();
	}

}


