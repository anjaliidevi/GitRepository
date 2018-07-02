package BusinessFunctions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ElementLocaters.jxlfile;
import LIB.common;


public class Employee {
	common brow;
	jxlfile read;
	 public Employee(common x,jxlfile y){
		 brow=x;
		 read=y;
	 }
	@Test
	public void LoginApp() throws IOException, Exception
	
	{   read.jxlFile();
		read.exl("D:\\OrangeHRM.xls");
		
		String browsername=read.ReadDataFromxls(0, 1);
		String username=read.ReadDataFromxls(2,1);
		String password=read.ReadDataFromxls(3, 1);
		String url=read.ReadDataFromxls(1, 1);
		
		
		
		brow.StartBrowser(browsername);
		brow.url(url);
		//To maximize The Browser
		brow.maximizeBrowser();
		brow.VerifyTitle("OrangeHRM - New Level of HR Management");
		//wait for Some Time
		brow.Thread(2000);
		//To verify username present or not
		brow.VerifyElement("className","loginText","username");
		//To clear the username textfield
		brow.clear("name","txtUserName");
		brow.sendkeys("name", "txtUserName",username);
		//To verify password is present or not 
		brow.VerifyElement("xpath","//td/input[@name='txtPassword']","password");
		//To clear The password Testfield
		brow.clear("name", "txtPassword");
		brow.sendkeys("name","txtPassword",password);
		//To verify The login button presnt or not
		brow.VerifyElement("name", "Submit","login");
		//To click on the login button
		brow.click("name", "Submit");
		brow.waitForPageLoad();
		//To verify Title of homepage
		brow.VerifyTitle("OrangeHRM");
		//To verity text in webpage
		brow.verifyText("//ul[@id='option-menu']/li[1]", "Welcome qaplanet1");
		//Wait For someTime
		brow.Thread(1000);
		//To verify Logout elment in home page
		brow.VerifyElement("xpath", "//ul[@id='option-menu']/li[3]/a","logout");
		//To Click on logout
		brow.click("xpath","//ul[@id='option-menu']/li[3]/a");
		//After Logout  Verify The title
		brow.Thread(2000);
		brow.VerifyTitle("OrangeHRM - New Level of HR Management");
		//To close The Browser
		brow.close();
		//To quit The object
		brow.quit();
		
	}
	
	
	public void AddEmplyee() throws Exception
	
	{
		read.jxlFile();
		read.exl("D:\\OrangeHRM.xls");
		String FirstName=read.ReadDataFromxlsShee2(0, 1);
		String LastName=read.ReadDataFromxlsShee2(1,1);
		String EmployeName=read.ReadDataFromxlsShee2(2,1);
		
		//To maximize The Browser
		brow.maximizeBrowser();
		//Verify PIM prsent or not 
		brow.VerifyElement("xpath","//ul[@id='nav']/li[@id='pim']/a/span","PIM");
		//mouse over to PIM
		brow.StartAction();
		//moveto pim
		brow.MouseOver("xpath", "//ul[@id='nav']/li[@id='pim']/a/span");
		//wait For someTime
		brow.Thread(1000);
		//To click on Add Employee
		brow.click("xpath","//li[@id='pim']/ul/li[2]/a/span");
		//Wait For Some Time To load The page
		brow.waitForPageLoad();
		//Wait for Some Time
		brow.Thread(2000);
		//switch to frame
		brow.SwitchToFrame("rightMenu");
		//get code from the webpage
		String code=brow.FindElementByLocaters("id", "txtEmployeeId").getAttribute("value");
		System.out.println(code);
		//click on save button
		brow.click("className", "savebutton");
		//Alert Handling
		brow.Alert();
		//verify LastName name presnt or not
		brow.VerifyElement("id","txtEmpLastName","LastName");
		//To clear the LastName
		brow.clear("id","txtEmpLastName");
		//sendkeys to LastName
		brow.sendkeys("id","txtEmpLastName",LastName);
		//click on save button
		brow.click("className", "savebutton");
		//To handle alert
		brow.Alert();
		//verify First name presnt or not
		brow.VerifyElement("xpath","//input[@id='txtEmpFirstName']","FirstName");
		//To clear FirstName
	    brow.clear("xpath","//input[@id='txtEmpFirstName']");
		//wait for some time
		brow.Thread(3000);
		//sendkeys to FirstName
		brow.sendkeys("xpath","//input[@id='txtEmpFirstName']",FirstName);
		
		
		}
	public void PhotFile() throws AWTException
	{
		Robot rt=new Robot();
		WebElement photoText=brow.FindElementByLocaters("id", "photofile");
		photoText.click();
		brow.waitForPageLoad();
		//load path of any file
		StringSelection ss=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Tulips.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);		
		rt.delay(1000);
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_V);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		rt.delay(1000);
		//click on save button
		brow.click("className", "savebutton");
		brow.SwitchToParentFrame();
		//Verify PIM prsent or not 
				brow.VerifyElement("xpath","//ul[@id='nav']/li[@id='pim']/a/span","PIM");
				//mouse over to PIM
				brow.StartAction();
				//moveto pim
				brow.MouseOver("xpath", "//ul[@id='nav']/li[@id='pim']/a/span");
				
		//click on Employe list
				brow.click("xpath", "//li[@id='pim']/ul/li[1]/a/span");
				brow.close();
				brow.quit();		
	}
	public void EditE() throws Exception
	{
		//Verify PIM prsent or not 
		brow.VerifyElement("xpath","//ul[@id='nav']/li[@id='pim']/a/span","PIM");
		//mouse over to PIM
		brow.StartAction();
		//moveto pim
		brow.MouseOver("xpath", "//ul[@id='nav']/li[@id='pim']/a/span");
		
//click on Employe list
		brow.click("xpath", "//li[@id='pim']/ul/li[1]/a/span");
		//switch to frame
		brow.SwitchToFrame("rightMenu");
		brow.FindElementByLocaters("LinkText","2").click();
	brow.verifyElementInTableandClick("Maha addala");
	//To verify edit button present or not
	brow.VerifyElement("className", "editbutton","Edit" );
	//To click on Edit button
	brow.click("className", "editbutton");
	//To click on Data Of Birth
	brow.VerifyElement("name","btnDOB","Date of Birth");
	//click on Date of birth
	brow.click("name","btnDOB");
	//get our date from calender
	brow.calender("//table[@class='yui-calendar y2018']/tbody/tr/td");
	//select for gender
	brow.click("id", "gender2");
	//To click on save
	brow.click("className","savebutton");
	brow.close();
	brow.quit();	

	}
	public void DeleteEmploye()
	{
		//Verify PIM prsent or not 
				brow.VerifyElement("xpath","//ul[@id='nav']/li[@id='pim']/a/span","PIM");
				//mouse over to PIM
				brow.StartAction();
				//moveto pim
				brow.MouseOver("xpath", "//ul[@id='nav']/li[@id='pim']/a/span");
				
		//click on Employe list
				brow.click("xpath", "//li[@id='pim']/ul/li[1]/a/span");
				//switch to frame
				brow.SwitchToFrame("rightMenu"); 
		//To select multiple checkboxes
				brow.FindElementByLocaters("LinkText","2").click();
		brow.checkbox("Maha addala");
		//verify Delete Element present or not
		brow.VerifyElement("xpath", "//div[@class='actionbuttons']/input[2]", "Delete");
		//click on Delete
		brow.click("xpath", "//div[@class='actionbuttons']/input[2]");
		//get message from webpage
		brow.messagebox("xpath","//div[@class='messagebar']");
		
	}

}
