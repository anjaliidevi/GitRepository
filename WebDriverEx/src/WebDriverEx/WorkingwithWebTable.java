package WebDriverEx;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithWebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		//To maximize the Window
		Driver.manage().window().maximize();
		//To get browser
		Driver.get("http://apps.qaplanet.in/WebApp/AssertXPath.html");
		//To get Row Count
		int rc=Driver.findElements(By.xpath("//table/tbody/tr")).size();
		System.out.println(rc);
		//To get Coloumn count
		int colc=Driver.findElements(By.xpath("//table/tbody/tr[1]/td")).size();
		System.out.println(colc);
		//To get cell count
		int cc=Driver.findElements(By.xpath("//table/tbody/tr/td")).size();
		System.out.println(cc);
		//using for loop get data from cell data
		for(int i=1;i<=rc;i++)
		{
			for(int j=1;j<=colc;j++)
			{
				//To get cell data
				 String text = Driver.findElement(By.xpath("//table[@id='idCourse']/tbody/tr["+i+"]/td["+j+"]")).getText();
				 System.out.println(text);
			}
			
			
		}
		
		
	}

}
