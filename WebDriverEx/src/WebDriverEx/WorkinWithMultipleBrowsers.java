package WebDriverEx;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkinWithMultipleBrowsers {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","D:\\Selenium_Demp\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://qaplanet.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='social']/li[4]/a")).click();
		Thread.sleep(2000);
		Set<String> IDS=driver.getWindowHandles();
		//way1
		for(String ID:IDS)
		{
			System.out.println(ID);
		}
		//way2
		Iterator<String> ITR=IDS.iterator();
		String Fir_ID=ITR.next();
		String Sec_ID=ITR.next();
		//switch to second Browser
		driver.switchTo().window(Sec_ID);
		Thread.sleep(3000);
		// click on  sign in 
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		//Enter Email
		driver.findElement(By.name("session_key")).sendKeys("qaplanet@gmail.com");
		Thread.sleep(1000);
		// close browser
		driver.close();
		Thread.sleep(1000);
		//Switch to parent Browser
		driver.switchTo().window(Fir_ID);
		//Execute code
		Thread.sleep(2000);
		//click on Just Dial Icon
		driver.findElement(By.xpath("//ul[@class='social']/li[5]/a")).click();
		//Execute code
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
