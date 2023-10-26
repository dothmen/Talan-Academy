package steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\resources\\featurs\\creaCompte.feature" , glue={"steps"} , strict = true  )


public class Runner {

}
