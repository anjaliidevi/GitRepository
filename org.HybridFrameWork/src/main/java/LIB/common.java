package LIB;

import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class common {
	WebDriver driver;
	Actions A;
	WebDriverWait wait;
	WebElement e;
	Alert Alt;
	
	public void StartBrowser(String Browser)
	{
		if(Browser.equals("chrome"))
				{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\QAP26\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
				}
		else if(Browser.equals("Firefox"))
		{
			System.setProperty("webdriver.Firefox.driver","D:\\Selenium_Demp\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else
		{
			System.out.println("Invalid Browser");
		}
				
	}
	public WebElement FindElementByLocaters(String Identifiers,String Locaters)
	{
		WebElement e=null;
		switch (Identifiers) {
		case "id":
			e=driver.findElement(By.id(Locaters));			
			break;
		case "TagName":
			e=driver.findElement(By.tagName(Locaters));
			break;
		case "className":
			e=driver.findElement(By.className(Locaters));
			break;
		case "name":
			e=driver.findElement(By.name(Locaters));
			break;
		case "LinkText":
			e=driver.findElement(By.linkText(Locaters));
			break;
		case "PartiallinkText":
			e=driver.findElement(By.partialLinkText(Locaters));
			break;
		case "xpath":
			e=driver.findElement(By.xpath(Locaters));
			break;
		case "cssSelector":
			e=driver.findElement(By.cssSelector(Locaters));
			default:
			break;
		
		}return e;
	
	}
	//url of the page
	public void url(String URL)
	{
		driver.get(URL);
	}
	//To maximizw the browser
	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}
	//To verify Titel 
	public void VerifyTitle(String Title)
	{
		if(driver.getTitle().equals(Title))
		{
			System.out.println(Title + "is Displyed");
		}
		else
		{
			System.out.println(Title + "is not Displyed");
		}
	}
	//To verify element is present or not 
	public void verifyElementPresent(String Locaters)
	{
	wait=new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Locaters)));
	}
	//TO clear the textbox
	public void clear(String Identifiers,String Locaters)
	{
		WebElement e=FindElementByLocaters(Identifiers, Locaters);
		e.clear();
	}
	//To send The keys through the webElement
	public void sendkeys(String Identifiers,String Locaters,String content)
	{
		WebElement e=FindElementByLocaters(Identifiers, Locaters);
		e.sendKeys(content);
	}
	//To login the page
	public void click(String Identifiers,String Locaters)
	{
		WebElement e=FindElementByLocaters(Identifiers, Locaters);
		e.click();
	}
	//To verify text in webpage
	public void verifyText(String Locaters,String text)
	{
		wait=new WebDriverWait(driver, 40);
		if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(Locaters), text)))
				{
			System.out.println(text+"is Displyed");
				}
		else
		{
			System.out.println(text+"is not Displyed");
		}
		}
	//To verify the element is present
	public void VerifyElement(String Identifiers,String Locaters,String Element)
	{
		WebElement e=FindElementByLocaters(Identifiers, Locaters);
		if(e.isDisplayed())
		{
			System.out.println(Element +" is present");
		}
		else
		{
			System.out.println(Element + "is not present");
		}
	}
	
	//switch  to frame by using locaters
	public void SwitchToFrame(String Locaters)
	{
		driver.switchTo().frame(Locaters);
		System.out.println("Switch to iframe");
	}
	//Switch To parent Frame
	public void SwitchToParentFrame()
	{
		driver.switchTo().defaultContent();
	}
	//Start Actions
	public void StartAction()
	{
		A=new Actions(driver);
	}
		//Move To Element
	public void MouseOver(String Identifiers,String Locaters)
	{
		
		WebElement e=FindElementByLocaters(Identifiers, Locaters);
		A.moveToElement(e).build().perform();
	}
	//For message box
	public void messagebox(String Identifiers,String Locaters)
	{
		String  str=FindElementByLocaters(Identifiers, Locaters).getText();
		System.out.println(str);
	}
	
	public void Alert()
	{
	driver.switchTo().alert();
	wait =new WebDriverWait(driver, 30);
	Alt=wait.until(ExpectedConditions.alertIsPresent());
	
	Alt.accept();
	}
	//Wait For Sometime
	public void Thread(long millions) throws Exception
	{
		Thread.sleep(millions);
	}
	//wait for page load
	public void  waitForPageLoad()
	{
		try {
			for(int i=0;i<50;)
			{
				if(driver.getTitle().length()!=0)
				{
					System.out.println("pageloaded");
					i=51;
					break;
				}
				else
				{
					Thread.sleep(1000);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void verifyInTableAndclickonIt(String value)
	{
		for(int i=1;i<=50;i++)
		{
			String empname=driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[3]/a")).getText();
			if(empname.equals(value))
			{
				driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[3]/a")).click();
				System.out.println(value+"is Displyed");
				break;
			}
		}
		
	}
	// verify element in table using for loop and click on that element**********************************
			public void verifyElementInTableandClick(String text)
			{
		         int rc = driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr")).size();
		         System.out.println("Rows size is :"+rc);
		         int i;
		         for(i=1; i<=rc; i++)
		         {
		        	 String Name = driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[3]/a")).getText();
		        	 if(Name.equals(text))
		        	 {
		        		 System.out.println(text+"was displayed");
		        		 driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[3]/a")).click();
		        		 break;
		        	 }
		         }
			}
	
	public void calender(String xpathLocater)
	{
		List<WebElement> caldata=driver.findElements(By.xpath(xpathLocater));
		for(int i=1;i<caldata.size();i++)
		{
			if(caldata.get(i).getText().equals("17"))
			{
				caldata.get(i).click();
				break;
			}
		}
	}
	public void checkbox(String LocName)
    {   
   	
   	 int rc=driver.findElements(By.xpath("//table/tbody/tr")).size();
   	 System.out.println(rc);
   	 for(int i=1;i<=rc;i++)
   	 {
   	 WebElement checkbox=driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[1]/input"));
   		String name=driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[3]/a")).getText();
   		System.out.println(name);
   	 if(name.equals(LocName))
   	 {
   		 System.out.println("name displayed" +LocName);
   		 checkbox.click();
   	 //break;
   		 
   	 }
   	 else
   	 {
   		 System.out.println("name not displayed" +LocName);
   	 }
   	
    }}

	// verify element in table using for loop and click on that element**********************************
			public void EditByusingName(String text)
			{
		         int rc = driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr")).size();
		         System.out.println("Rows size is :"+rc);
		         int i;
		         for(i=1; i<=rc; i++)
		         {
		        	 String Name = driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[3]/a")).getText();
		        	 if(Name.equals(text))
		        	 {
		        		 System.out.println(text+"was displayed");
		        		 driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[3]/a")).click();
		        		 break;
		        	 }
		         }
			}
			

			//Delete Multiple 
			
//Delete Multiple Names
	public void MultpleCheckboxes(String xpath)
	{
		List<WebElement> checkboxes=driver.findElements(By.xpath(xpath));
		Iterator<WebElement> Itr=checkboxes.iterator();
		while(Itr.hasNext())
		{
			WebElement E=Itr.next();
			E.click();
		}
		
	}
	//select data from drop down
	public void Dropdown(String Identifiers, String Locaters,String value)
	{
		e=FindElementByLocaters(Identifiers, Locaters);
		Select sel=new Select(e);
		sel.selectByVisibleText(value);
	}
	//To Refresh The page
	public void Refresh()
	{
		driver.navigate().refresh();
	}
	//close the Browser
	public void close()
	{
		driver.close();
	}
	//quit object
	public void quit()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
