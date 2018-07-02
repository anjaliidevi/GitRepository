package WebDriverEx;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadFile_FireFox {
 
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","D:\\Selenium_Demp\\geckodriver.exe");
	      FirefoxProfile profile= new FirefoxProfile();
	     
              //Accept SSL certificate errors
	      profile.setAcceptUntrustedCertificates(true);
	      profile.setAssumeUntrustedCertificateIssuer(true);
		 
	      //Download a file in FF browser
	      profile.setPreference("browser.download.folderList", 2);
	      profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		  
	      profile.setPreference("browser.download.dir", "C:\\Downloads"); 
	      profile.setPreference("browser.download.defaultFolder","C:\\Downloads"); 
	      profile.setPreference("browser.download.manager.showWhenStarting", false);
	      //Set MIME types
	      profile.setPreference("browser.helperApps.neverAsk.saveToDisk","multipart/x-zip,application/zip,application/x-zip-compressed,application/x-compressed,application/msword,application/csv,text/csv,image/png ,image/jpeg, application/pdf, text/html,text/plain,  application/excel, application/vnd.ms-excel, application/x-excel, application/x-msexcel, application/octet-stream" );
		  
	      FirefoxDriver driver =  new FirefoxDriver(profile);
              driver.get("http://the-internet.herokuapp.com/download");
              Thread.sleep(2000);
	      driver.findElement(By.linkText("some-file.txt")).click();
     }
}