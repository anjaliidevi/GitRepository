package WebDriverEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class MouseOver {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium_Demp\\geckodriver.exe");
		FirefoxDriver Driver=new FirefoxDriver();
		//To maximize the Window
		Driver.manage().window().maximize();
		//To get browser
		Driver.get("http://apps.qaplanet.in/qahrm");
		Driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		Driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		Driver.findElement(By.name("Submit")).click();
		//Action Commands on Orange HRM of PIM
		Actions A=new Actions(Driver);
		//Move to PIM mouse over
		WebElement PIM=Driver.findElement(By.id("pim"));
		//Mouse on PIM
		A.moveToElement(PIM).perform();
		Thread.sleep(2000);
		Driver.findElement(By.linkText("Add Employee")).click();
		WebElement Admin=Driver.findElement(By.id("admin"));
		A.moveToElement(Admin).perform();
		Thread.sleep(2000);
		WebElement ClientInfo=Driver.findElement(By.linkText("Company Info"));
		A.moveToElement(ClientInfo).perform();
		Thread.sleep(2000);
		Driver.findElement(By.linkText("General")).click();
		//Logout
		Driver.findElement(By.linkText("Logout"));
		
		
		
		
		
		
	}

}
