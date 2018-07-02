package WebDriverEx;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WorkingWithSSLChrome {
	public static void main(String[] args) {
		File file=new File("D:\\Selenium_Demp\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());	
		DesiredCapabilities capabilty=DesiredCapabilities.chrome();
		capabilty.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		WebDriver driver=new ChromeDriver(capabilty);
		driver.get("http://axisbank.com/");	
		
		
	}
	

}
