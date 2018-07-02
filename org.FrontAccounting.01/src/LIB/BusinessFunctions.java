package LIB;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BusinessFunctions {
	WebDriver Brow;
	WebDriverWait wait;
	WebElement ObjUn;
	WebElement ObjPwd;
	WebElement ObjCmpy;
	//Driver Configurations
	public void ConfigDriver(String Browser)
	{
		if(Browser.equals("FireFox"))
		{
			System.setProperty("webdriver.firefox.driver","D:\\Selenium_Demp\\geckodriver.exe");
			Brow=new FirefoxDriver();
				}
		else if (Browser.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver","D:\\Selenium_Demp\\IEDriverServer_Win32_3.11.1\\IEDriverServer.exe");
			Brow=new InternetExplorerDriver();
				}
		else if (Browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
			Brow=new ChromeDriver();
			}
		else
		{
			System.out.println("Invalid Browser");
		}
		wait=new WebDriverWait(Brow,30);
		Brow.manage().window().maximize();
	}
	//close Browser
	public void CloseBrowser(){
		Brow.close();
	}
	//quit object
	public void QuitObject()
	{
		Brow.quit();
	}
	//open Application
	public void OpenApp(String URL)
	{
		Brow.get(URL);
		wait.until(ExpectedConditions.titleIs("FrontAccounting 2.4.2 - Login"));
		//verify Homepage
		assertEquals(Brow.getTitle(),"FrontAccounting 2.4.2 - Login");
		Reporter.log("Homepage is Displlyed");
		//Create object for User name and Password,company
		ObjUn=Brow.findElement(By.name("user_name_entry_field"));
		ObjPwd=Brow.findElement(By.name("password"));		
		//verify username and password,commpany
		assertTrue(ObjUn.isDisplayed()&& ObjPwd.isDisplayed());
		assertTrue(ObjCmpy.isDisplayed());
		Reporter.log("user name and password.companyh Exist");
	}
	//login the application
	public void LoginFrontAccount(String Username,String Password)
	{
		ObjUn.sendKeys(Username);
		ObjPwd.sendKeys(Password);
		Select ObjSel=new Select(ObjCmpy);
		ObjSel.selectByIndex(0);
		//click on Login
		Brow.findElement(By.name("SubmitUser")).click();
		wait.until(ExpectedConditions.titleIs("Main Menu"));
		//verify FrontAccounting page
		assertEquals(Brow.getTitle(),"Main Menu");
		Reporter.log("FrontAccount is Displyed");
		//get sales is Displyed
		WebElement Sales=Brow.findElement(By.xpath("//a[1]"));
		assertTrue(Sales.isDisplayed());
		Reporter.log("sales is Displyed");
		WebElement Purchases=Brow.findElement(By.xpath("//a[2]"));
		assertTrue(Purchases.isDisplayed());
		Reporter.log("purchese is Displyed");
		WebElement II=Brow.findElement(By.xpath("//a[3]"));
		assertTrue(II.isDisplayed());
		Reporter.log("II is Displyed");
		WebElement Manufact=Brow.findElement(By.xpath("//a[4]"));
		assertTrue(Manufact.isDisplayed());
		Reporter.log("Manufactures is Displued");
		WebElement FA=Brow.findElement(By.xpath("//a[5]"));
		assertTrue(FA.isDisplayed());
		Reporter.log("Fixed Asserts is Displyed");
		WebElement Dimensions=Brow.findElement(By.xpath("//a[6]"));
		Reporter.log("Dimenssions is Displued");
		WebElement BCL=Brow.findElement(By.xpath("//a[7]"));
		assertTrue(BCL.isDisplayed());
		Reporter.log("Banking and general Ledger is Displyed");
		WebElement SetUp=Brow.findElement(By.xpath("//a[8]"));
		assertTrue(SetUp.isDisplayed());
		Reporter.log(" SetUp is Displyed");
		WebElement DB=Brow.findElement(By.xpath("//table[@class='logoutBar']/descendant::a[1]"));
		assertTrue(DB.isDisplayed());
		Reporter.log("DashBoard is Dislued");
		WebElement Perfe=Brow.findElement(By.xpath("//table[@class='logoutBar']/descendant::a[2]"));
		assertTrue(Perfe.isDisplayed());
		Reporter.log("Performences is Displued");
		WebElement Cp=Brow.findElement(By.xpath("//table[@class='logoutBar']/descendant::a[3]"));
		assertTrue(Cp.isDisplayed());
		Reporter.log("Chang Password is Displyed");
		WebElement Hlp=Brow.findElement(By.xpath("//table[@class='logoutBar']/descendant::a[4]"));
		assertTrue(Hlp.isDisplayed());
		Reporter.log("Help is Displyed");
		WebElement LogOut=Brow.findElement(By.xpath(""));
		assertTrue(LogOut.isDisplayed());
		Reporter.log("Logout is Displyed");
	}
	
		//Logout App
		public void LogoutApp()
		{
			//logout form Application
			Brow.findElement(By.className("shortcut")).click();
			wait.until(ExpectedConditions.titleIs("Logout"));
			
		}
		
		
		
		
		
	}
	
				
	
	

