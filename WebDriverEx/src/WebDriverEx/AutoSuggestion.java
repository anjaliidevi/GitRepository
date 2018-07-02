package WebDriverEx;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestion {
public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://google.com/");
	//Enter selenium in search box
	WebElement E=driver.findElement(By.id("lst-ib"));
	E.sendKeys("selenium");
	//find ul wth class property
	WebElement UL=driver.findElement(By.className("sbsb_b"));
	List<WebElement> Lic=UL.findElements(By.tagName("li"));
	//using iterator object we can get all the list of suggestions what we can show in List
	Iterator<WebElement> Itr=Lic.iterator();
	System.out.println("---------------");
	while(Itr.hasNext())
	{
		Thread.sleep(2000);
		WebElement LiI=Itr.next();
		String data=LiI.findElement(By.cssSelector("#sbse10 > div.sbqs_c > b")).getText();
		System.out.println("---------------------");
		if(data.equals("selenium webdriver"))
		{
			LiI.click();
			break;
		}
		
	}
	
	
}
}
