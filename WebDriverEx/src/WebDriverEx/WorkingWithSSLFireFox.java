package WebDriverEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class WorkingWithSSLFireFox {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium_Demp\\geckodriver.exe");
		FirefoxProfile firefoxProfile=new FirefoxProfile();
		firefoxProfile.setAssumeUntrustedCertificateIssuer(true);
		WebDriver driver=new FirefoxDriver(firefoxProfile);
		driver.get("http://axisbank.com");
		driver.close();
		driver.quit();
		
		
				
		
	}

}
