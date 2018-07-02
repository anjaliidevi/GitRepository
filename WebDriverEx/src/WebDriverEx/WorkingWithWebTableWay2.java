package WebDriverEx;



import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingWithWebTableWay2 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Demp\\chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		//To maximize window
	      Driver.manage().window().maximize();
		//To get url
		Driver.get("http://apps.qaplanet.in/WebApp/AssertXPath.html");
		Thread.sleep(2000);	
		List<WebElement> TDS=Driver.findElements(By.xpath("//table/tbody/tr/td"));
		System.out.println(TDS.size());
		// using iterator get cell data
		Iterator<WebElement> IT=TDS.iterator();
		while(IT.hasNext())
		{
			WebElement TD=IT.next();
			System.out.println(TD.getText());
			
		}
		//using For Each
		for(WebElement TD:TDS)
		{
			System.out.println(TD.getText());
		}
	}

}
