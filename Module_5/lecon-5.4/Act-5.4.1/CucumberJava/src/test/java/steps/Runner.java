package steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\dothmen\\Documents\\Talan-Academy\\Module_5\\lecon-5.4\\Act-5.4.1\\CucumberJava\\src\\test\\resources\\features" , glue={"steps"} , strict = true  )

public class Runner {

}
