package steps;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


 
@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\resources\\features\\login.page.feature" , glue={"steps"} ,strict=true, tags ="@tag1" )

public class Runner {

}