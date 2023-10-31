package my;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RunWebApplication {
 @Test
 
 public void OpenWebApplication() throws MalformedURLException {
	 DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"virtualdevice2023");
		WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().version("114.0.5735.90").setup();
		caps.setCapability("chromedriverExecutable",WebDriverManager.chromedriver().getBinaryPath());
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.get("http://mytek.tn");
	}
	
}
